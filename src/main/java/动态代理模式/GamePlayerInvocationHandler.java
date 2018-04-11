package 动态代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理处理器类
 * 由于代理是动态产生的，所以不需要再声明代理类。
 * Created by james on 2018/4/10.
 */
public class GamePlayerInvocationHandler implements InvocationHandler {

    //被代理的对象
    private Object obj;

    //将需要代理的实例通过处理器类的构造方法传递给代理。
    public GamePlayerInvocationHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;

        if ("login".equals(method.getName())) {
            //这个在主题方法不受任何影响的情况下，在主题方法前后添加新的功能，或者增强主题方法，
            //从侧面切入从而达到扩展的效果的编程，就是面向切面编程(AOP Aspect Oriented Programming)。
            //AOP并不是新技术，而是相对于面向对象编程的一种新的编程思想。在日志，事务，权限等方面使用较多。

            System.out.println("代理登录游戏！");

            result = method.invoke(this.obj, args);
            return result;
        }
        result = method.invoke(this.obj, args);
        return result;
    }
}
