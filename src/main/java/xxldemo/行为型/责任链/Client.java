package xxldemo.行为型.责任链;

/**
 * @author james
 * @date 2020/6/24
 */
public class Client {

    public static void main(String[] args) {

        Handler handler1 = new ConcreteHandler1(null);
        Handler handler2 = new ConcreteHandler2(handler1);

        handler2.handleRequest(RequestType.TYPE1);
    }

}
