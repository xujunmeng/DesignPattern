package 建造者模式.汉堡;

import 建造者模式.Item;
import 建造者模式.包装.Packing;
import 建造者模式.包装.Wrapper;

/**
 * 汉堡条目
 * @author james
 * @date 2018/7/18
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
