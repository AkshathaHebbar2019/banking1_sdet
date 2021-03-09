package com.banking1.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.banking1.pageobjects.loginpage;
import com.banking1.utilites.XLutils;

public class logintestcase_Excel extends Baseclass  {  
	
  @Test(dataProvider="Logindata")
  public void loginDDT(String user,String pwd) throws InterruptedException, IOException
  
  {
	  loginpage lp=new loginpage(driver);
	  lp.setusername(user);
	  logger.info("user name provided");
	  lp.setpasswd(pwd);
	  logger.info("password provided");
	  lp.submit(); 
	 Thread.sleep(3000);
	  
	  
	  if(isAlertPresent()==true)
	  {
		  driver.switchTo().alert().accept();//closealert
		  driver.switchTo().defaultContent();
		  capturescreen(driver,"logouttest");
		  Assert.assertTrue(false);
		  
		  logger.warn("Logi failed");
	  }
	  
	  else
	  {
		  Assert.assertTrue(true);
		  lp.logout();
		  Thread.sleep(3000);
		  driver.switchTo().alert().accept();// close logout alert
		  driver.switchTo().defaultContent();
		  
	  }
  }
  
  
  public boolean isAlertPresent()//user defined method  create to check alert is present or not  
  {
	  
	  try
	  {
		  driver.switchTo().alert();
		  return true;
	  }
	  catch(Exception e)
	  {
		  return false;
	  }
	  
	  
  }
  
  @DataProvider(name="Logindata")
    String[][] getdata() throws IOException
  {
	  String path=System.getProperty("user.dir") +"/src/test/java/com/banking1/testdata/testdata.xlsx";
	  
	  int rownum=XLutils.getrowcount(path, "Sheet1");
	  int colcount=XLutils.getcellcount(path,"Sheet1",1);
	  
	  String logindata[][]=new String[rownum][colcount];
	  
	  
	  for(int i=1;i<=rownum;i++) 
	  {
		  for(int j=0;j<colcount;j++)
		  {
			  logindata[i-1][j]=XLutils.getcelldata(path,"Sheet1",i,j);
		  }
        
	  }
	  return logindata;
  }
  
  
}
