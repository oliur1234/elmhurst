package tech;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PremierL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mroli\\git\\Elmhurst\\Elmhurst\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.premierleague.com/tables");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='advertClose']")).click();
        driver.findElement(By.xpath("//*[@class='btn-primary cookies-notice-accept']")).click();
        List<WebElement> teams = driver.findElements(By.xpath("//table/tbody/tr/td[3]/a/span[2]"));
        
        
	}

}
