package OOP.Interface;

public class Main {
    static void main() {
        SmartPhone samsung = new SmartPhone();
        samsung.start();
        samsung.playMusic();
        samsung.takePhoto();

        Samsung s25 = new Samsung();
        s25.takePhoto();
        s25.playMusic();
        s25.startCamera();
        s25.playVideo();

    }
}