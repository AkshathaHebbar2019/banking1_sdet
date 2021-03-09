package com.banking1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcustomerpage {
	
	WebDriver ldriver;
	
	public Addcustomerpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[text()='New Customer']")
	@CacheLookup
	WebElement newcustomer;
	
	@FindBy(name="name")
	@CacheLookup
	WebElement customername;
	
	@FindBy(xpath="//input[@value='m']")
	@CacheLookup
	WebElement rgender;
	
	@FindBy(xpath="//input[@id=\"dob\"]")
	@CacheLookup
	WebElement dob ;
	
	@FindBy(name="addr")
	@CacheLookup
	WebElement address ;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement custcity ;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement custstate ;
	
	@FindBy(name="pinno")
	@CacheLookup
	WebElement pinnumber ;
	
	@FindBy(name="telephoneno")
	@CacheLookup
	WebElement phoneno ;
	
	@FindBy(name="emailid")
	@CacheLookup
	WebElement mailid ;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement password ;
	
	@FindBy(name="sub")
	@CacheLookup
	WebElement submit;
	
	@FindBy(name="res")
	@CacheLookup
	WebElement reset;
	
	
	public void newcustomer()
	{
		newcustomer.click();
	}
	
	public void customername(String cname)
	{
		customername.sendKeys(cname);
	}
	
	public void customergender()
	{
		rgender.click();
	}
	
	public void customerdob(String mm,String dd,String yy)
	{
		dob.sendKeys(mm);
		dob.sendKeys(dd);
		dob.sendKeys(yy);
	}
	
	public void custaddress(String caddress)
	{
		address.sendKeys(caddress);
	}
	
	public void custcity(String city)
	{
		custcity.sendKeys(city);
	}
	
	public void custstate(String state)
	{
		custstate.sendKeys(state);
	}
	
	public void custpin(String string)
	{
		pinnumber.sendKeys(String.valueOf(string));
	}
	
	public void custphoneno(String custphoneno)
	{
		phoneno.sendKeys(custphoneno);
	}
	
	public void custmail(String custmail)
	{
		mailid.sendKeys(custmail);
	}
	
	public void custpwd(String custpwd)
	{
		password.sendKeys(custpwd);
	}
	
	public void submit()
	{
		submit.click();
	}
	
	public void reset()
	{
		reset.click();
	}
	
	
	
	
	
	

}
