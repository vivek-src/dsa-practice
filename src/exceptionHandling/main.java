package exceptionHandling;

public class main {
    static void main() {
        int a = 10;
        int b = 1;
        //Divide by zero exception
        try {
            Divide(a,b);
            if (true){
                throw new CustomExcpetion("This is a custom Exception");
            }
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This will Always Execute in Try Catch Block");
        }
    }
    static int Divide(int a , int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Can't Divide by Zero");
        }
        return a / b;
    }
}
