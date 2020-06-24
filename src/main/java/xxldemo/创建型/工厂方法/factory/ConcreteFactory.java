package xxldemo.创建型.工厂方法.factory;

import xxldemo.创建型.工厂方法.product.ConcreteProduct;
import xxldemo.创建型.工厂方法.product.Product;

/**
 * @author james
 * @date 2020/6/24
 */
public class ConcreteFactory extends Factory {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }

}
