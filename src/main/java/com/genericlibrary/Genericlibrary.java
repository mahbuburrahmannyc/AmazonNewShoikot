package com.genericlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.Amazonpagefactory.Pagefactory;


public class Genericlibrary {
	WebDriver driver;
	Pagefactory pf;
	
	public void getSetup() {
		System.setProperty("webriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32");
driver=new ChromeDriver();
pf=PageFactory.initElements(driver,Pagefactory.class);
driver.get(pf.getUrl());
driver.manage().window().maximize();}
	

public void signin() {
	pf.getClickSignInButton().click();
	pf.getUnameBox().sendKeys(pf.getUname());
	pf.getUPassBox().sendKeys(pf.getUPass());
	pf.getClickSignIn().click();
	
	
	
	 

	 
	 
	
	 
	 
	 
	 
	 
	
	
	 
		
	}
	
	


}
