package javabank;

public class TestBank {

    public static void main(String[] args) {
        Account a1 = new Account("Dexter", 1500, 300, AccountType.SAVINGS);
        System.out.println(a1);
    }
}
