package 桥接模式.绘画;

/**
 * 画绿圈
 * @author james
 * @date 2018/7/19
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}