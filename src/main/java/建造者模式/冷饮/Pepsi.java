package 建造者模式.冷饮;

/**
 * @author james
 * @date 2018/7/19
 */
public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
