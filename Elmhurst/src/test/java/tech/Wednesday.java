package tech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wednesday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\mroli\\git\\Elmhurst\\Elmhurst\\driver\\chromedriver.exe");

       WebDriver driver = new ChromeDriver();
       
       driver.get("https://www.typingclub.com/");
       
       driver.findElement(By.xpath("//*[@class='login-link']")).click();
       
       driver.findElement(By.xpath("//*[@id='username']")).sendKeys("mroliur@yahoo.com");
       
	}

}
