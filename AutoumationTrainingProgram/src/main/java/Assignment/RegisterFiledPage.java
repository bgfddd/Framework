package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterFiledPage {
	WebDriver driver;

	@FindBy(id="email") WebElement EmailFiled;
	@FindBy(id="password-input-field") WebElement PasswordFiled;
	@FindBy(id="zipCode") WebElement ZipCodeFiled;
	@FindBy(id="phone") WebElement PhoneFiled ;
	@FindBy(xpath="//*[@id=\"recaptcha-anchor\"]/div[1]") WebElement Robot;
	@FindBy(xpath="//span[text()='Create an Account']") WebElement CreateAnAccount ;
	
	public RegisterFiledPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void  EmailFiled() {
		EmailFiled.sendKeys("bd1912@gmail.com");
	}
	public void  PasswordFiled() {
		PasswordFiled.sendKeys("Adan18201"); 
	}
	public void  ZipCodeFiled() {
		ZipCodeFiled.sendKeys("78626");
	}
	public void  PhoneFiled() {
		PhoneFiled.sendKeys("5127896325");}
	public void  Robot() {
		Robot.click();
	}
	public void  CreateAnAccount() {
		CreateAnAccount.click();
	}

}
