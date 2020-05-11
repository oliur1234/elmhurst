package tech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Monday {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mroli\\git\\PremierLeague\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.com/");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("email")).sendKeys("mroliur@yahoo.com");
		
		driver.findElement(By.name("submit")).click();
		
		
		
		
		
	
		
		
		
		
		
		
		
	
	}

}
