package com.qa.testscripts;
import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.qa.pages.Ctpages;
import com.qa.utility.ExcelUtility;

public class Tc_1 extends Testbase
{
	
	@DataProvider(name = "getdata")
	public String[][] getData() throws IOException {

	String xFile = "C:\\Users\\aksha\\w2\\a\\src\\test\\java\\com\\qa\\testdata\\Flight_data.xlsx";
	String xSheet = "Sheet1";

	int rowCount = ExcelUtility.getRowCount(xFile, xSheet);
	int cellCount = ExcelUtility.getCellCount(xFile, xSheet, rowCount);
	System.out.println("Rows Count of XFile = " + rowCount);
	System.out.println("Column Count of XFile = " + cellCount);

	String[][] data = new String[rowCount][cellCount];

	for (int i = 1; i <= rowCount; i++) {
	for (int j = 0; j < cellCount; j++) {
	data[i - 1][j] = ExcelUtility.getCellData(xFile, xSheet, i, j);
	}
	}
	return data;
	}

	@Test(dataProvider = "getdata")
	public void getTest(String source, String destination) throws IOException, InterruptedException {
		PageFactory.initElements(driver, Ctpages.class);
		Thread.sleep(3000);
		//Ctpages.cancel.click();
		/*
		Thread.sleep(3000);
		Ctpages.d1.click();
		Thread.sleep(1000);
		Ctpages.drop2.click();
		Thread.sleep(1000);
		Ctpages.get.click();
		Thread.sleep(1000);
		*/
	    Ctpages.from.click();
	    Ctpages.from.sendKeys(source + Keys.ENTER);
	    Ctpages.dc1.click();
		Thread.sleep(3000);
	    Ctpages.to.click();
	    Ctpages.to.sendKeys(destination + Keys.ENTER);
	    Ctpages.dc2.click();
		Thread.sleep(3000);
		Ctpages.returndate.click();
		Ctpages.date.click();
		Ctpages.clickenter.click();
		driver.navigate().to("https://www.cleartrip.com/");
		

}
}