package com.sonata.assignment4;

import java.util.ArrayList;
import java.util.List;

class EmployeeImpl implements EmployeeInt{
    List<Employee> listOfEmployee =new ArrayList<Employee>();
    public void addEmployee(Employee e) throws DuplicateEmployeeIdException
    {
        for(Employee e1:listOfEmployee)
        {
            if(e1.compareTo(e)==0)
             throw new DuplicateEmployeeIdException("Duplicate employee is found");
        }
          
        listOfEmployee.add(e);
    }
    public void deleteEmployee(Employee e)
    {
        listOfEmployee.remove(e);
    }
    public double yearSalary(Employee e1){
        return e1.employeeSalary*12;
    }
    public double appSalary(Employee e1)
    {
        if(e1.employeeSalary<10000)
         e1.employeeSalary+=5000;
        return e1.employeeSalary;
    }
} 
