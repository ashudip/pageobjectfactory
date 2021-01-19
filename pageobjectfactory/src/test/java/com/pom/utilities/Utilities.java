package com.pom.utilities;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Hashtable;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import com.pom.base.Page;

public class Utilities extends Page {

	
	
	public static String screenshot;
	// ExcelReader excel;

	// int rows, col;
	// String excelpath = "/src/test/resources/excel/Testdata.xlsx";

	public static void CaptureScreenShot() throws IOException {

		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH:mm:ss").format(Calendar.getInstance().getTime());
		System.out.println(timeStamp);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		screenshot = timeStamp + ".jpg";
		FileUtils.copyFile(src,
		new File(System.getProperty("user.dir") + "/target/surefire-reports/html/" + screenshot));

	}

	public static Boolean runmode(String tescasename, ExcelReader ex) {

		String nameofsheet = "TestSuite";
		int rows = ex.getRowCount(nameofsheet);
		for (int rownum = 2; rownum <= rows; rownum++) {
			String testcase = ex.getCellData(nameofsheet, "TCID", rownum);
			System.out.println("Test case from excel = " + testcase);
			if (testcase.equalsIgnoreCase(tescasename)) {
				String runmode = ex.getCellData(nameofsheet, "RUNMODE", rownum);
				if (runmode.equalsIgnoreCase("Y")) {
					return true;

				} else {
					return false;
				}
			}
		}
		return false;

	}

	@DataProvider(name = "dp")
	public Object[][] getdata(Method m) {

		String sheetname = m.getName();
		System.out.println("sheetname = " + sheetname);
		rows = excel.getRowCount(sheetname);
		System.out.println("rows=" + rows);
		col = excel.getColumnCount(sheetname);

		Hashtable<String, String> table = null;

		Object data[][] = new Object[rows - 1][1];

		for (int rowsnum = 2; rowsnum <= rows; rowsnum++) {

			table = new Hashtable<String, String>();

			for (int colnum = 0; colnum < col; colnum++) {

				table.put(excel.getCellData(sheetname, colnum, 1), excel.getCellData(sheetname, colnum, rowsnum));

				data[rowsnum - 2][0] = table;
			}
		}
		return data;

	}
}
