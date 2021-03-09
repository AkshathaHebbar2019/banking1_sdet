package com.banking1.utilites;
//listener class used to generate extent reports
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.ExtentReporter;

public class reporting extends TestListenerAdapter
{
  public ExtentHtmlReporter htmlReporter;
  public ExtentReports extent;
  public ExtentTest logger;
}
