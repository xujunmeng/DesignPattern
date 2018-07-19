package 适配器模式;

import 适配器模式.增强播放器.AdvancedMediaPlayer;
import 适配器模式.增强播放器.Mp4Player;
import 适配器模式.增强播放器.VlcPlayer;
import 适配器模式.普通播放器.MediaPlayer;

/**
 * MediaPlayer 接口的适配器类
 * @author james
 * @date 2018/7/19
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new VlcPlayer();
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playVlc(fileName);
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
