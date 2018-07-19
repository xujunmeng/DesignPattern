package 建造者模式.包装;

/**
 * 用瓶子包装
 * @author james
 * @date 2018/7/18
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "瓶子包装";
    }
}