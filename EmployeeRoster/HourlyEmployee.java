package EmployeeRoster;

public class HourlyEmployee extends Employee {

//    private double totalHoursWorked;
//    private double ratePerHour;
//
//    public HourlyEmployee() {
//
//    }
//
//    public HourlyEmployee(double totalHoursWorked, double ratePerHour) {
//        this.totalHoursWorked = totalHoursWorked;
//        this.ratePerHour = ratePerHour;
//    }
//
//    public HourlyEmployee(double totalHoursWorked, double ratePerHour, int empID, MyName empName, Date dateHired, String type) {
//        super(empID, empName, dateHired, type);
//        this.totalHoursWorked = totalHoursWorked;
//        this.ratePerHour = ratePerHour;
//    }
//
//    public double computeSalary() {
//        double finalSalary = 0;
//        if (this.totalHoursWorked > 40) {
//            double overTime = this.ratePerHour * 1.5;
//            double salary = overTime * (this.totalHoursWorked - 40);
//            finalSalary = salary + (this.ratePerHour * 40);
//        } else {
//            finalSalary = this.totalHoursWorked * this.ratePerHour;
//        }
//        return finalSalary;
//    }
//
//    public double getTotalHoursWorked() {
//        return totalHoursWorked;
//    }
//
//    public void setTotalHoursWorked(double totalHoursWorked) {
//        this.totalHoursWorked = totalHoursWorked;
//    }
//
//    public double getRatePerHour() {
//        return ratePerHour;
//    }
//
//    public void setRatePerHour(double ratePerHour) {
//        this.ratePerHour = ratePerHour;
//    }
//
//    public void displayEmployeeDetails() {
//        super.displayEmployeeDetails();
//        System.out.println("Salary: " + computeSalary() + "\n");
//
//    }

}
