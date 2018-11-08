package 回调函数.demo4;

/**
 * @author james
 * @date 2018/11/7
 */
public class Printer {

    public void print(Callback callback, String text) {
        System.out.println(Thread.currentThread().getName() + " 正在打印...");
        System.out.println(Thread.currentThread().getName() + " 打印的内容是 : " + text);
        try {
            System.out.println("当前线程 : " + Thread.currentThread().getName());
            Thread.sleep(10000);
        } catch (Exception e) {

        }
        callback.printFinished("打印完成");
    }

}
