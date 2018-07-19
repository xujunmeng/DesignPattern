package 建造者模式;

import 建造者模式.包装.Packing;

/**
 *
 * 表示食物条目和食物包装
 * Created by james on 2018/7/18.
 */
public interface Item {

    /**
     * 表示不同的名称
     * @return
     */
    String name();

    /**
     * 表示不同的包装
     * @return
     */
    Packing packing();

    /**
     * 表示不同的价格
     * @return
     */
    float price();

}
