package 单例模式.two;

import java.lang.reflect.Constructor;

/**
 * 反射破坏单例模式
 *
 * 输出为false，说明内存地址不同，就是实例化了多次，破坏了单例模式的特性
 * @author james
 * @date 2020/8/25
 */
public class TestMain {

    public static void main(String[] args) {

        try {

            Class<LazyInnerClassSingleton> clazz = LazyInnerClassSingleton.class;

            //通过反射拿到私有的构造方法
            Constructor<LazyInnerClassSingleton> c = clazz.getDeclaredConstructor();

            //因为要访问私有的构造方法，这里要设为true，相当于让你有权限去操作
            c.setAccessible(true);

            //暴力初始化
            LazyInnerClassSingleton o1 = c.newInstance();

            //调用了两次构造方法，相当于new了两次
            LazyInnerClassSingleton o2 = c.newInstance();

            System.out.println(o1 == o2);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
