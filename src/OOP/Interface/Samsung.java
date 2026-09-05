package OOP.Interface;

public class Samsung {
    private Camera camera;
    private MediaPlayer mediaPlayer;

    Samsung(){
        camera = new GoogleCam();
        mediaPlayer = new VLC();
    }

    void takePhoto(){
        camera.takePhoto();
    }
    void recordVideo(){
        camera.recordVideo();
    }
    void startCamera(){
        camera.start();
    }

    void startMediaPlayer(){
        mediaPlayer.start();
    }
    void playMusic(){
        mediaPlayer.playMusic();
    }
    void playVideo(){
        mediaPlayer.playVideo();
    }
}
