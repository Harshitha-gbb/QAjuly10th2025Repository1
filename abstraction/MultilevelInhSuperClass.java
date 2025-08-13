package com.sgtesting.programs.abstraction;

abstract class University
{
    abstract void getunvirn(String uname);

}

class College extends University
{
    void getunvirn(String uname)
    {
        System.out.println("university name" + uname);
    }
}

class Student extends College
{
    void getstu(String stuname,int stuid)
    {
        System.out.println("The student name is:"+stuname);
        System.out.println("The student id is:"+stuid);
    }
}

public class MultilevelInhSuperClass {
    public static void main(String[] args) {
        Student o1=new Student();
        o1.getunvirn("VTU");
        o1.getstu("Harshitha",12);
    }
}
