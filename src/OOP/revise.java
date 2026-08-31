package OOP;

public class revise {
    static void main() {
        PC vivek_fedora = new PC("Ryzen 7 7700x", "RTX 3090", "DDR5 32GB");
        System.out.println(vivek_fedora.CPU+ vivek_fedora.GPU+vivek_fedora.RAM);
        for (int i = 0; i < 1000000; i++) {
            vivek_fedora = new PC("Ryzen 7 7700x", "RTX 3090", "DDR5 32GB");
        }
    }
}
class PC{
    String CPU;
    String GPU;
    String RAM;
    PC(String CPU, String GPU, String RAM){
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Obj is Destroyed");
    }
}
