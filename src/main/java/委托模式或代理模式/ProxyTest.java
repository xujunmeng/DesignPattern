package 委托模式或代理模式;

/**
 * Created by james on 2018/4/10.
 */
public class ProxyTest {

    public static void main(String[] args) {
        Subject subject = new Proxy();


        subject.request();
    }

}
