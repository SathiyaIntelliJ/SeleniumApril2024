package reusablefile;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel extends BaseCode
{
    public static String getExcelData(String sheetName,int row,int col) throws IOException {
        FileInputStream fis=new FileInputStream(new File("src/main/resources/testdata/Login.xlsx"));
        XSSFWorkbook woorkbook=new XSSFWorkbook(fis);
        XSSFSheet sheet=woorkbook.getSheet("Login");
        String data=sheet.getRow(row).getCell(col).getStringCellValue();
        return data;

    }
}
