package inheritance;

public class Inheritance {

    public static void main(String[] args) {
        //        Employee emp1 = new Employee(186, new MyName(), new Date(10, 03, 2021));
        /* HourlyEmployee hourEmp = new HourlyEmployee((float) 12.50, 120.25, 123, new MyName("Aboy", "Naziel", "Razonado"), new Date(10, 03, 2021));
        HourlyEmployee hourEmp1 = new HourlyEmployee((float) 8, 120.25, 153, new MyName("BB", "Leniel", "Razonado"), new Date(10, 01, 2021));
        hourEmp.computeSalary();
        hourEmp1.computeSalary();
        hourEmp.displayHourlyEmployee();
        hourEmp1.displayHourlyEmployee();

        PieceWorkerEmployee Emp = new PieceWorkerEmployee(200, 50, 123, new MyName("Aboy", "Naziel", "Razonado"), new Date(10, 03, 2021));
        PieceWorkerEmployee Emp1 = new PieceWorkerEmployee(100, 50, 153, new MyName("BB", "Leniel", "Razonado"), new Date(10, 01, 2021));
        Emp.computeSalary();
        Emp1.computeSalary();
        Emp.displayPieceWorkerEmployee();
        Emp1.displayPieceWorkerEmployee();

        CommissionEmployee commEmp = new CommissionEmployee(10000, 123, new MyName("Aboy", "Naziel", "Razonado"), new Date(10, 03, 2021));
        CommissionEmployee commEmp1 = new CommissionEmployee(55000, 153, new MyName("BB", "Leniel", "Razonado"), new Date(10, 01, 2021));
        CommissionEmployee commEmp2 = new CommissionEmployee(125000, 155, new MyName("Jm", "John Mark", "Reyes"), new Date(25, 02, 2021));
        commEmp.computeSalary();
        commEmp1.computeSalary();
        commEmp2.computeSalary();
        commEmp.displayCommissionEmployee();
        commEmp1.displayCommissionEmployee();
        commEmp2.displayCommissionEmployee();*/
        BasePlusCommissionEmployee commPlusEmp = new BasePlusCommissionEmployee(1500, 10000, 123, new MyName("Aboy", "Naziel", "Razonado"), new Date(10, 03, 2021));
        BasePlusCommissionEmployee commPlusEmp1 = new BasePlusCommissionEmployee(1500, 55000, 153, new MyName("BB", "Leniel", "Razonado"), new Date(10, 01, 2021));
        BasePlusCommissionEmployee commPlusEmp2 = new BasePlusCommissionEmployee(1500, 125000, 155, new MyName("Jm", "John Mark", "Reyes"), new Date(25, 02, 2021));
        commPlusEmp.computeSalary();
        commPlusEmp1.computeSalary();
        commPlusEmp2.computeSalary();
        commPlusEmp.displayBasePlusCommissionEmployee();
        commPlusEmp1.displayBasePlusCommissionEmployee();
        commPlusEmp2.displayBasePlusCommissionEmployee();

    }

}
