package 建造者模式.包装;

/**
 *
 * 用纸包装
 * @author james
 * @date 2018/7/18
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "纸包装";
    }
}