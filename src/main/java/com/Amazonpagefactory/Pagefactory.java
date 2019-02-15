package com.Amazonpagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pagefactory {
	private String Url="https://www.amazon.com/";
	private String Uname="alamsam476@gmail.com";
	private String UPass="zunaira2015";
	
	@FindBy(xpath="//*[@class='nav-a nav-a-2']")
	private WebElement ClickSignInButton;
	@FindBy(xpath="//*[@id='ap_email'")
	private WebElement UnameBox;
	@FindBy(xpath="//*[@id='ap_password']")
	private WebElement UPassBox;
	@FindBy(xpath="//*[@id='signInSubmit']")
	private WebElement ClickSignIn;
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getUPass() {
		return UPass;
	}
	public void setUPass(String uPass) {
		UPass = uPass;
	}
	public WebElement getClickSignInButton() {
		return ClickSignInButton;
	}
	public void setClickSignInButton(WebElement clickSignInButton) {
		ClickSignInButton = clickSignInButton;
	}
	public WebElement getUnameBox() {
		return UnameBox;
	}
	public void setUnameBox(WebElement unameBox) {
		UnameBox = unameBox;
	}
	public WebElement getUPassBox() {
		return UPassBox;
	}
	public void setUPassBox(WebElement uPassBox) {
		UPassBox = uPassBox;
	}
	public WebElement getClickSignIn() {
		return ClickSignIn;
	}
	public void setClickSignIn(WebElement clickSignIn) {
		ClickSignIn = clickSignIn;
	}
	
	
	
	
	
	
	
	
	
	
	
}
	