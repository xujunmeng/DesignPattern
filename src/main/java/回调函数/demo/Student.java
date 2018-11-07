package 回调函数.demo;

/**
 * @author james
 * @date 2018/11/7
 */
public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class DoHomeWork implements DoJob {

        @Override
        public void fillBlank(int a, int b, int result) {
            System.out.println(name + " 求助小红计算 : " + a + "+" + b + "=" + result);
        }
    }

    public void callHelp(int a, int b) {
        new SuperCalculator().add(a, b, new DoHomeWork());
    }
}
