package 适配器模式.增强播放器;

/**
 * mp4播放器
 * @author james
 * @date 2018/7/19
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }
}
