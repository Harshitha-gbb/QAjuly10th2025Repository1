package com.sgtesting.programs.Assignment1Strings;

public class Reverse {
    public static void main(String[] args) {
        Rev1();
        Rev2();
        Rev3();
    }
    private static void Rev1()
    {
        String s="Harshitha";
        String str="";
        for(int i=s.length()-1;i>=0;i--)
        {
            str=str+s.charAt(i);
        }
        System.out.println(str);
    }

    private static void Rev2()
    {
        String s="Bhanu";
        char ch[]=s.toCharArray();
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }
        System.out.println();
    }
    private static void Rev3()
    {
        String s="Hello";
        String str=s.substring(0,3);
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            System.out.print(ch);
        }
    }
}
