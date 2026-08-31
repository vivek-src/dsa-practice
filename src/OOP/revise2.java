package OOP;

import java.util.Arrays;

public class revise2 {
    static void main() {
        Keyboard f75 = new Keyboard("Cherry Brown", "Cherry Profile", true, new String[]{"Bluetooth", "Dongle", "Wired"});
        Keyboard MXmaster = new Keyboard("Sicssor", "Low Profile ", true, new String[]{"Bluetooth", "Dongle", "Wired"});
        System.out.println(f75);
        System.out.println(MXmaster);
        // Common for all the objects of Keyboard Clas
        System.out.println("Total No. of Boards:  "+Keyboard.boardCount);
    }

}
class Keyboard{
    String switchType;
    String profile;
    boolean dial;
    String[] modes;
    //Common for all objects of this class
    static int boardCount;


    Keyboard(String swt, String profile, boolean dial, String[] modes ){
        this.switchType = swt;
        this.profile = profile;
        this.dial = dial;
        this.modes = modes;
        Keyboard.boardCount += 1;

    }
    @Override
    public String toString() {
        return "Switch Type : " + switchType + "\n" +
                "Key Profile : " + profile + "\n" +
                "Volume Dial : " + dial + "\n" +
                "Connectivity Modes: " + Arrays.toString(modes);
    }
}