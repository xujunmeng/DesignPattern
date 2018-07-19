package 桥接模式;

import 桥接模式.形状.Circle;
import 桥接模式.形状.Shape;
import 桥接模式.绘画.GreenCircle;
import 桥接模式.绘画.RedCircle;

/**
 * @author james
 * @date 2018/7/19
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}
