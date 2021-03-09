package com.banking1.testcases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.banking1.pageobjects.Addcustomerpage;
import com.banking1.pageobjects.loginpage;

import junit.framework.Assert;

public class addcustomertestcase_1 extends Baseclass {
	
	@Test
	public void addnewcustomer() throws InterruptedException, IOException
	{
		loginpage lp=new loginpage(driver);
		logger.info("customer details");
		lp.setusername(username);
		logger.info("user name is provided");
		lp.setpasswd(password);
		logger.info("password is provided");
		lp.submit();
		
		Thread.sleep(3000);
		Addcustomerpage  ac=new Addcustomerpage(driver);
		
		ac.newcustomer();
		ac.customername("ram");
		logger.info("customeruser name is provided");
		ac.customergender();
		ac.customerdob("12", "02", "2020");
		ac.custaddress("nagara");
		ac.custcity("bangalore");
		ac.custstate("karnataka");
		ac.custpin("566666");
		ac.custphoneno("8888889898");
		String email=randomstring()+"@gmail.com";
		ac.custmail(email);
		ac.custpwd("12345");
		ac.submit();
		Thread.sleep(3000);
		logger.info("validation starte");
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case is passed");
		}
		else
		{
			capturescreen(driver,"addnewcustomer");
			Assert.assertTrue(false);
			logger.info("test case failed");
		}
	}
	
	 

}
