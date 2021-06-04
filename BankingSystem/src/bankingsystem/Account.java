package bankingsystem;

public class Account {

    private int accNum;
    private Name AccName;
    private MyDate accDateOpened;
    private MyDate birthdate;
    private double currentBalance;
    private double totalBalance;

    public Account() {
    }

    public Account(int accNum, Name AccName, double currentBalance) {
        this.accNum = accNum;
        this.AccName = AccName;
        this.totalBalance = this.currentBalance = currentBalance;
    }

    public Account(int accNum, Name AccName, MyDate accDateOpened, MyDate birthdate) {
        this.accNum = accNum;
        this.AccName = AccName;
        this.accDateOpened = accDateOpened;
        this.birthdate = birthdate;
    }

    public Account(int accNum, Name AccName, MyDate birthdate, MyDate accDateOpened, double currentBalance) {
        this.accNum = accNum;
        this.AccName = AccName;
        this.birthdate = birthdate;
        this.accDateOpened = accDateOpened;
        this.totalBalance = this.currentBalance = currentBalance;
    }

    void checkBalance() {
        //display CurrentBalance and TotalBalance
        System.out.printf("\nCurrent Balance: Php %.2f \nTotal Balance: Php %.2f\n", this.currentBalance, this.totalBalance);
    }

    public boolean withdraw(double amount) {
        //AMOUNT TO BE WITHDRAWN MUST  BE MULTIPLE OF 100 AND MUST NOT EXCEED FROM THE CURRENT BALANCE
        if (amount % 100 == 0 && amount <= this.currentBalance) {
            this.currentBalance -= amount;
            this.totalBalance -= amount;
        } else {
            System.out.println("Invalid Amount!!!!");
        }
        return true;
    }

    public boolean deposit(double amount) {
        //ADD AMOUNT TO TOTAL BALANCE
        this.totalBalance += amount;
        return true;
    }

    public boolean transfer(Account other, double amount) {
        this.currentBalance -= amount;
        this.totalBalance -= amount;
        other.totalBalance = other.currentBalance += amount;
        return true;
    }

    public int getAccNum() {
        return accNum;
    }

    public Name getAccName() {
        return AccName;
    }

    public MyDate getAccDateOpened() {
        return accDateOpened;
    }

    public MyDate getBirthdate() {
        return birthdate;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public void setAccName(Name AccName) {
        this.AccName = AccName;
    }

    public void setAccDateOpened(MyDate accDateOpened) {
        this.accDateOpened = accDateOpened;
    }

    public void setBirthdate(MyDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    /*void displayAccount() {
        System.out.printf("\nAccount Number: %d \nAccount Name: %s "
                + "\nBirthdate: %s \nDate Account Opened: %s "
                + "\nCurrent Balance: Php %.2f \nTotal Balance: Php %.2f\n",
                this.accNum, this.AccName, this.birthdate, this.accDateOpened,
                this.currentBalance, this.totalBalance);
    }*/
//    @Override
    public String toString() {
        return String.format("\nAccount Number: %d \nAccount Name: %s \nBirthdate: %s \nDate Account Opened: %s \nCurrent Balance: %.02f \nTotal Balance: %.02f\n", this.accNum, this.AccName, this.birthdate, this.accDateOpened, this.currentBalance, this.totalBalance);
    }
}
