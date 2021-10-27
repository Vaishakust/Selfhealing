//package com.scripted.PageObjects;
//
//import org.apache.log4j.Logger;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import com.scripted.mobile.MobileHandlers;
//
//import io.appium.java_client.MobileDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.ios.IOSDriver;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//
//public class MyAppPage_Mobile {
//	MobileDriver<WebElement> androidDriver;
//	IOSDriver<WebElement> IOSdriver = null;
//	public static Logger LOGGER = Logger.getLogger(MyAppPage.class);
//
//	@FindBy(xpath = "//input[@value='radio1']")
//	private MobileElement rbtnRadio1;
//	// input[@value='radio1']
//
//	@FindBy(name = "radio123")
//	public MobileElement rbtnRadio2;
//	// input[@value='radio2']
//
//	@FindBy(xpath = "//input[@value='radio3']")
//	private MobileElement rbtnRadio3;
//
//	@FindBy(xpath = "//input[@id='autocomplete']")
//	private MobileElement txtSuggstn;
//
//	@FindBy(name = "nmeeee")
//	private MobileElement drpEg;
//	//select[@id='dropdown-class-example']
//	
//
//	@FindBy(name = "checknbox")
//	private MobileElement chkBx1;
//	// input[@value='option1']
//
//	@FindBy(xpath = "//input[@value='option2']")
//	private MobileElement chkBx2;
//
//	@FindBy(xpath = "//input[@value='option3']")
//	private MobileElement chkBx3;
//
//	@FindBy(xpath = "//button[@id='openwindow']")
//	private MobileElement btnOpnWndw;
//
//	@FindBy(xpath = "//a[@id='opentab']")
//	private MobileElement btnOpnTb;
//
//	// iframe
//	@FindBy(xpath = "/html/body/app-root/div/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[2]/a")
//	private MobileElement courses;
//
//	@FindBy(xpath = "/html/body/app-root/div/header/div[1]/div/div/div[2]/div[2]/a")
//	private MobileElement iframeLogin;
//
//	@FindBy(name = "framelink")
//	private MobileElement a_linkFrameContact;
//	// /html[1]/body[1]/app-root[1]/div[1]/header[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/div[2]/ul[1]/li[9]/a[1]
//
//	@FindBy(id = "courses-iframe")
//	private MobileElement iframeTab;
//
//	/////// Alerts
//	@FindBy(id = "alertbtn")
//	private MobileElement alertBtn;
//
//	@FindBy(id = "confirmbtn")
//	private MobileElement cnrmBtn;
//
//	@FindBy(id = "id")
//	private MobileElement nameTxt;
//
//	@FindBy(id = "username")
//	private MobileElement CntctUsrName;
//
//	public MyAppPage_Mobile(MobileDriver<WebElement> androidDriver) {
//		this.androidDriver = androidDriver;
//		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
//	}
//
//	public MyAppPage_Mobile(IOSDriver<WebElement> IOSdriver) {
//		this.IOSdriver = IOSdriver;
//		PageFactory.initElements(new AppiumFieldDecorator(IOSdriver), this);
//	}
//
//	public void checkAlert() {
//		// MobileHandlers.click(alertBtn);
//		MobileHandlers.enterText(nameTxt, "Flower");
//	}
//
//	public void clkRadioBtn1() {
//		MobileHandlers.click(rbtnRadio1);
//	}
//
//	public void clkRadioBtn2() {
//		MobileHandlers.click(rbtnRadio2);
//	}
//
//	public void clkRadioBtn3() {
//		MobileHandlers.click(rbtnRadio3);
//	}
//
//	public void entSuggstn() {
//		MobileHandlers.enterText(txtSuggstn, "India");
//	}
//
//	public void sltChkBx1() {
//		MobileHandlers.click(chkBx1);
//	}
//
//	public void sltChkBx2() {
//		MobileHandlers.click(chkBx2);
//	}
//
//	public void sltChkBx3() {
//		MobileHandlers.click(chkBx3);
//	}
//
//	public void checkIframe() {
//
//		MobileHandlers.switchToFrame(iframeTab);
//		MobileHandlers.click(a_linkFrameContact);
//		MobileHandlers.click(CntctUsrName);
//
//	}
//
//	public void checkIframewithoutswitch() {
//
//		MobileHandlers.switchToFrame(iframeTab);
//		MobileHandlers.click(a_linkFrameContact);
//		MobileHandlers.click(CntctUsrName);
//
//	}
//
//	public void checkDropDown() {
//		MobileHandlers.dropDownSetByVal(drpEg, "Option3");
//	}
//}
