package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeFeatureFile {
	
 WebDriver driver;
	
	@Given("^user go to login page hrm$")
	public void user_go_to_login_page_hrm() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,30);
	}
	
	@Given("^user print the page title hrm$")
	public void user_print_the_page_title_hrm() throws Throwable {
		
		System.out.println(driver.getTitle());
	}
	
	@Then("^user meximize window$")
	public void user_meximize_window() throws Throwable {
		
	driver.manage().window().maximize();	
	}
	
	@When("^user enters a valid user name hrm$")
	public void user_enters_a_valid_user_name_hrm() throws Throwable {
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
	}
		
		@When("^user enters a valid password hrm$")
		public void user_enters_a_valid_password_hrm() throws Throwable {
			
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		}
			
		@Then("^user click on the login button hrm$")
		public void user_click_on_the_login_button_hrm() throws Throwable {
			
		driver.findElement(By.xpath("//*[@value='LOGIN']")).click();
		}
		
		@Then("^user close the browser hrm$")
		public void user_close_the_browser_hrm() throws Throwable {
			
		driver.close();
		
	}

}
