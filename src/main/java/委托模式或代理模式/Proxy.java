package 委托模式或代理模式;

/**
 * 代理类
 * Created by james on 2018/4/10.
 */
public class Proxy implements Subject {

    //要代理那个实现类
    private Subject subject;

    //默认被代理者
    public Proxy() {
        this.subject = new RealSubject();
    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    //预处理
    private void before() {
        System.out.println("before");
    }

    //后处理
    private void after() {
        System.out.println("after");
    }

}
