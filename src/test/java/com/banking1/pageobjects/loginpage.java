package com.banking1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking1.testcases.Baseclass;

public class loginpage extends Baseclass {
	
	
	WebDriver ldriver;
	
	public loginpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtusrname;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtpswd;
	
	@FindBy(xpath="//input[@name=\"btnLogin\"]")
	@CacheLookup
	WebElement loginbtn;
	
	@FindBy(xpath="//a[text()='Log out']")
	@CacheLookup
	WebElement logout;
	
	public void setusername(String uname)
	{
		txtusrname.sendKeys(uname);
	}
	
	public void setpasswd(String pwd)
	{
		txtpswd.sendKeys(pwd);
	}
	
	public void submit()
	{
		loginbtn.submit();
		
	}
	
	
	public void  logout()
	{
		logout.click();
	}
	

}
