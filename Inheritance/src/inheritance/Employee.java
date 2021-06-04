package inheritance;

public class Employee {

    private int empID;
    private MyName empName;
    private Date dateHired;

    public Employee(int empID, MyName empName) {
        this.empID = empID;
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public MyName getEmpName() {
        return empName;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(MyName empName) {
        this.empName = empName;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public Employee() {
    }

    public Employee(int empID, MyName empName, Date dateHired) {
        this.empID = empID;
        this.empName = empName;
        this.dateHired = dateHired;
    }

    public void displayEmployee() {
        System.out.printf("\nEmployeeID: %d \nEmployee Name: %s \nDate Hired: %s\n", this.empID, this.empName, this.dateHired);
    }

    @Override
    public String toString() {
        return "Employee{" + "empID=" + empID + ", empName=" + empName + ", dateHired=" + dateHired + '}';
    }

}
