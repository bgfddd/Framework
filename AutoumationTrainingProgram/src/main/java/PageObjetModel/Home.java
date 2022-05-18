package PageObjetModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	@FindBy(name="email") WebElement Ids;
	@FindBy(name="pass") WebElement Psswords;
	@FindBy(linkText="Forgot password?") WebElement Forgot;
	@FindBy(name="login") WebElement Loginbutton; 
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void Email(String name) {
		Ids.clear();
		Ids.sendKeys(name);
	}
	public void PsswordsFieldsEnters(String name) {
		Psswords.sendKeys(name);
	}
	public void ForgotLinkClick() {
		Forgot.clear();
		Forgot.click();
	}
	
	public void login() {
		Loginbutton.click();
	}
}
