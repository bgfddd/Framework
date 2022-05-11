package piit.AutoumationTrainingProgram;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class PizzaHut {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutoumationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.pizzahut.com/");
		driver.manage().window().maximize();
		 

		WebElement Menu= driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		Menu.click(); 
		/*WebElement pizza= driver.findElement(By.xpath("(html/body/div/header/div/div/div/div/div/ul/li/a)[1]"));
		pizza.click();
		
		WebElement Popularpizzas= driver.findElement(By.xpath("(//a[text()='popular pizzas'])[1]"));
		Popularpizzas.click();*/
		
		WebElement CheesePizza= driver.findElement(By.xpath("//a[@title='Cheese pizza']"));
		CheesePizza.click();
		
		
		WebElement Delivery= driver.findElement(By.xpath("html/body/app-root/div/div/div/div/div/div/div/div/div/div/div/div/label"));
		Delivery.click();
		
		WebElement Address= driver.findElement(By.id("syo-address1"));
		Address.sendKeys("123 William drive");
		
		
		WebElement Apt= driver.findElement(By.name("deliveryApt"));
		Apt.sendKeys("246");
		
		WebElement City= driver.findElement(By.id("city"));
		City.sendKeys("Georgetown");
		
		WebElement State= driver.findElement(By.xpath("//*[@id=\"state\"]/option[47]"));
		State.click();
		
		WebElement Zip= driver.findElement(By.id("zip-input"));
		Zip.sendKeys("78626");
		
		WebElement FindAStore= driver.findElement(By.id("ph-find-store"));
		FindAStore.click();
		
		driver.close(); 
		
		
	} 

}
