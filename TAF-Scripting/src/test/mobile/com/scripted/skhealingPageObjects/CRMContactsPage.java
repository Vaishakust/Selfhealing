//package com.scripted.skhealingPageObjects;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//
//import io.appium.java_client.MobileDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import com.scripted.mobile.MobileHandlers;
//
//public class CRMContactsPage {
//
//	MobileDriver<WebElement> androidDriver ;
//	
//	@FindBy(xpath = "//input[@name='last_name']")
//	private MobileElement Lname;
//	@FindBy(xpath = "//input[@name='first_name']")
//	private MobileElement Fname;
//	@FindBy(xpath = "//div[@name='company']//input[@class='search']")
//	private MobileElement Comname;
//	@FindBy(xpath = "//input[@name='day']")
//	private MobileElement Bdate;
//	@FindBy(xpath = "//span[text()='May']")
//	private MobileElement Bmonth;
//	@FindBy(xpath = "//input[@name='year']")
//	private MobileElement Byear;
//	@FindBy(xpath = "//i[@class='save icon']")
//	private MobileElement savebtn;
//	@FindBy(xpath = "//i[@class='edit icon']")
//	private MobileElement newbtn;
//	@FindBy(xpath = "//div[@name='timezone']/input")
//	private MobileElement tzone;
//	@FindBy(xpath = "//div[@name='month']")
//	private MobileElement bmonth;
//	@FindBy(xpath = "//i[@class='trash icon']")
//	private MobileElement delbtn;
//	@FindBy(xpath = "//i[@class='remove icon']")
//	private MobileElement okbtn;
//	@FindBy(xpath = "//div[@id='top-header-menu']//div[@class='ui buttons']/div")
//	private MobileElement settingicn;
//	@FindBy(xpath = "//span[text()='Log Out']")
//	private MobileElement Logout;
//	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
//	private MobileElement contacts;
//	@FindBy(xpath = ".//div[contains(@class,'main-content')]//table[@class='ui celled sortable striped table custom-grid table-scroll']")
//	private MobileElement table;
//	@FindBy(xpath = "//div[@name='source']")
//	private MobileElement source;
//	@FindBy(xpath = "//div[@name='category']")
//	private MobileElement category;
//	@FindBy(xpath = "//div[@name='status']")
//	private MobileElement status;
//	@FindBy(xpath = "//div[@class='ui toggle checkbox']//input[@name='do_not_call']")
//	private MobileElement radio1;
//	@FindBy(xpath = "//div[@class='ui toggle checkbox']//input[@name='do_not_email']")
//	private MobileElement radio2;
//	@FindBy(xpath = "//button[@class='ui button']")
//	private MobileElement dltbtn;
//
//	public CRMContactsPage(MobileDriver<WebElement> androidDriver) {
//		this.androidDriver = androidDriver;
//		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
//	}
//	public void enterPersonalDetails(String fname, String lname, String cname, String timezone)
//			throws InterruptedException {
//		MobileHandlers.click(newbtn);
//		MobileHandlers.enterText(Fname, fname);
//		MobileHandlers.enterText(Lname, lname);
//		MobileHandlers.enterText(Comname, cname);
//		Comname.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		MobileHandlers.enterText(tzone, timezone);
//		// MobileHandlers.click(radio1);
//		// MobileHandlers.click(radio2);
//
//	}
//
//	public void clickContacts() {
//		MobileHandlers.click(contacts);
//	}
//
//	public void enterBOD(String date, String month, String year) {
//		MobileHandlers.enterText(Bdate, date);
//		//MobileHandlers.divSpanListBox(bmonth, month);
//		MobileHandlers.enterText(Byear, year);
//	}
//
//	public void clickSaveBtn() {
//		MobileHandlers.click(savebtn);
//	}
//
//	public void deleteRecord(String strValue) throws InterruptedException {
//		MobileHandlers.click(contacts);
//		Thread.sleep(3000);
//		MobileHandlers.TblCelChkboxClick(table, strValue);
//		TblCelEleClick(table, strValue, "Delete");
//	}
//
//	public void TblCelEleClick(MobileElement objTable, String tableVal, String objectName) {
//
//		try {
//			By byEle = MobileHandlers.mobileElementBy(objTable);
//			String strEle = byEle.toString();
//			String[] splitStrEle = strEle.split(":");
//			String tblXpath = splitStrEle[1];
//			//String index = MobileHandlers.getFirstIndexofVal(objTable, tableVal);
//			//String[] arrSplit = index.split(",");
//
//			if (objectName.equalsIgnoreCase("Delete")) {
//				//driver.findElement(By.xpath(
//					//	tblXpath + "//tr[" + arrSplit[0] + "]//td[7]//div//button[@class='ui icon inverted button']"))
//					//	.click();
//				//WebWaitHelper.waitForElementPresence(dltbtn);
//				MobileHandlers.click(dltbtn);
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//	}
//
//	public void logout() {
//		MobileHandlers.click(settingicn);
//		MobileHandlers.click(Logout);
//	}
//
//	public void headerVal() {
//		System.out.println(MobileHandlers.getTblHeaderVal(table));
//	}
//
//	public void BodyVal() {
//		System.out.println(MobileHandlers.getTblBodyVal(table));
//	}
//
//	public void tdValue() {
//		System.out.println(MobileHandlers.getTblTdVal(table, 2, 1));
//	}
//
//	public void thValue() {
//		System.out.println(MobileHandlers.getTblThVal(table, 0, 3));
//	}
//
//	public void inxValue() {
//		System.out.println(MobileHandlers.getIndexofVal(table, "Shamir Ahamed"));
//	}
//
//	public void colmapHdrValue(String str) {
//		System.out.println(MobileHandlers.getColMapByHdrVal(table, str));
//	}
//
//	public void rowmapHdrValue(int rowHeader) {
//		System.out.println(MobileHandlers.getRowMapByIndxVal(table, rowHeader));
//	}
//
//	public void ColMapByIndxVal() {
//		System.out.println(MobileHandlers.getColMapByIndxVal(table, 2));
//	}
//
//	public void RowMapByIndxVal() {
//		System.out.println(MobileHandlers.getRowMapByIndxVal(table, 2));
//	}
//
//	public void tblLink(String str) {
//		MobileHandlers.TblCelLinkClick(table, str);
//	}
//
//	public void selectListBoxes(String src, String cat, String stat) {
//	//	MobileHandlers.divSpanListBox(source, src);
//	//	MobileHandlers.divSpanListBox(category, cat);
//	//	MobileHandlers.divSpanListBox(status, stat);
//	}
//
//}
