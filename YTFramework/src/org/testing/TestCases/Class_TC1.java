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
import org.testng.asserts.Assertion;

public class Class_TC1 extends Base {

	
@Test	
 public void SignInTrending() throws InterruptedException, IOException {
	try {
	Login l=new Login(cdriver,pr);
	l.SignIn("kunalselinium", "Kunal98765");
	//Assert.assertEquals(cdriver.getTitle(), "YouTube");
	//Assertt.ResultCompare(cdriver.getTitle(), expectedtitle);
	Logs.takeLogs("Class_TC1", "Login successfully");
	WebElement menu1=cdriver.findElement(By.xpath(pr.getProperty("menubar")));
	menu1.click();
	Thread.sleep(8000);
	WebElement trending=cdriver.findElement(By.xpath(pr.getProperty("trending")));
	trending.click();
	String trendingExpectedURL="https://www.youtube.com/feed/trending";
	//Assertt.ResultCompare(cdriver.getCurrentUrl(), trendingExpectedURL);
	Assert.assertTrue(Assertt.ResultCompare1(cdriver.getCurrentUrl(), trendingExpectedURL));
	Screenshot.takeScreenshot(cdriver, "D:\\YT_ScreenShots\\TC1\\TC1_Passed.png");
	Logs.takeLogs("Class_TC1", "Test case 1 is passed");
	}
	catch(Exception e)
	{
	e.printStackTrace();
	Screenshot.takeScreenshot(cdriver, "D:\\YT_ScreenShots\\TC1\\TC1_Failed.png");	
	Logs.takeLogs("Class_TC1", "Test case 1 is failed");
	}
 }
	
}
