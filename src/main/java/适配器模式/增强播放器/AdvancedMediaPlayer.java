package 适配器模式.增强播放器;

/**
 * 高级的媒体播放器
 * Created by james on 2018/7/19.
 */
public interface AdvancedMediaPlayer {

    /**
     * 播放vlc格式
     * @param fileName
     */
    void playVlc(String fileName);

    /**
     * 播放mp4格式
     * @param fileName
     */
    void playMp4(String fileName);

}
