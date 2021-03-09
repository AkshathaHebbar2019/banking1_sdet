package com.banking1.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking1.pageobjects.loginpage;


public class logintestcase_1 extends Baseclass {
	
	
	
	@Test
	public void logintest() throws IOException
	{
		 
		 
		 logger.info("url is opened");
		 loginpage lp=new loginpage(driver);
		 lp.setusername(username);
		logger.info("enter username");
		 lp.setpasswd(password);
		logger.info("enter password");
	     lp.submit();
	     System.out.println(driver.getTitle());
	  
	     if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	     {
	    	 Assert.assertTrue(true);
	    	logger.info("login test passes");
	     }
	     else
	     {
	    	 capturescreen(driver,"logintest");
	    	 Assert.assertTrue(false);
	    	logger.info("login test fails");
	     }
	 
	     
	     
	     
		 
	}
	
	

}
