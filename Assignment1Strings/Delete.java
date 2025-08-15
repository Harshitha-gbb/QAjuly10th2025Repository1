package com.sgtesting.programs.Assignment1Strings;

public class Delete {
    public static void main(String[] args) {
        delete();
    }
    private static void delete()
    {
        String s="SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        String str[]=s.split("DAY");
        for(int i=0;i<str.length;i++)
        {
            System.out.print(str[i]);
        }
    }
}
