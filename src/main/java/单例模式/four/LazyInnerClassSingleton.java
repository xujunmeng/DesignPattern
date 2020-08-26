package 单例模式.four;

import java.io.Serializable;

/**
 * 防止序列化破坏单例模式
 * @author james
 * @date 2020/8/25
 */
public class LazyInnerClassSingleton implements Serializable {

    //私有的构造方法
    private LazyInnerClassSingleton() {
        //防止反射创建多个对象
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    //公有的获取实例方法
    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    //静态内部类
    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

    //防止序列化创建多个对象，这个方法是关键
    private Object readResolve() {
        return LazyHolder.LAZY;
    }

}
