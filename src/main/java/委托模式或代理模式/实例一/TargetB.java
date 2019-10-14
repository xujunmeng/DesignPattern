package 委托模式或代理模式.实例一;

/**
 * 员工A和员工B（真正做事的人）做自己擅长的工作
 * @author james
 * @date 2019/10/14
 */
public class TargetB implements ITarget {

    @Override
    public void doSomething(String command) {
        System.out.println("我是员工B，现在开始干 : " + command);
    }
}
