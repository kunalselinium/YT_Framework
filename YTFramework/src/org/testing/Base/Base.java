package org.testing.Base;

import java.io.*;
import java.util.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

public ChromeOptions options;	
public ChromeDriver cdriver;
public Properties pr;
//public String expecteduserid="kunalselinium@gmail.com";
//public String expectedtitle="YouTube";	
	 
@BeforeMethod  
	public void BrowserLaunchAndPropertiesLoad() throws IOException {
	File f =new File("../YTFramework/or.properties");
	FileInputStream fi=new FileInputStream(f);
	pr=new Properties();
	pr.load(fi);
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
	options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	cdriver=new ChromeDriver(options);
	cdriver.get("https://www.youtube.com/");
	cdriver.manage().window().maximize();
	}
	
 @AfterMethod 
	  public void CloseMethod() throws InterruptedException {
	  Thread.sleep(10000); 
	  cdriver.close(); 
	  }
	 
	 
}
