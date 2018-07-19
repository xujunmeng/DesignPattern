package 工厂设计模式.抽象工厂;

/**
 * @author james
 * @date 2018/7/18
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
