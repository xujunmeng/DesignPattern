package 工厂设计模式.抽象工厂;

/**
 * @author james
 * @date 2019/5/7
 */
public class JiLiFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    @Override
    public Chair createChair() {
        return new ChairA();
    }
}
