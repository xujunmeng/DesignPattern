package 工厂设计模式.工厂方法;

/**
 * @author james
 * @date 2019/5/7
 */
public class Client {

    public static void main(String[] args) {

        CarFactory carFactory = new AoDiFactory();
        Car aodi = carFactory.createCar();
        aodi.run();

        JiLiFactory jiLiFactory = new JiLiFactory();
        Car jiLi = jiLiFactory.createCar();
        jiLi.run();


    }

}
