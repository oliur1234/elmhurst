package cnn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cnntry {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.cnn.com/business");
		driver.getTitle();
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//*[@name='markets'])[1]")).click();
		
		driver.getTitle();
		
		
		//driver.findElement(By.xpath("(//*[@name='tech'])[1]")).click();
		
		//driver.close();
	}
}
