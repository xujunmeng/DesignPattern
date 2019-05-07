package 工厂设计模式.抽象工厂;

/**
 * @author james
 * @date 2019/5/7
 */
public interface CarFactory {

    // 创建发动机
    Engine createEngine();

    // 创建座椅
    Chair createChair();

}
