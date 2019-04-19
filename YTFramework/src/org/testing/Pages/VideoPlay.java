package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Utilities.Logs;


public class VideoPlay {
	
	
	  ChromeDriver cdriver; 
	  Properties pr; 
	
	  public VideoPlay(ChromeDriver cdriver,Properties pr)
	  { 
		  this.cdriver=cdriver;
	      this.pr=pr; 
	      }
	  
	
	public void Video() throws InterruptedException
	{
		WebElement videoplay=cdriver.findElement(By.xpath(pr.getProperty("playvideo")));
		videoplay.click();
		Logs.takeLogs("VideoPlay", "Video played successfully");
		Thread.sleep(10000);
		
	}

}
