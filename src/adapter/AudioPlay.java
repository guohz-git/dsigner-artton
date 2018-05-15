package adapter;

public class AudioPlay implements MediaPlayer {
    MediaAdapter mediaAdapter;

    public AudioPlay(){
        mediaAdapter = new MediaAdapter();
    }
    @Override
    public void play(String audioType, String fileName) {
        mediaAdapter.play(audioType,fileName);
    }
}
