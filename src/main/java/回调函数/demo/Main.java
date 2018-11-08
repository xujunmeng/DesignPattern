package 回调函数.demo;

/**
 * @author james
 * @date 2018/11/7
 */
public class Main {

    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        Student s = new Student("小明");
        s.callHelp(a, b);

    }

}
