import java.util.Currency;

public class Main {
    public static void main(String[] args) {
        Money money1 = new Money("Dinar","Visa",150);
        Money money2 = new Money("Euro","MasterCard", 200);

        Wallet wallet1 = new Wallet(money1);
        Wallet wallet2 = new Wallet(money2);

        System.out.println("In the wallet 1- " + wallet1.getMoney());
        System.out.println("In the wallet 2- " + wallet2.getMoney());



    }
}