package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryPage {

	WebDriver driver;

	@FindBy(xpath="html/body/app-root/div/div/div/div/div/div/div/div/div/div/div/div/label") WebElement Delivery;
	@FindBy(id="syo-address1") WebElement Address ;
	@FindBy(name="deliveryApt") WebElement Apt ;
	@FindBy(id="city") WebElement  City;
	@FindBy(xpath="//*[@id=\"state\"]/option[47]") WebElement  State;
	@FindBy(id="zip-input") WebElement  Zip;
	@FindBy(id="ph-find-store") WebElement FindAStore;
	
	
	public DeliveryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Delivery() {
		Delivery.click();
	}
	public void Address() {
		Address.sendKeys("123 William drive");
	}
	
	public void   Apt() {
		Apt.sendKeys("246");
	}
	
	public void   City() {
		City.sendKeys("Georgetown");
	}
	
	public void   State() {
		State.click();
	}
	
	public void   Zip() {
		Zip.sendKeys("78626");
	} 
	
	public void   FindAStore() {
		FindAStore.click(); 
	}
	
}
