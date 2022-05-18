package piit.AutoumationTrainingProgram;

import org.testng.annotations.Test;

import M.common.Utility;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Browsersd extends Utility {
	 WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement id=driver.findElement(By.name("email"));
	  id.sendKeys("dihia@gmail.com");
	  Thread.sleep(6000);
	  WebElement pssword=driver.findElement(By.name("pass"));
	  pssword.sendKeys("Adan2018");
	  WebElement log=driver.findElement(By.name("login"));
	  log.click();
	  Thread.sleep(6000); 
  }  
  

}
