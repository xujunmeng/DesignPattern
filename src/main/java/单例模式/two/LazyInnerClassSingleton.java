package 单例模式.two;

/**
 * 防止反射破坏单例模式
 * @author james
 * @date 2020/8/25
 */
public class LazyInnerClassSingleton {

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

}
