package xxldemo.行为型.桥接;

/**
 * @author james
 * @date 2020/6/28
 */
public class ConcreteRemoteControl1 extends RemoteControl {

    public ConcreteRemoteControl1(TV tv) {
        super(tv);
    }

    @Override
    void on() {
        System.out.println("ConcreteRemoteControl1.on()");
        tv.on();
    }

    @Override
    void off() {
        System.out.println("ConcreteRemoteControl1.off()");
        tv.off();
    }

    @Override
    void tuneChannel() {
        System.out.println("ConcreteRemoteControl1.tuneChannel()");
        tv.tuneChannel();
    }
}
