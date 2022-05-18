package TestAssignment;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
	  DeliveryPage dv=new DeliveryPage(driver);
	  String Textss =dv.TextOfDelivery();
	  SoftAssert softit=new SoftAssert();
	  softit.assertEquals("Find a store to get started",Textss );
	  System.out.println("This is after my assertions");
	  softit.assertAll();
  }
 

}
