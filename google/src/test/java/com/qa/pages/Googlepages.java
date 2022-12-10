package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Googlepages 
{
WebDriver driver;
@FindBy(name="q")
WebElement search;

public WebElement Searchbox()
{
	return search;
}
@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]")
List<WebElement> drop;
public List<WebElement> Drop()
{
	return drop;
}
public Googlepages(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
