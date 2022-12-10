package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testscripts.Test_Base;

public class Cleartrippages extends Test_Base
{
	WebDriver driver;
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/svg")
	WebElement cancel;
	
	public WebElement Cancel()
	{
		return cancel;
	}
	public Amazonpages(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
