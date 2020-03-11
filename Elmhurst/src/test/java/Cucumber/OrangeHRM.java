package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class OrangeHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@value='LOGIN']")).click();
		
		//WebElement abc = driver.findElement(By.xpath("//*[@id='menu_leave_viewLeaveModule']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='menu_leave_viewLeaveModule']/b"))).click();
		
	    //driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
	    
	    driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
	    
	    String actual = driver.findElement(By.xpath("//*[contains(text(),'Linda Anderson')]")).getText();
	    
	    System.out.println("this is actual message"+actual);
	    
	    String expected="Linda OLI";
	    
	    Assert.assertEquals(expected, actual);
	    
	    driver.close();
	    
	    
	}

}
