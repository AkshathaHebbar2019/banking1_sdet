package com.banking1.testcases;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.apache.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.banking1.utilites.readconfig;


public class Baseclass {
	
	readconfig  rconfig=new readconfig();
	
	//private static final String PropertyConfigurator = null;
	public String baseurl=rconfig.getapplicationurl();
	public String username=rconfig.getusername();
	public String password=rconfig.getpasword();
	public static  WebDriver driver;
	public static Logger  logger;
	
	
	@SuppressWarnings("deprecation")
	@Parameters("browser")
    @BeforeClass
	public void setup(String br)
	{
            if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",rconfig.getchromepath());
			//System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	
			
		driver=new ChromeDriver();
		
		logger=Logger.getLogger(Baseclass.class.getName());
		PropertyConfigurator.configure("log4j.properties");
		
	  
	   System.out.println(driver);
		}
		
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver",rconfig.getchromepath());
			driver=new FirefoxDriver();
		}
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(baseurl); 
		driver.manage().window().maximize();
	}
	
	
	@AfterClass
	public void teardown()
	{
		System.out.println("hi");
		//driver.quit();
	}
	 
 public void capturescreen(WebDriver driver,String tnmae) throws IOException
 {
	 TakesScreenshot ts=(TakesScreenshot) driver;
	 File src=ts.getScreenshotAs(OutputType.FILE);
	 File target=new File(System.getProperty("user.dir") +"/Screenshots/" +tnmae +".png");
	 FileUtils.copyFile(src,target);
	 System.out.println("Screenshot taken");
 }
 
 public String randomstring()
 {
	  String generatedstring=RandomStringUtils.randomAlphabetic(5); 
	  return generatedstring;
 }
 
 public String randomnum()
 {
	  String generatestring2=RandomStringUtils.randomNumeric(4);
	  return generatestring2;
 }
 
	
	
	
	
	

}
