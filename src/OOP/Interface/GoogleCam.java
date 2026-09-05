package OOP.Interface;

public class GoogleCam implements Camera{
    @Override
    public void takePhoto() {
        System.out.println("Taking Photo with GCam Interface");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video With GCam Interface");
    }

    @Override
    public void start() {
        System.out.println("Starting the Google Camera");
    }
}
