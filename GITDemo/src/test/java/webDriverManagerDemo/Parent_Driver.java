package webDriverManagerDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Return;

public class Parent_Driver {
	
	public static WebDriver driver;
	public static Object arr[][]= new Object[1][2];
	
	public static FileInputStream fi;
	public static Properties storage;
	public static FileInputStream fs;
	
	public static WebDriver calldriver() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get(murl);
		//driver.manage().window().maximize();
		return driver;
	}
	
	public static void login(String user, String pass) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://syncupp.devhostserver.com");
		driver.manage().window().maximize();
		
		 //fi = new FileInputStream("E:\\MyPropertiesFile.Properties");
		 //storage = new Properties();
		//load the propertiesfile
		//storage.load(fi);
		
		  
		 
		  readfile();
		  //excel();
		  /*
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
	*/
		  
		  driver.findElement(By.xpath(storage.getProperty("UserEmail"))).sendKeys(user);
	      driver.findElement(By.xpath(storage.getProperty("UserPS"))).sendKeys(pass);
	      driver.findElement(By.xpath(storage.getProperty("loginbutton"))).click();
	      //System.out.println(arr[1][0].toString());
	      //System.out.println(arr[1][1].toString());
	      
	}
	
	public static void excel() throws IOException {
		//Path of the excel file
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
	
	public static void readfile() throws IOException {
		//define file path in Java class
	     fi  = new FileInputStream("E:\\MyPropertiesFile.Properties");
	    storage = new Properties();
		//load the propertiesfile
		storage.load(fi);
		
	 }
}
