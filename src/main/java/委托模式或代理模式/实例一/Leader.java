package 委托模式或代理模式.实例一;

import java.util.HashMap;
import java.util.Map;

/**
 * 项目经理持有所有的小组成员，根据一定的策略选择干活的人
 * @author james
 * @date 2019/10/14
 */
public class Leader {

    private Map<String, ITarget> targets = new HashMap<>();

    /**
     * 项目经理持有小组成员可供选择，类似策略模式
     */
    public Leader() {
        targets.put("加密", new TargetA());
        targets.put("登录", new TargetB());
    }

    public void doSomething(String command) {
        targets.get(command).doSomething(command);
    }

}
