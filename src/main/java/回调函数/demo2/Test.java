package 回调函数.demo2;

/**
 * 回调测试
 * @author james
 * @date 2018/11/7
 */
public class Test {

    public static void main(String[] args) {

        Caller caller = new Caller();
        caller.call(new ICalllBack() {
            @Override
            public void callBack() {
                System.out.println("终于回调成功了...");
            }
        });


    }

}
