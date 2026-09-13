package CustomArrayList;

import java.util.ArrayList;

public class LambdaFunctions {
    static void main() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i*2);
        }

        // Similar to arrow function in JS
        arr.forEach((item)-> System.out.println(item - 1));
        Operation sum = (a, b) -> a + b;
        Operation diff = (a, b) -> a - b;
        Operation prod = (a, b) -> a * b;

        LambdaFunctions Calc = new LambdaFunctions();
        System.out.println(Calc.calc(10,20,sum));
        System.out.println(Calc.calc(10,20,diff));
        System.out.println(Calc.calc(10,20,prod));

    }

    private int calc(int a, int b , Operation op){
        return op.opertation(a ,b);
    }


}
interface Operation{
    int opertation(int a, int b);
}
