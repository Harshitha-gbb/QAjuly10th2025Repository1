package com.sgtesting.programs.abstraction;

abstract class Substraction
{
    {
        int x,y;
        x=90;
        y=50;
        System.out.println("The substraction perform operation:"+(x-y));
    }
}

class Showsub extends Substraction
{
}

public class IntanceBlock {
    public static void main(String[] args) {
        Showsub o1=new Showsub();
    }
}
