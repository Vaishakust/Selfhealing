//package com.scripted.selfhealing_Mob_testscripts;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.StaleElementReferenceException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;
//
//import com.scripted.PageObjects.MyAppPage_Mobile;
//import com.scripted.mobile.MobileDriverSettings;
//import com.scripted.web.BrowserDriver;
//
//import io.appium.java_client.android.AndroidDriver;
//
//public class Test_iframe_Mobile extends BaseTest_SelfHealing {
//
//
//	/*
//	 * @Test public void TC001_Mobile_iframecheck_NoSwitch() throws
//	 * InterruptedException { AndroidDriver<WebElement> androidDriver = null;;
//	 * androidDriver =
//	 * MobileDriverSettings.funcGetWebAndroidDriver("androidWebbrowser");
//	 * MobileDriverSettings.launchURL(
//	 * "https://www.rahulshettyacademy.com/AutomationPractice/"); MyAppPage_Mobile
//	 * myAppPage = new MyAppPage_Mobile(androidDriver) ; myAppPage.clkRadioBtn2();
//	 * System.out.println("clicked"); myAppPage.checkIframewithoutswitch();
//	 * Thread.sleep(1000);
//	 * 
//	 * }
//	 */
//	@Test
//	public void TC002_Mobile_MyApp() throws InterruptedException {
//		AndroidDriver<WebElement> androidDriver = null;
//		;
//		androidDriver = MobileDriverSettings.funcGetWebAndroidDriver("androidWebbrowser");
//		MobileDriverSettings.launchURL("https://www.rahulshettyacademy.com/AutomationPractice/");
//		MyAppPage_Mobile myAppPage = new MyAppPage_Mobile(androidDriver);
//		myAppPage.clkRadioBtn1();
//		/*myAppPage.clkRadioBtn2();//radiobutton
//		// myAppPage.checkIframe();
//		 myAppPage.sltChkBx1();//checkbox
//		myAppPage.checkDropDown();//dropdown
//		System.out.println("drop down completed");
//		Thread.sleep(1000);*/
//
//	}
//	/*
//	 * @Test public void TC003_iframecheck_Switch() throws InterruptedException {
//	 * BrowserDriver.getCuPalDriver(); // WebDriver driver =
//	 * BrowserDriver.funcGetWebdriver(); MyAppPage myAppPage;
//	 * BrowserDriver.launchWebURL(
//	 * "https://www.rahulshettyacademy.com/AutomationPractice/"); myAppPage =
//	 * PageFactory.initElements(BrowserDriver.getDriver(), MyAppPage.class);
//	 * myAppPage.clkRadioBtn2(); System.out.println("clicked");
//	 * myAppPage.checkIframe(); Thread.sleep(1000);
//	 * 
//	 * }
//	 */
//}
