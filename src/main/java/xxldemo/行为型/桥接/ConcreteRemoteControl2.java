package xxldemo.行为型.桥接;

/**
 * @author james
 * @date 2020/6/28
 */
public class ConcreteRemoteControl2 extends RemoteControl {

    public ConcreteRemoteControl2(TV tv) {
        super(tv);
    }

    @Override
    void on() {
        System.out.println("ConcreteRemoteControl2.on()");
        tv.on();
    }

    @Override
    void off() {
        System.out.println("ConcreteRemoteControl2.off()");
        tv.off();
    }

    @Override
    void tuneChannel() {
        System.out.println("ConcreteRemoteControl2.tuneChannel()");
        tv.tuneChannel();
    }
}
