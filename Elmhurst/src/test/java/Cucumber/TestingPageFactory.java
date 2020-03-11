package Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TestingPageFactory {
	WebDriver driver;
	
	public TestingPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how = How.XPATH, using = "//input[@name='userName']")
	private WebElement putUsername;

	
    @FindBy(how = How.XPATH, using = "//input[@type='password']")
    private WebElement putPassword;
   
    
    @FindBy(how = How.XPATH, using = "//input[@value='Login']")
    private WebElement putClick;
    
    public WebElement getUserName() {
    	return getUserName();
    }
    

}
