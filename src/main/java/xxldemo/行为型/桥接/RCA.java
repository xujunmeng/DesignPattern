package xxldemo.行为型.桥接;

/**
 * @author james
 * @date 2020/6/28
 */
public class RCA extends TV {
    @Override
    void on() {
        System.out.println("RCA.on()");
    }

    @Override
    void off() {
        System.out.println("RCA.off()");
    }

    @Override
    void tuneChannel() {
        System.out.println("RCA.tuneChannel()");
    }
}
