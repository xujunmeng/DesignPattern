package 动态代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理场景类
 * Created by james on 2018/4/10.
 */
public class Client {

    public static void main(String[] args) {

        IGamePlayer gp = new GamePlayer();

        InvocationHandler gpHandler = new GamePlayerInvocationHandler(gp);

        //获取真实主题类的ClassLoader
        ClassLoader classLoader = gp.getClass().getClassLoader();

        //动态产生一个代理者。
        Class<?>[] clazz = new Class[]{IGamePlayer.class};

        IGamePlayer proxyGp = (IGamePlayer)Proxy.newProxyInstance(classLoader, clazz, gpHandler);

        Person person = new Person("张三", 25);
        proxyGp.login(person);
        proxyGp.killBoss(person);
        proxyGp.upGrade(person);

        //在此，我们没有创建代理类，但是确实有代理类帮我们完成事情。
    }

}
