package 适配器模式.增强播放器;

/**
 * vlc播放器
 * @author james
 * @date 2018/7/19
 */
public class VlcPlayer  implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
