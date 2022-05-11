package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeDepotHomePage {
	WebDriver driver;

	@FindBy(id="headerMyAccount") WebElement MyAccount;
	@FindBy(xpath="//span[text()='Register']") WebElement Register;
	
	public HomeDepotHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void MyAccount() {
		MyAccount.click();
	}
    public void  Register() {
    	Register.click();
		
	}  
}
