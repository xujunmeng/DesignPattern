package 回调函数.demo4;

/**
 * @author james
 * @date 2018/11/7
 */
public class People {

    /**
     * 同步回调
     */
    public void goToPrintSyn(Callback callback, String text) {
        new Printer().print(callback, text);
    }

    /**
     * 异步回调
     */
    public void goToPrintASyn(Callback callback, String text) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                new Printer().print(callback, text);
            }
        }).start();
    }

}
