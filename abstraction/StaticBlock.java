package com.sgtesting.programs.abstraction;

abstract class Addition
{
    static
    {
        int x,y;
        x=90;
        y=76;
        System.out.println("Perform the addition operation:"+(x+y));
    }
}

class Showaddition extends Addition
{
}

public class StaticBlock {
    public static void main(String[] args) {
        Showaddition o1=new Showaddition();
    }
}
