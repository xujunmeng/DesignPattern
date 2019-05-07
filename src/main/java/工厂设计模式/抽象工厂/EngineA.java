package 工厂设计模式.抽象工厂;

/**
 * @author james
 * @date 2019/5/7
 */
public class EngineA implements Engine {

    @Override
    public void run() {
        System.out.println("转的快!");
    }

    @Override
    public void start() {
        System.out.println("启动快,自动档");
    }

}
