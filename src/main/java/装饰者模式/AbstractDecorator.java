package 装饰者模式;

/**
 * 抽象装饰类，抽象装饰类通过成员属性的方式将煎饼抽象类组合进来，同时也继承了煎饼抽象类，
 * 且这里定义了新的业务方法 doSomething()
 * @author james
 * @date 2020/8/11
 */
public abstract class AbstractDecorator extends ABattercake{

    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return aBattercake.cost();
    }
}
