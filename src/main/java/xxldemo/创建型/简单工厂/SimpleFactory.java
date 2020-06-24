package xxldemo.创建型.简单工厂;

/**
 * @author james
 * @date 2020/6/24
 */
public class SimpleFactory {

    public Product createProduct(int type) {
        if (type == 1) {
            return new ConcreteProduct();
        }
        return new ConcreteProduct();
    }

}
