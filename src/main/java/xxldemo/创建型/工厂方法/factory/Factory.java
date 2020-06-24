package xxldemo.创建型.工厂方法.factory;

import xxldemo.创建型.工厂方法.product.Product;

/**
 * @author james
 * @date 2020/6/24
 */
public abstract class Factory {

    abstract public Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
        // do something with the product
    }

}
