package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Set the path to the chromedriver  executable
		
	System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
	
	//instantiate a Chrome session
	
	WebDriver driver = new ChromeDriver();
	
	// Open browser and go to home page
	
	driver.get("https://www.phptravels.net/login");
	
	//declare implicity wait
	
	//driver.manage().timeouts().implicityWait(10, TimeUnit.SECONDS);
	
	WebDriverWait wait = new WebDriverWait(driver,30);
	
	//print page title
	
	System.out.println(driver.getTitle());
	
	//Maximize window
	
	driver.manage().window().maximize();
	
	//enter username and password
	
	driver.findElement(By.name("username")).sendKeys("user@phptravels.com");
	
	driver.findElement(By.name("password")).sendKeys("demouser");
	
	driver.findElement(By.xpath("(//*[contains(text(),'Login')])[4]")).click();
	
	//java time out
	
	//Thread sleep(300);
	
	//example of explicit wait
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Hi,Demo User')]")));
	
	System.out.println(driver.getTitle());
	
	//log out
	
	
	}

}
