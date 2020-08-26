package 装饰者模式;

/**
 * @author james
 * @date 2020/8/11
 */
public class TestMain {

    public static void main(String[] args) {

        test3();


    }

    public static void test1() {
        //购买一个煎饼
        ABattercake aBattercake = new Battercake();

        System.out.println(aBattercake.getDesc());
        System.out.println(aBattercake.cost());
    }

    public static void test2() {
        //购买一个加鸡蛋的煎饼
        ABattercake aBattercake = new Battercake();
        EggDecorator eggDecorator = new EggDecorator(aBattercake);

        System.out.println(eggDecorator.getDesc());
        System.out.println(eggDecorator.cost());
    }

    public static void test3() {
        //购买一个加两个鸡蛋和一根香肠的煎饼
        ABattercake aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc());
        System.out.println(aBattercake.cost());
    }

}
