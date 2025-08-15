package com.sgtesting.programs.Assignment1Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s="stop";
        String s1="post";

        char ch[]=s.toCharArray();
        char ch1[]=s.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        if(Arrays.equals(ch,ch1))
        {
            System.out.println("It is Anagram");
        }
        else
        {
            System.out.println("It is not a Anagram");
        }
    }
}
