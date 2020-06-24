package xxldemo.行为型.责任链;

/**
 * @author james
 * @date 2020/6/24
 */
public abstract class Handler {

    protected Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    protected abstract void handleRequest(RequestType requestType);



}
