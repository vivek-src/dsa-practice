package OOP.Interface;

public class SmartPhone implements MediaPlayer,Camera {
    @Override
    public void takePhoto() {
        System.out.println("Taking a Photo..");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video..");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music..");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing Video..");
    }

    @Override
    public void start(){
        System.out.println("Starting the Camera..."); //Ambiguity of multiple methods in interface is solved here
        // But here you can't specify  whether to start camera or music player for that you can make class of interface and use them
    }
}
