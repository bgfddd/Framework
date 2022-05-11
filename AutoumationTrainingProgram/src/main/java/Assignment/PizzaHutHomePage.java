package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PizzaHutHomePage {

	WebDriver driver;

	@FindBy(xpath="//span[@class='MuiButton-label']") WebElement Menu;
	@FindBy(xpath="//a[@title='Cheese pizza']") WebElement CheesePizza;
	
	public PizzaHutHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Menu() {
		Menu.clear();;
	} 
	public void CheesePizza() {
		CheesePizza.click();}
} 
