package com.sgtesting.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class FruitNames201stcolumn {
    public static void main(String[] args) {
        Fruitswritecontent();
    }
    private static void Fruitswritecontent()
    {
        FileOutputStream fout=null;
        Workbook wb=null;
        Sheet sh=null;
        Row row=null;
        Cell cell=null;
        try
        {
            wb=new XSSFWorkbook();
            sh=wb.createSheet("sheet1");
            for(int i=0;i<20;i++)
            {
                row=sh.createRow(i);
                for(int j=0;j<1;j++)
                {
                    cell=row.createCell(j);
                    cell.setCellValue("Fruits"+(i+1));
                }
            }
            fout=new FileOutputStream("D:\\EXCEL\\FruitsName.xlsx");
            wb.write(fout);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fout.close();
                wb.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
