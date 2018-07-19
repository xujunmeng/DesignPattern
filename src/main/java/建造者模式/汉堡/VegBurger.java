package 建造者模式.汉堡;

/**
 * @author james
 * @date 2018/7/18
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "素食汉堡";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
