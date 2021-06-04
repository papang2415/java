package inheritance;

public class HourlyEmployee extends Employee {

    private float totalHoursWorked;
    private double ratePerHour;
    private float salary;

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public float getSalary() {
        return salary;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public double computeSalary() {
        if (this.totalHoursWorked > 8) {
            this.salary = (float) (this.totalHoursWorked * (this.ratePerHour * 1.5));
            return this.salary;
        } else {
            this.salary = (float) (this.totalHoursWorked * this.ratePerHour);
            return this.salary;
        }
    }

    public HourlyEmployee() {
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour, int empID, MyName empName) {
        super(empID, empName);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour, int empID, MyName empName, Date dateHired) {
        super(empID, empName, dateHired);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;

    }

    public void displayHourlyEmployee() {
        System.out.print("\nHourly Employee");
        super.displayEmployee();
        System.out.printf(" \nTotal Hours Worked: %.2f hour(s) \nRate Per Hour: %.2f/hour \nTotal Salary: Php %.2f\n", this.totalHoursWorked, this.ratePerHour, this.salary);
        System.out.println("=========================================");
    }

    @Override
    public String toString() {
        return String.format("\nTotal Hours Worked: %.2f hour(s) \nRate Per Hour: %.2f/hour \nTotal Salary: Php %.2f\n", this.totalHoursWorked, this.ratePerHour, this.salary);
    }

}
