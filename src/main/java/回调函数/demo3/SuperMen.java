package 回调函数.demo3;

/**
 * @author james
 * @date 2018/11/7
 */
public class SuperMen {

    public void add(String str, DoOtherWork doOtherWork) {
        System.out.println("执行打印功能 : " + str);

        doOtherWork.doWork("laskdjkalsdjf");
    }

}
