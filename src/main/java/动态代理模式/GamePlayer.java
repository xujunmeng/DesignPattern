package 动态代理模式;

/**
 * 需要被代理类
 * Created by james on 2018/4/10.
 */
public class GamePlayer implements IGamePlayer{

    @Override
    public void login(Person person) {
        System.out.println("登录名为 : " + person.getName() + " 进入游戏, 登录成功");
    }

    @Override
    public void killBoss(Person person) {
        System.out.println(person.getName() + " 击杀了Boss!");
    }

    @Override
    public void upGrade(Person person) {
        System.out.println(person.getName() + " 升级了!");
    }
}
