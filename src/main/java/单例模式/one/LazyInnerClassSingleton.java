package 单例模式.one;

/**
 * @author james
 * @date 2020/8/25
 */
public class LazyInnerClassSingleton {

    //私有的构造方法
    private LazyInnerClassSingleton() {

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
