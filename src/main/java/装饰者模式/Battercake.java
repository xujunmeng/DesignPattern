package 装饰者模式;

/**
 * 煎饼类，继承了煎饼抽象类
 * @author james
 * @date 2020/8/11
 */
public class Battercake extends ABattercake {

    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
