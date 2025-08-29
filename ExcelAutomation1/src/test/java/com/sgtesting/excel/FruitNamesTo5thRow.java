package com.sgtesting.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FruitNamesTo5thRow {
    public static void main(String[] args) {
        readcontent();
        writecontent();
    }

    private static void readcontent() {
        FileInputStream fin = null;
        Workbook wb = null;
        Sheet sh = null;
        Row row = null;
        Cell cell = null;
        try {
            fin = new FileInputStream("D:\\EXCEL\\FruitsNameto5th.xlsx");
            wb = new XSSFWorkbook(fin);
            sh = wb.getSheet("Sheet1");
            int rc = sh.getPhysicalNumberOfRows();
            for (int r = 0; r < rc; r++) {
                row = sh.getRow(r);
                int cc = row.getPhysicalNumberOfCells();
                for (int c = 0; c < cc; c++) {
                    cell = row.getCell(c);
                    String data = cell.getStringCellValue();
                    System.out.printf("%-12s", data);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fin.close();
                wb.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    private static void writecontent()
    {
        FileOutputStream fout=null;
        FileInputStream fin=null;
        Workbook wb=null;
        Sheet sh=null;
        Row row=null;
        Cell cell=null;
        try
        {
            fin=new FileInputStream("D:\\EXCEL\\FruitsNameto5th.xlsx");
            wb=new XSSFWorkbook(fin);
            sh=wb.createSheet("Sheet2");
            row=sh.createRow(4);
            for(int i=0;i<20;i++)
            {
                cell=row.createCell(i);
                cell.setCellValue("Fruit"+(i+1));
            }
            fout=new FileOutputStream("D:\\EXCEL\\FruitsNameto5th.xlsx");
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
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}