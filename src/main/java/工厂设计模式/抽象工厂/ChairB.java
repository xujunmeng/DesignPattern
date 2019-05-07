package 工厂设计模式.抽象工厂;

/**
 * @author james
 * @date 2019/5/7
 */
public class ChairB implements Chair{

    @Override
    public void run() {
        System.out.println("不能加热!");
    }

}
