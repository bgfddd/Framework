package piit.AutoumationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HomeDepot {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutoumationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.homedepot.com/");
		driver.manage().window().maximize();
		 
		
		WebElement MyAccount= driver.findElement(By.id("headerMyAccount"));
		MyAccount.click(); 
		
		
		WebElement Register= driver.findElement(By.xpath("//span[text()='Register']"));
	    Register.click();
	    Thread.sleep(6000);
		
		WebElement PersonalAccount= driver.findElement(By.xpath("(//span[text()='Select & Continue'])[1]"));
		PersonalAccount.click();
		
		WebElement Email= driver.findElement(By.id("email"));
		Email.sendKeys("bd1912@gmail.com");
		
		WebElement Password= driver.findElement(By.id("password-input-field"));
		Password.sendKeys("Adan18201");
		
		WebElement ZipCode= driver.findElement(By.id("registrationZipcodeErrorField"));
		ZipCode.sendKeys("78626");
		
		WebElement Phone= driver.findElement(By.id("phone"));
		Phone.sendKeys("5127896325");
		
		WebElement robot= driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]"));
	    robot.click();
	    
	    WebElement CreateAnAccount= driver.findElement(By.xpath("//span[text()='Create an Account']"));
	    CreateAnAccount.click();
		
		driver.close();
		
	}

}
