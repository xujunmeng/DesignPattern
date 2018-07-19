package 建造者模式;

import 建造者模式.冷饮.Coke;
import 建造者模式.冷饮.Pepsi;
import 建造者模式.汉堡.ChickenBurger;
import 建造者模式.汉堡.VegBurger;

/**
 * 负责创建 Meal 套餐对象
 * @author james
 * @date 2018/7/19
 */
public class MealBuilder {

    /**
     * 准备素食汉堡,可口可乐套餐
     * @return
     */
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 准备鸡肉汉堡,百事可乐套餐
     * @return
     */
    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
