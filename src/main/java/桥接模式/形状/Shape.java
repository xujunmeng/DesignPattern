package 桥接模式.形状;

import 桥接模式.绘画.DrawAPI;

/**
 * 抽象类
 * @author james
 * @date 2018/7/19
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();

}
