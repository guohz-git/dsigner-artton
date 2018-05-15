package adapter;

public class MediaAdapter implements  MediaPlayer {


    AdvancedMediaPlayer mp4Player = null;
    AdvancedMediaPlayer vlcPlayer = null;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("FLV")){
            if(vlcPlayer == null){
                vlcPlayer = new VlcPlayer();
            }
            vlcPlayer.playVlc(fileName);
        }else if (audioType.equalsIgnoreCase("MP4")){
            if(mp4Player == null){
                mp4Player = new Mp4Player();
            }
            mp4Player.playMp4(fileName);
        }else{
            System.out.println("播放器不支持此格式");
        }
    }
}
