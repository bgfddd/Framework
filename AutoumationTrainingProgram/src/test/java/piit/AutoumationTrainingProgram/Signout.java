package piit.AutoumationTrainingProgram;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import M.common.Utility;
import PageObjetModel.FrogotPasswordPage;
import PageObjetModel.Home;



public class Signout extends Utility{
	
  @Test (priority = 1)
  public void f() throws InterruptedException, IOException{
	  Home ob =new Home(driver);
	  ob.Email("");
	  Thread.sleep(6000);
	  Picctures();
	  ob.PsswordsFieldsEnters("");
	  Thread.sleep(6000);
	  Picctures();
	  ob.ForgotLinkClick();
	  FrogotPasswordPage id=new FrogotPasswordPage(driver);
	  id.IdsSendKeys();
	  id.SearchButtonClick();
	  Thread.sleep(6000); 
      Picctures(); 
	  
	
  }
  
  
  @Test (priority = 2, dependsOnMethods = "f")
  public void TextVerificationMethod() throws InterruptedException {
	  driver.navigate().back();
	  Thread.sleep(6000);
	  FrogotPasswordPage id=new FrogotPasswordPage(driver);
	  String Questions=id.QuestionOfText();
	  SoftAssert softit=new SoftAssert();
	  softit.assertEquals("Please enter your email or mobile number to search for your account.",Questions );
	  System.out.println("This is after assertions");
	  softit.assertAll();
	   
  }
  @Test (priority = 3)
  public void TextVerificationHomepageMethod() throws InterruptedException {
	  driver.navigate().back();
	  Thread.sleep(6000);
	  FrogotPasswordPage id=new FrogotPasswordPage(driver);
	  String Hometpage =id.TextHomepage();
	  SoftAssert softit=new SoftAssert();
	  softit.assertEquals("Connect with friends and the world around you on Facebook.",Hometpage );
	  System.out.println("This is after my assertions");
	  softit.assertAll();  
  }  
  
   
  
  
}
