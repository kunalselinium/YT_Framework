package org.testing.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.VideoPlay;
import org.testing.Utilities.Logs;
import org.testing.Utilities.Screenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_TC3 extends Base {

@Test	
 public void SignInVideoLike() throws InterruptedException, IOException {
	try {

	Login l=new Login(cdriver,pr);
	l.SignIn("kunalselinium", "Kunal98765");
	Logs.takeLogs("Class_TC3", "Login successfully");
	VideoPlay v=new VideoPlay(cdriver,pr);
	v.Video();
    WebElement like=cdriver.findElement(By.xpath(pr.getProperty("likevideo")));
	like.click();
	Screenshot.takeScreenshot(cdriver, "D:\\YT_ScreenShots\\TC3\\TC3_Passed.png");
	Logs.takeLogs("Class_TC3", "Test case 3 is passed");
	} 
	catch (Exception e) {
		Screenshot.takeScreenshot(cdriver, "D:\\YT_ScreenShots\\TC3\\TC3_Failed.png");
		Logs.takeLogs("Class_TC3", "Test case 3 is failed");
	}
 }

}
