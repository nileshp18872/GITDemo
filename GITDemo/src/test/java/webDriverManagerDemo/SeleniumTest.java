package webDriverManagerDemo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.operadriver().setup();
		//WebDriverManager.phantomjs().setup();
		//WebDriverManager.edgedriver().setup();
		//WebDriverManager.iedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://tridhyatech.com");
		driver.manage().window().maximize();
		
	}

}
