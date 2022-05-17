package TestAssignment;

import org.testng.annotations.Test;

import Assignment.DeliveryPage;
import Assignment.PizzaHutHomePage;
import M.common.Utility;



public class PizzaHut extends Utility {
	
  @Test
  public void f() throws InterruptedException {
	  PizzaHutHomePage ph=new PizzaHutHomePage(driver);
	 
	  ph.CheesePizza();
	  Thread.sleep(6000);
	  
	  DeliveryPage dv=new DeliveryPage(driver);
	  dv.Delivery();
	  dv.Address();
	  dv.Apt();
	  dv.City();
	  dv.Zip();
	  Thread.sleep(6000); 
	  dv.FindAStore();
	  Thread.sleep(6000);
	  
	  
  }
  
  @Test (priority = 2, dependsOnMethods = "f")
  public void TextVerificationMethod() throws InterruptedException {
	  driver.navigate().back();
	  Thread.sleep(6000);
  }
 

}
