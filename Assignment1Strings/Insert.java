package com.sgtesting.programs.Assignment1Strings;

public class Insert {
    public static void main(String[] args) {
        insertString();
        insertString1();
        deleteString1();
    }
    private static void insertString()
    {
        String s="SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        String str="";
        for(int i=0;i<s.length();i++)
        {
            str=str+s.charAt(i);
            if(s.charAt(i)=='Y')
            {
                if(i==s.length()-1)
                {
                    str=str+".";
                }
                else
                {
                    str=str+",";
                }
            }
        }
        System.out.println(str);
    }

    private static void insertString1()
    {
        String s="SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        String str=s.replaceAll("DAY","DAY,");
        System.out.println(str);
    }
    private static void deleteString1()
    {
        String s="SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        String str=s.replaceAll("DAY","");
        System.out.println(str);
    }
}
