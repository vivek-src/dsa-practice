package OOP;

public class Inheritance {
    static void main() {
        Transaction tx1 = new Transaction("0001", 1000);
        tx1.printReceipt();

        CreditCardTx tx2 = new CreditCardTx("0002",  2000, "Vivek",  "XXXX XXXX XXXX XXXX");
        tx2.printReceipt();

        Transaction tx3 = new Transaction("0003", 1000); // tx3 type is define by the Class not obj type
        tx3.printReceipt();
    }
}
class Transaction{
    String txId;
    double amount;

    public Transaction(String txId, double amount) {
        this.txId = txId;
        this.amount = amount;
    }

    public void printReceipt() {
        System.out.println("Receipt for ID " + txId + ": Amount : " + amount);
    }
}
class CreditCardTx extends Transaction{
    String cardholder;
    String cardNumber;

    public CreditCardTx(String txId, double amount, String cardholder, String cardNumber) {
        super(txId,amount);
        this.cardholder = cardholder;
        this.cardNumber = cardNumber;
    }

    @Override
    public void printReceipt() {
        super.printReceipt();
        System.out.println("Card Number : "+cardNumber+" Card Holder: "+cardholder);
    }
}