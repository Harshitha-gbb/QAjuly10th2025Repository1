package com.sgtesting.programs.Assignment1Strings;

public class Palidrome {
    public static void main(String[] args) {
        String s="madam";
        String str="";
        for(int i=s.length()-1;i>=0;i--)
        {
            str=str+s.charAt(i);
        }
        if(s.equalsIgnoreCase(str))
        {
            System.out.println("It is a palidrome");
        }
        else
        {
            System.out.println("It is not a palidrome");
        }
    }
}
