package inheritance;

public class CommissionEmployee extends Employee {

    private double totalSales;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double computeSalary() {
        if (this.totalSales <= 10000) {
            this.salary = this.totalSales * .10;
            return salary;
        } else if (this.totalSales > 10000 && this.totalSales < 100000) {
            this.salary = this.totalSales * .20;
            return salary;
        } else if (this.totalSales > 100000) {
            this.salary = this.totalSales * .25;
            return salary;
        } else {
            return salary;
        }
    }

    public CommissionEmployee() {
    }

    public CommissionEmployee(double totalSales, int empID, MyName empName) {
        super(empID, empName);
        this.totalSales = totalSales;
    }

    public CommissionEmployee(double totalSales) {
        this.totalSales = totalSales;
    }

    public CommissionEmployee(double totalSales, int empID, MyName empName, Date dateHired) {
        super(empID, empName, dateHired);
        this.totalSales = totalSales;
    }

    public void displayCommissionEmployee() {
        System.out.print("=========================================");
        System.out.print("\nCommission Employee");
        super.displayEmployee();
        System.out.printf("\nTotal Sales: Php %.2f \nTotal Salary: Php %.2f\n", this.totalSales, this.salary);

    }

}
