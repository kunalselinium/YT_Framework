package org.testing.TestCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.VideoPlay;
import org.testing.Utilities.Logs;
import org.testing.Utilities.Screenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.GetAttribute;

public class Class_TC4 extends Base {
	
	@Test
	public void SignInVideoSubscribe() throws InterruptedException, IOException {
		try {
		Login l=new Login(cdriver,pr);
		l.SignIn("kunalselinium", "Kunal98765");
		Logs.takeLogs("Class_TC4", "Login successfully");
		VideoPlay v=new VideoPlay(cdriver,pr);
		v.Video();
		WebElement subscribeButton = cdriver.findElement(By.xpath(pr.getProperty("subscribechannel")));
		subscribeButton.click();
		Screenshot.takeScreenshot(cdriver, "D:\\YT_ScreenShots\\TC4\\TC4_Passed.png");
		Logs.takeLogs("Class_TC4", "Test case 4 is passed");
		} 
		catch (Exception e) {
			Screenshot.takeScreenshot(cdriver, "D:\\YT_ScreenShots\\TC4\\TC4_Failed.png");
			Logs.takeLogs("Class_TC4", "Test case 4 is failed");
		
		} 

		// WebElement
		// subscribe=cdriver.findElement(By.xpath("//*[contains(text(),'Subscribe')]"));
		// WebElement
		// subscribe=cdriver.findElement(By.xpath("(//div[@id='subscribe-button'])[7]"));

		/*
		 * List<WebElement>
		 * //subscribe1=cdriver.findElements(By.xpath("//div[@id='subscribe-button']"))
		 * ; subscribe1=cdriver.findElements(By.tagName("yt-formatted-string"));
		 * System.out.println(subscribe1.size()); //subscribe1.get(6).click();
		 * 
		 * 
		 * for (WebElement e:subscribe1) { if(e.getText().equals("Subscribe ") ) {
		 * e.click(); break; }
		 * 
		 * }
		 */
	}

	
	  
	 

}
