package 工厂设计模式.抽象工厂;

/**
 * @author james
 * @date 2019/5/7
 */
public class Client002 {

    public static void main(String[] args) {
        CarFactory carFactory=new JiLiFactory();
        Engine engine=carFactory.createEngine();
        Chair chair = carFactory.createChair();
        engine.run();
        engine.start();
        chair.run();
    }

}
