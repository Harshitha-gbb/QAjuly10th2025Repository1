package com.sgtesting.programs.Assignment1Strings;

public class WithoutLenChStr {
    public static void main(String[] args) {
        String s="Harshitha";
        char[] ch=s.toCharArray();
        int count=0;
        for(char kk:ch)
        {
            count=count+1;
        }
        System.out.println("The count of characters:"+count);
    }
}
