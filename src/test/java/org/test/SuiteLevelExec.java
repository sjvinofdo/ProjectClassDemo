package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SuiteLevelExec extends BaseClass {
	@BeforeClass
	public static void beforeClass() {
		browserConfig();
		openURL("http://adactinhotelapp.com/index.php");
		 maximizeWindow();
	}
	
	@AfterClass
	public static void afterClass() {
		closeBrowser();
	}

	@Test
	public void testCase1() throws Exception {
				input(new AdactinHtlAppPageFactory().getTxtUsername(),excelRead("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenExcel.xlsx",
						"LoginInformation", 1, 0));
				input(new AdactinHtlAppPageFactory().getTxtPassword(),excelRead("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenExcel.xlsx",
						"LoginInformation", 1, 1));

	}
	
	@Test
	public void testCase2()  {
		click(new AdactinHtlAppPageFactory().getBtnLogin());
	}
	
	
}
