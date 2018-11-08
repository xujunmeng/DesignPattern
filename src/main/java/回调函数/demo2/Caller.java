package 回调函数.demo2;

/**
 * 回调者（用于调用回调函数的类）
 * @author james
 * @date 2018/11/7
 */
public class Caller {

    public void call(ICalllBack calllBack) {
        System.out.println("start Caller.call ...");
        calllBack.callBack();
        System.out.println("end Caller.call ...");
    }

}
