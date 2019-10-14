package 委托模式或代理模式.实例一;

/**
 * 领导下达命令
 * @author james
 * @date 2019/10/14
 */
public class Boss {

    public static void main(String[] args) {
        new Leader().doSomething("登录");
    }

}
