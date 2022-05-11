package TestAssignment;

import org.testng.annotations.Test;

import Assignment.HomeDepotHomePage;
import Assignment.PersonalAccountPage;
import Assignment.RegisterFiledPage;
import M.common.Utility;



public class HomeDepot extends Utility {
	
  @Test
  public void f() throws InterruptedException {
	  HomeDepotHomePage ob=new HomeDepotHomePage(driver);
	  ob.MyAccount();
	  Thread.sleep(6000);
	  ob.Register();
	  PersonalAccountPage pra=new PersonalAccountPage(driver);
	  pra.PersonalAccount();
	  Thread.sleep(6000);
	  RegisterFiledPage rfp=new  RegisterFiledPage(driver);
	  rfp.EmailFiled();
	  rfp.PasswordFiled();
	  rfp.ZipCodeFiled();
	  rfp.PhoneFiled();
	  rfp.Robot();
	  rfp.CreateAnAccount();
	   
  }
  
  
  
}
