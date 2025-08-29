package com.sgtesting.excel;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileOutputStream;

public class ColorNames {
    public static void main(String[] args) {
        writeExcel();
    }
    private static void writeExcel()
    {
        FileOutputStream fout = null;
        Workbook wb = null;
        Sheet sh=null;
        Row rw=null;
        Cell cl=null;
        try {
            wb=new XSSFWorkbook();
            sh=wb.createSheet("ColorNames");
            for(int i=0;i<20;i++) {

                for (int j = 0; j < 20; j++)
                {
                    if(i==j)
                    {
                        rw = sh.createRow(i);
                        cl = rw.createCell(j);
                        cl.setCellValue("Color" + (j + 1));
                    }
                }
            }
            fout=new FileOutputStream("D:\\EXCEL\\Color.xlsx");
            wb.write(fout);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try {
                fout.close();
                wb.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }

    }

}

