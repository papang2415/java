package inheritance;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private int baseSalary;
    private double salary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getSalary() {
        return salary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double computeSalary() {
        salary = super.computeSalary() + this.baseSalary;
        return salary;
    }

    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int baseSalary, double totalSales) {
        super(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int baseSalary, double totalSales, int empID, MyName empName) {
        super(totalSales, empID, empName);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int baseSalary, double totalSales, int empID, MyName empName, Date dateHired) {
        super(totalSales, empID, empName, dateHired);
        this.baseSalary = baseSalary;
    }

    public void displayBasePlusCommissionEmployee() {
        System.out.print("=========================================");
        System.out.print("\nBase Plus Commission Employee");
        super.displayEmployee();
        System.out.printf("\nBase Salary: Php %d \nTotal Salary: Php %.2f\n", this.baseSalary, this.salary);
    }

}
