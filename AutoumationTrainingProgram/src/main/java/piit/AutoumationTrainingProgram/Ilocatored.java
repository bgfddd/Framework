package piit.AutoumationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocatored {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutoumationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement searchtoclick = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span"));
		Thread.sleep(6000);
		searchtoclick.click();
		WebElement searchfield = driver.findElement(By.xpath("html/body/div/header/div/div/div/div/form/div/div/input"));
		searchfield.click();
		searchfield.sendKeys("computer");
		WebElement searchtoclick1 = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span"));
		searchtoclick1.click();
		
		WebElement Searchfield = driver.findElement(By.xpath("//input[@aria-label='Search']"));
		Searchfield.click();
		Searchfield.sendKeys("Desktop");
		WebElement Searchtoclick = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span"));
		Searchtoclick.click();
		

		WebElement NewRealeases = driver.findElement(By.xpath("(//a[text()='New Releases'])[1]"));
		NewRealeases.click();
		
		WebElement NewRealeases1 = driver.findElement(By.xpath("(//a[contains(text(),'New Releases')])[1]"));
		NewRealeases1.click();
		
		WebElement Searchfield1 = driver.findElement(By.xpath("//*[contains(@aria-label='Search')]"));
		Searchfield1.click();
		
		
		
		driver.close();

		
	}

}
