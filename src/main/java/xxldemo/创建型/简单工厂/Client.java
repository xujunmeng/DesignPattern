package xxldemo.创建型.简单工厂;

/**
 * @author james
 * @date 2020/6/24
 */
public class Client {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(1);
        // do something with the product
    }

}
