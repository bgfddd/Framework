package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalAccountPage {
	WebDriver driver;

	@FindBy(xpath="(//span[text()='Select & Continue'])[1]") WebElement  PersonalAccount;
	
	public PersonalAccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void PersonalAccount() {
		PersonalAccount.click();
	}  
}
