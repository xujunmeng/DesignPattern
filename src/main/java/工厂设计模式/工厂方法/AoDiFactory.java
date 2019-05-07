package 工厂设计模式.工厂方法;

/**
 * @author james
 * @date 2019/5/7
 */
public class AoDiFactory implements CarFactory {

    @Override
    public Car createCar() {

        return new AoDi();
    }

}
