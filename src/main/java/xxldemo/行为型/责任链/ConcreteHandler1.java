package xxldemo.行为型.责任链;

/**
 * @author james
 * @date 2020/6/24
 */
public class ConcreteHandler1 extends Handler {

    public ConcreteHandler1(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(RequestType requestType) {
        if (requestType == RequestType.TYPE1) {
            System.out.println("handle by ConcreteHandler1");
            return;
        }

        if (successor != null) {
            successor.handleRequest(requestType);
        }
    }
}
