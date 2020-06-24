package xxldemo.行为型.责任链;

/**
 * @author james
 * @date 2020/6/24
 */
public class ConcreteHandler2 extends Handler {

    public ConcreteHandler2(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(RequestType requestType) {
        if (requestType == RequestType.TYPE2) {
            System.out.println("is handle by ConcreteHandler2");
            return;
        }
        if (successor != null) {
            successor.handleRequest(requestType);
        }
    }
}
