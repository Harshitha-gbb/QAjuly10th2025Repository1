package com.sgtesting.programs.abstraction;

abstract class Customer
{
    Customer(String sname)
    {
        System.out.println("The customer name is:"+sname);
    }
}

class showcusn extends Customer
{

    showcusn(String sname) {
        super(sname);
    }
}

public class ConstructorAlone {
    public static void main(String[] args)
    {

        showcusn o1=new showcusn("Hanamant");
    }
}
