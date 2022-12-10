package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.Cleartrippages;



public class Tc_01 extends Test_Base
{
	Cleartrippages t=new Cleartrippages(driver);

	@DataProvider(name="getdata")
	public String[][] getData() throws IOException {
		
		String xFile="C:\\Users\\aksha\\w2\\TestExcel\\src\\test\\java\\com\\qa\\testdata\\DataAMZN.xlsx";
		String xSheet="Sheet1";
		
		int rowCount = ExcelUtility.getRowCount(xFile, xSheet);
		int cellCount = ExcelUtility.getCellCount(xFile, xSheet, rowCount);
		System.out.println("rows = "+rowCount);
		System.out.println("cells = "+cellCount);
		
		String[][] data = new String[rowCount][cellCount];
		
		for(int i=1; i<=rowCount; i++) {
			for(int j=0;j<cellCount;j++) {
				data[i-1][j] = ExcelUtility.getCellData(xFile, xSheet, i, j);
			}
		}
		return data;
}
	@Test(dataProvider = "getdata")
	public void getTest(String catagory, String items ) throws IOException, InterruptedException {
	PageFactory.initElements(driver, Cleartrippages.class);
	Thread.sleep(5000);
	t.Cancel().click();

}
