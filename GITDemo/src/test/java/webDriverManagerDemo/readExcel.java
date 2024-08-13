package webDriverManagerDemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {

	public static Object arr[][]= new Object[1][2];
	public static FileInputStream fs;
	
	public static void main(String[] args) throws IOException {
				 
		 fs = new FileInputStream("E:\\TestingData.xlsx");
			//Creating a workbook
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheetAt(0);
			System.out.println(workbook.getSheetAt(0));
		
				for(int i=0; i< 1; i++){
					for(int j=0; j< 2; j++){
						
						arr[i][j]=sheet.getRow(i).getCell(j);
						
						System.out.print(arr[i][j]+"                ");
					}
					System.out.println("");
				}
	}

}
