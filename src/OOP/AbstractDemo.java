package OOP;

public class AbstractDemo {
    static void main() {
        SavingAc ac1 = new SavingAc(1000, "Vivek", 1001);
        CurrentAc ac2 = new CurrentAc(1000, "Vivek", 1001);

        ac1.getDetails();
        ac2.getDetails();
        System.out.println(ac1.calculateInterest());
        System.out.println(ac2.calculateInterest());

    }
}
abstract class BankAc {
    int acNumber;
    int balance;
    String acHolder;

    public BankAc(int balance, String acHolder, int acNumber) {
        this.balance = balance;
        this.acHolder = acHolder;
        this.acNumber = acNumber;
    }
    // Concerete Method
    void getDetails(){
        System.out.printf("A/c holder name : %s , Ac Number : %d, Available Balance : %d",acHolder, acNumber, balance);
        System.out.println();
    }
    //Abstract method that ever subclass must implement
    abstract double calculateInterest();
}
class SavingAc extends BankAc{
    public SavingAc(int balance, String acHolder, int acNumber) {
        super(balance, acHolder, acNumber);
    }
    @Override
    double calculateInterest(){
        return balance*0.03;
    }
}
class CurrentAc extends BankAc{
    public CurrentAc(int balance, String acHolder, int acNumber) {
        super(balance, acHolder, acNumber);
    }
    double calculateInterest(){
        return balance*0.02;
    }
}