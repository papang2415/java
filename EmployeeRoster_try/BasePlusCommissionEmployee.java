/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeRoster;

import inheritance.*;
import java.sql.Date;

/**
 *
 * @author 2ndyrGroupB
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(double baseSalary, int empID, MyName empName, Date dateHired,String type) {
        super(baseSalary, empID, empName, dateHired,type);
    }

    public BasePlusCommissionEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    
    
    @Override
     public double computeSalary() {
       return baseSalary + super.computeSalary();
    }

    void setSalary(double computeSalary) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
