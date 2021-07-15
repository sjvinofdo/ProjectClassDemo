package org.test;

public class AdactinHtlAppPageFactoryMain extends BaseClass {

	public static void main(String[] args) throws Exception {
		browserConfig();
		openURL("http://adactinhotelapp.com/index.php");
		maximizeWindow();

		AdactinHtlAppPageFactory aapf = new AdactinHtlAppPageFactory();

		input(aapf.getTxtUsername(), excelRead("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenExcel.xlsx",
				"LoginInformation", 1, 0));
		input(aapf.getTxtPassword(), excelRead("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenExcel.xlsx",
				"LoginInformation", 1, 1));
		click(aapf.getBtnLogin());

		selectByIndex(aapf.getDdnLocation(), 5);
		selectByValue(aapf.getDdnHotel(), "Hotel Sunshine");
		selectByVisibleText(aapf.getDdnRoomType(), "Super Deluxe");
		selectByValue(aapf.getDdnNoofRoom(), "2");
		clear(aapf.getTxtCheckInDate());
		input(aapf.getTxtCheckInDate(), excelRead("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenExcel.xlsx",
				"HotelInformation", 1, 0));
		clear(aapf.getTxtCheckOutDate());
		input(aapf.getTxtCheckOutDate(), excelRead("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenExcel.xlsx",
				"HotelInformation", 1, 1));
		selectByValue(aapf.getDdnAdultsRoom(), "2");
		selectByVisibleText(aapf.getDdnChildrenRoom(), "2 - Two");
		click(aapf.getBtnSearch());
		click(aapf.getRadioButtonSelect());
		click(aapf.getBtnContinue());
		input(aapf.getTxtFirstName(), excelRead("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenExcel.xlsx",
				"HotelInformation", 1, 2));
		input(aapf.getTxtLastName(), excelRead("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenExcel.xlsx",
				"HotelInformation", 1, 3));
		input(aapf.getTxtBillingAddress(), excelRead(
				"E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenExcel.xlsx", "HotelInformation", 1, 4));
		input(aapf.getTxtCreditCardNo(), excelRead("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenExcel.xlsx",
				"HotelInformation", 1, 5));
		selectByValue(aapf.getDdnCreditCardType(), "MAST");
		selectByVisibleText(aapf.getDdnExpiryDateMonth(), "August");
		selectByIndex(aapf.getDdnExpiryDateYear(), 12);
		input(aapf.getTxtCVVNo(), excelRead("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenExcel.xlsx",
				"HotelInformation", 1, 6));
		click(aapf.getBtnBookNow());
		Thread.sleep(10000);
		String text = aapf.getTxtOrderNo().getAttribute("value");
		System.out.println("Order Number :" + text);
		excelwrite("E:\\Vinodhini Workspace\\MavenProject\\Excel\\DataDrivenExcel.xlsx", "OrderInformation", 0, 0,
				text);
		click(aapf.getBtnLogout());
	}

}
