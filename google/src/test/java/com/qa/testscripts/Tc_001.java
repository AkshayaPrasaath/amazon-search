package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.Googlepages;

public class Tc_001 extends Testbase 
{

@Parameters({"Browser","Url"})
@Test
public void dotest() throws InterruptedException
{
	Googlepages k=new Googlepages(driver);
	k.Searchbox().sendKeys("selenium");
	List<WebElement> s=k.Drop();
	Thread.sleep(1000);
	for(WebElement t:s)
	{
		System.out.println(t.getText());
		Thread.sleep(1000);
}}

}
