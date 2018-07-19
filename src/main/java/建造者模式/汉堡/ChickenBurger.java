package 建造者模式.汉堡;

/**
 * @author james
 * @date 2018/7/19
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
