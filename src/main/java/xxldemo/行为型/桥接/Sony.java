package xxldemo.行为型.桥接;

/**
 * @author james
 * @date 2020/6/28
 */
public class Sony extends TV {
    @Override
    void on() {
        System.out.println("Sony.on()");
    }

    @Override
    void off() {
        System.out.println("Sony.off()");
    }

    @Override
    void tuneChannel() {
        System.out.println("Sony.tuneChannel()");
    }
}
