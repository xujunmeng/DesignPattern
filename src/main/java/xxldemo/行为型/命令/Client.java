package xxldemo.行为型.命令;

/**
 * @author james
 * @date 2020/6/28
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Light light = new Light();

        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        invoker.setOnCommand(lightOnCommand, 0);
        invoker.setOffCommand(lightOffCommand, 0);

        invoker.onButtonWasPushed(0);
        invoker.offButtonWasPushed(0);
    }

}
