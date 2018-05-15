package adapter;

public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlay audioPlay = new AudioPlay();

        audioPlay.play("mp4","xxx.mp4");

        audioPlay.play("flv","xxx.flv");

        audioPlay.play("mp3","xxx.mp3");
    }
}
