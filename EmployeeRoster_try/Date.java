/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeRoster;

import java.text.SimpleDateFormat;

/**
 *
 * @author 2ndyrGroupB
 */
public class Date {

    @Override
    public String toString() {
        java.util.Date date = new java.util.Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd yyyy");
        String strDate = formatter.format(date);
        return strDate.toString();
    }
}
