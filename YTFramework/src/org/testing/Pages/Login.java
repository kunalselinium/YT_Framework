package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {
	
	ChromeDriver cdriver;
	Properties pr;

	
	public Login(ChromeDriver cdriver,Properties pr)
	{
		this.cdriver=cdriver;
		this.pr=pr;
	}
	
	public void SignIn(String userid,String pass) throws InterruptedException
	{
		WebElement signinlnk1=cdriver.findElement(By.xpath(pr.getProperty("loginbutton")));
		signinlnk1.click();
		WebElement uname1=cdriver.findElement(By.xpath(pr.getProperty("username")));
		uname1.sendKeys(userid);
		WebElement next1=cdriver.findElement(By.xpath(pr.getProperty("nextbttnuser")));
		next1.click();
		Thread.sleep(3000);
		WebElement pass1=cdriver.findElement(By.xpath(pr.getProperty("password")));
		pass1.sendKeys(pass);
		WebElement next2=cdriver.findElement(By.xpath(pr.getProperty("nextbttnpass")));
		next2.click();
		Thread.sleep(5000);

	}

}
