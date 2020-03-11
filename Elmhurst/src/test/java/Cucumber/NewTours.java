package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath(" //input[@name='userName']")).sendKeys("user@phptravels.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("demouser");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		WebElement triptype = driver.findElement(By.xpath("//input[@value='oneway']"));
		triptype.click();
		
		WebElement trial = driver.findElement(By.xpath("//select[@name='passCount']"));
		
		Select passengers= new Select(trial);
		passengers.selectByValue("3");
		
		Select depart= new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		depart.selectByVisibleText("New York");
		
		Select obj= new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
		obj.selectByVisibleText("May");
		
		Select date= new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
		date.selectByValue("21");
		
	}

}
