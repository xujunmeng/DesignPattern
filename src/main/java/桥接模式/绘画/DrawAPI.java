package 桥接模式.绘画;

/**
 * 绘画接口
 * Created by james on 2018/7/19.
 */
public interface DrawAPI {

    /**
     * 画圈的方法
     * @param radius 半径
     * @param x x轴
     * @param y y轴
     */
    void drawCircle(int radius, int x, int y);

}
