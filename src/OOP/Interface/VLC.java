package OOP.Interface;

public class VLC implements MediaPlayer {
    @Override
    public void playMusic() {
        System.out.println("Playing Hi-Res Media with VLC");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing 4k Video with VLC");
    }

    @Override
    public void start() {
        System.out.println("Starting VLC Media Player");
    }
}
