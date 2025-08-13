package com.sgtesting.programs.abstraction;

abstract class Employee
{
    static void getempName(String empname,int empid)
    {
        System.out.println("The employee name is:"+empname);
        System.out.println("The employee id is:"+empid);
    }

    static void getdetails(String location)
    {
        System.out.println("The employee address is:"+location);
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        Employee.getempName("Harshitha",14);
        Employee.getdetails("Banglore");
    }
}
