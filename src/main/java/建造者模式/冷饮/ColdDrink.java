package 建造者模式.冷饮;

import 建造者模式.Item;
import 建造者模式.包装.Bottle;
import 建造者模式.包装.Packing;

/**
 * 冷饮条目
 * @author james
 * @date 2018/7/18
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
