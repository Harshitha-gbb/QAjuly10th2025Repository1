package com.sgtesting.programs.abstraction;

abstract class Airthmetic1
{
    Airthmetic1(int x,int y)
    {
        System.out.println("The addition of 2 num:"+(x+y));
    }
    Airthmetic1(int b,int c,int v)
    {
        int res=(b-c)-v;
        System.out.println("The substraction of 2 num:"+res);
    }
    Airthmetic1(int b,int c,int v,int k)
    {
        int res=(b-c-v)*k;
        System.out.println("The substraction of 2 num:"+res);
    }
}

class Airthmetic extends Airthmetic1
{
    Airthmetic(int x,int y)
    {
        super(x,y);
    }
    Airthmetic(int b,int c,int v)
    {
        super(b,c,v);
    }
    Airthmetic(int b,int c,int v,int k)
    {
        super(b,c,v,k);
    }
}

public class ConstructorOverload {
    public static void main(String[] args) {
        Airthmetic o1=new Airthmetic(10,20);
        Airthmetic o2=new Airthmetic(45,67,90);
        Airthmetic o3=new Airthmetic(89,76,45,23);
    }
}
