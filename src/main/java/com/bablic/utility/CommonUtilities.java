package com.bablic.utility;

import java.lang.reflect.Method;
import java.util.Hashtable;


import org.testng.annotations.DataProvider;

import com.bablic.base.Page;

public class CommonUtilities extends Page {
	
	
	public static boolean isTestRunnable(String testName, ExcelReader excel){
		
		
		int total_rows=excel.getRowCount("TC_RunModes");
		
		for(int rNum=2;rNum<total_rows;rNum++){
			
			String testCase=excel.getCellData("TC_RunModes", "TCID", rNum);
			
			if(testCase.equalsIgnoreCase(testName)){
				
				String runMode=excel.getCellData("TC_RunModes", "RunMode", rNum);
				
				if(runMode.equalsIgnoreCase("Y"))
					
					return true;
					else
						return false;
				}
			}
				return false;
				
				
				
				
			}
		
		
		
	
	
	
	
	@DataProvider(name="dp")
	public Object[][] getData(Method m) {

		String sheetName = m.getName();
		System.out.println("sheetname");
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);

		Object[][] data = new Object[rows - 1][1];
		
		//Hashtable is created for each and every row in Excel Sheet where columns are the keys having appropriate value
		
		Hashtable<String,String> table = null;

		for (int rowNum = 2; rowNum <= rows; rowNum++) { // 2

			table = new Hashtable<String,String>(); //For every row a Hashtable will be created
			
			for (int colNum = 0; colNum < cols; colNum++) {

				// data[0][0] where first we getting column data i.e. key and second one is row
				table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
				data[rowNum - 2][0] = table;
			}

		}

		return data;

	}
	
	


}
