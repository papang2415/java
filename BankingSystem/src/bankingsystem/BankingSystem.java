package bankingsystem;

public class BankingSystem {

    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        Account acc = new Account(1254, new Name("Mr", "Naziel", "Torres", "Razonado", "Jr"),
                new MyDate(22, 11, 1999), new MyDate(01, 03, 2021), 1000);

        Account acc1 = new Account(1355, new Name("Mr", "Leniel", "Torres", "Razonado", "Sr"),
                new MyDate(12, 10, 2002), new MyDate(05, 01, 2021), 500);

        System.out.print("#Create Account#");
        System.out.println(acc.toString());
        
        System.out.print("#Deposit#");
        acc.deposit(500);
        System.out.println(acc.toString());
        
        System.out.print("#Withdraw#");
        acc.withdraw(400);
        System.out.println(acc.toString());
        
        System.out.print("#Create new Account#");
        System.out.println(acc1.toString());
        
        System.out.print("#Transfer money to another account#");
        acc.transfer(acc1, 500);
        System.out.println(acc1.toString());
    }
}
