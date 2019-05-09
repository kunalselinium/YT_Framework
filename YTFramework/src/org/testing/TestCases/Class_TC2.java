package org.testing.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Assertions.Assertt;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Utilities.Logs;
import org.testing.Utilities.Screenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_TC2  extends Base {
	

@Test	
 public void SignInSubscription() throws InterruptedException, IOException {
	try {
		
   Login l=new Login(cdriver,pr);
	l.SignIn("kunalselinium", "Kunal98765");
	Logs.takeLogs("Class_TC2", "Login successfully");
	WebElement menu1=cdriver.findElement(By.xpath(pr.getProperty("menubar")));
	menu1.click();
	Thread.sleep(8000);
	WebElement subscription=cdriver.findElement(By.xpath(pr.getProperty("subscriptions")));
	subscription.click();
	String expectedSubsciptionsURL="https://www.youtube.com/feed/subscriptions";
	Assert.assertTrue(Assertt.ResultCompare1(cdriver.getCurrentUrl(), expectedSubsciptionsURL));
	Screenshot.takeScreenshot(cdriver, "D:\\YT_ScreenShots\\TC2\\TC2_Passed.png");
	Logs.takeLogs("Class_TC2", "Test case 2 is passed");
	} 
	catch (Exception e) {
		Screenshot.takeScreenshot(cdriver, "D:\\YT_ScreenShots\\TC2\\TC2_Failed.png");
		Logs.takeLogs("Class_TC2", "Test case 2 is failed");
	}

 }

}
