package xxldemo.行为型.桥接;

/**
 * @author james
 * @date 2020/6/28
 */
public abstract class RemoteControl {

    protected TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    abstract void on();

    abstract void off();

    abstract void tuneChannel();
}
