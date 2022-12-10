package com.qa.testscripts;

import org.junit.BeforeClass;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Base 
{
WebDriver driver;
@org.testng.annotations.Parameters({"Browser","Url"})
@org.testng.annotations.BeforeClass
public void SetDriver(String browser,String url)
{
	if(browser.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.get(url);
	
}
@AfterClass
public void teradown()
{
	driver.close();
}
}
