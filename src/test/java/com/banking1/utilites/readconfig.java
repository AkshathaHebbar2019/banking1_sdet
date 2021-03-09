package com.banking1.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readconfig {
	
	Properties pro;
	public readconfig()
	{
		File src=new File("./configuration/config.properties");
		
		try
		{
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is" +e.getMessage());
		}
		
	}
	
      public String getapplicationurl()
      {
    	  String url=pro.getProperty("baseurl");
    	  return url;
      }
      
       public String getusername()
       {
    	   String username=pro.getProperty("username");
    	   return username;
       }
       
       public String getpasword()
       {
    	   String password=pro.getProperty("password");
    	   return password;
       }
       
       public String getchromepath()
       {
    	   String chromepath=pro.getProperty("chromepath");
    	   return chromepath;
       }
	
	
	
}
