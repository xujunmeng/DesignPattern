package 动态代理模式;

/**
 * 动态代理：就是实现阶段不用关系代理是哪个，而在运行阶段指定具体哪个代理。
 * Created by james on 2018/4/10.
 */
public interface IGamePlayer {

    //登录游戏
    void login(Person person);

    //击杀Boss
    void killBoss(Person person);

    //升级
    void upGrade(Person person);

}
