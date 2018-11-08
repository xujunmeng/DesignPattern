package 回调函数.demo4;

/**
 * @author james
 * @date 2018/11/7
 */
public class Main {

    public static void main(String[] args) {

        XiaoMing xiaoMing = new XiaoMing();

        People people = new People();

        String text = "打印一份简历";

        System.out.println(Thread.currentThread().getName() + " 需要打印的内容是 ---> " + text);

        people.goToPrintASyn(xiaoMing.mobile, text);

        System.out.println(Thread.currentThread().getName() + " 我在等待打印机给我反馈");

    }

}
