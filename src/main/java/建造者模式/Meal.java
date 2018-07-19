package 建造者模式;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 套餐的概念
 * @author james
 * @date 2018/7/19
 */
public class Meal {

    private List<Item> items = Lists.newArrayList();

    /**
     * 给套餐添加条目
     * @param item
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * 获取套餐总价格
     * @return
     */
    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    /**
     * 展示套餐的详细信息
     */
    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }

}
