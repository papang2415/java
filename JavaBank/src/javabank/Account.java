package javabank;

public class Account {

    String name;
    int num;
    int amt;
    private AccountType type;

    Account(String name, int num, int amt, AccountType type) {
        this.name = name;
        this.num = num;
        this.amt = amt;
        int bonusValue = calculateInitialBonusValue(amt);
        this.type = type;
    }

    private int calculateInitialBonusValue(int amt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Account() {
    }

    public Account(AccountType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nAccount Type: " + "type=" + this.type + super.toString();
    }

}
