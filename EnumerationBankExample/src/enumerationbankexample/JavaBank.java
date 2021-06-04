package enumerationbankexample;

public class JavaBank {

    public enum AccountType {
        SAVINGS,
        CREDIT
    }

    public class Account {
        String name;
        int num;
        int amt;
        private AccountType type;

        Account(String name, int num, int amt, AccountType type) {
//            super(name, num, (amt + calculateInitialBonusValue(amt)));
            int bonusValue = calculateInitialBonusValue(amt);
            this.type = type;
        }

        public Account(AccountType type) {
            this.type = type;
        }

        private int calculateInitialBonusValue(int amt) {
           return 0;
        }
    }

}
