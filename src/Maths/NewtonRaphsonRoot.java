package Maths;

public class NewtonRaphsonRoot {
    static void main() {
        System.out.println(sqrt(40));

    }
    static  double sqrt(int n){
        double x = n;
        double root;
        while( true){
            root = (x + n / x) / 2;

            if(Math.abs(root - x) < 0.5){
                break;
            }
            x = root;
        }
        return root;
    }
}
