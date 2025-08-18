package com.sgtesting.programs.Assignment1Strings;

public class WithoutLenChStr {
    public static void main(String[] args) {
        StringCharacterCount();
    }
    private static void StringCharacterCount()
    {
        String s="Harshitha";
        int count=0;
        for(char kk:s.toCharArray())
        {
            count=count+1;
        }
        System.out.println("The count of characters:"+count);
    }
}
