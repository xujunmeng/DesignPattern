package 建造者模式.冷饮;

/**
 * @author james
 * @date 2018/7/19
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
