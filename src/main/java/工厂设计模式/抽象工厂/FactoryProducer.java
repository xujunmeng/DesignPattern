package 工厂设计模式.抽象工厂;

/**
 * @author james
 * @date 2018/7/18
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }

        return null;
    }
}