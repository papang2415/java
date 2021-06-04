/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeRoster;

import employee.Employee;
import inheritance.MyName;
import java.util.Date;

/**
 *
 * @author 2ndyrGroupB
 */
public class CommissionEmployee extends Employee {

    private double totalSales;
    
     public CommissionEmployee() {
    }

    public CommissionEmployee(double totalSales, int empID, MyName empName, Date dateHired,String type) {
        super(empID, empName, dateHired,type);
        this.totalSales = totalSales;
    }

    
    public CommissionEmployee(double totalSales) {
        this.totalSales = totalSales;
    }

  
    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double computeSalary() {
        double salary = 0;
        if (this.totalSales > 0 && this.totalSales < 10000) {
            salary = this.totalSales * 0.10;
        } else if (this.totalSales > 10000 && this.totalSales < 100000) {
            salary = this.totalSales * 0.20;
        } else if (this.totalSales > 100000) {
            salary = this.totalSales * 0.25;
        }
        return salary;
    }
    
     public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.printf("\n%s 0.2f\n","Salary: " , computeSalary());
       
    }
    
}