package 装饰者模式;

/**
 * 香肠装饰器，与鸡蛋装饰器类似，继承了抽象装饰类，在父类的基础上加一根香肠，同时价格增加2块钱
 * @author james
 * @date 2020/8/11
 */
public class SausageDecorator extends AbstractDecorator{

    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠 ";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
