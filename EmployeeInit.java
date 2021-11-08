package com.sonata.assignment4;

interface EmployeeInt{
    public void addEmployee(Employee e) throws DuplicateEmployeeIdException;
    public void deleteEmployee(Employee e);
    public double yearSalary(Employee e1);
    public double appSalary(Employee e1);
}

