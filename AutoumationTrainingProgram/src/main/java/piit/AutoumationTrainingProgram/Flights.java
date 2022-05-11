package piit.AutoumationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutoumationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();
		
		WebElement departure= driver.findElement(By.id("d1-btn"));
		departure.click();
		
		WebElement departuretodate= driver.findElement(By.xpath("//*[@aria-label='May 16, 2022']"));
		departuretodate.click();
		Thread.sleep(6000);
		
		WebElement Donebutton= driver.findElement(By.xpath("(//button[text()='Done'])[2]"));
		Donebutton.click();
		
		WebElement back= driver.findElement(By.id("d2-btn"));
		back.click();
		
		WebElement returndate1= driver.findElement(By.xpath("//*[@aria-label='Jun 25, 2022']"));
		returndate1.click();
		
		Thread.sleep(6000);
		
		WebElement Donebutton1= driver.findElement(By.xpath("(//button[text()='Done'])[2]"));
		Donebutton1.click();
		
		
		driver.close();
		
	}

}
