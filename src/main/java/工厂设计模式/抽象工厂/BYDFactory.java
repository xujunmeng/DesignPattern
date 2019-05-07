package 工厂设计模式.抽象工厂;

/**
 * @author james
 * @date 2019/5/7
 */
public class BYDFactory implements CarFactory{

    @Override
    public Engine createEngine() {
        return new EngineB();
    }

    @Override
    public Chair createChair() {
        return new ChairB();
    }
}
