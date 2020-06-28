package xxldemo.行为型.命令;

/**
 * @author james
 * @date 2020/6/28
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
