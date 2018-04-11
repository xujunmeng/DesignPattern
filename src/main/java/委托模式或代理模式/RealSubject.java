package 委托模式或代理模式;

/**
 * 真实主题类
 * Created by james on 2018/4/10.
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("RealSubject.request.....");
    }
}
