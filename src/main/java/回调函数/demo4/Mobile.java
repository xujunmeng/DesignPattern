package 回调函数.demo4;

/**
 * @author james
 * @date 2018/11/7
 */
public class Mobile implements Callback {

    @Override
    public void printFinished(String msg) {
        System.out.println("收到的信息 : " + msg);
    }
}
