//package com.scripted.selfhealing_Mob_testscripts;
//
//import java.io.FileInputStream;
//import java.io.InputStream;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//import org.apache.log4j.PropertyConfigurator;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//
//import com.scripted.skhealingPageObjects.Mobile_APHomepage;
//
//import com.scripted.skhealingPageObjects.Mobile_APSignInpage;
//import com.scripted.skhealingPageObjects.Mobile_APSignInpage2;
//import com.scripted.AutoPracPageobjects.APHomepage;
//import com.scripted.AutoPracPageobjects.APMyAccountPage;
//import com.scripted.AutoPracPageobjects.APPersonalInformationPage;
//import com.scripted.AutoPracPageobjects.APSignInpage;
//import com.scripted.PageObjects.MyAppPage;
//import com.scripted.PcloudySampleIOSApp.PcloudySampleIOSAppPage;
//import com.scripted.UTSPageObjects.Uts_IrctcPage;
//import com.scripted.configurations.SkriptmateConfigurations;
//import com.scripted.dataload.ExcelConnector;
//import com.scripted.dataload.PropertyDriver;
//import com.scripted.dataload.TestDataFactory;
//import com.scripted.dataload.TestDataObject;
//import com.scripted.generic.FileUtils;
//import com.scripted.jsonWriter.JsonHealingInfoWriter;
//import com.scripted.mobile.MobileDriverSettings;
//import com.scripted.selfhealing.SMWebHealer;
//import com.scripted.web.BrowserDriver;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.ios.IOSDriver;
//
//public class Mobile_Self_Healing_Validation_TestNG extends BaseTest_SelfHealing {
//
//
//
//	@Test(priority=1)
//	public void AndroidWebValidation() {
//		AppiumDriver<WebElement> androidDriver;
//
//		androidDriver = MobileDriverSettings.funcGetWebAndroidDriver("androidWebbrowser");
//		MobileDriverSettings.launchURL("http://automationpractice.com/");
//
//		Mobile_APHomepage homePage = new Mobile_APHomepage(androidDriver);
//		Mobile_APSignInpage signInPage = new Mobile_APSignInpage(androidDriver);
//
//		PropertyDriver propDriver = new PropertyDriver();
//		propDriver.setPropFilePath("src/main/resources/Mobile/Properties/configAutomationPrac.properties");
//		String filename = FileUtils.getCurrentDir() + PropertyDriver.readProp("excelName");
//		String sheetname = "TC001";
//		String key = "";
//
//		ExcelConnector con = new ExcelConnector(filename, sheetname);
//		TestDataFactory test = new TestDataFactory();
//		TestDataObject obj = test.GetData(key, con);
//		LinkedHashMap<String, Map<String, String>> getAllData = obj.getTableData();
//		Map<String, String> fRow = (getAllData.get("1"));
//		try {
//
//			homePage.clickSignin();
//
//			signInPage.login(fRow.get("UserName"), fRow.get("Password"));
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			//homePage.clickLogout();
//		}
//
//		System.out.println("Test Execution completed successfully");
//
//	}
//	
//
//	
//	@Test(priority=2)
//	public void TC001_AutomationpracticeValidation() {
//		BrowserDriver.getCuPalDriver();
//		// WebDriver driver = BrowserDriver.funcGetWebdriver();
//		BrowserDriver.launchWebURL("http://automationpractice.com/");
//		APHomepage homePage = PageFactory.initElements(BrowserDriver.getDriver(), APHomepage.class);
//		APSignInpage signInPage = PageFactory.initElements(BrowserDriver.getDriver(), APSignInpage.class);
//		// APSignInpage signInPage = new
//		// APSignInpage(BrowserDriver.funcGetWebdriver(),);
//		APMyAccountPage myaccountPage = PageFactory.initElements(BrowserDriver.getDriver(), APMyAccountPage.class);
//		APPersonalInformationPage personalInformationPage = PageFactory.initElements(BrowserDriver.getDriver(),
//				APPersonalInformationPage.class);
//		PropertyDriver propDriver = new PropertyDriver();
//		propDriver.setPropFilePath("src/main/resources/Web/properties/configAutomationPrac.properties");
//		String filename = FileUtils.getCurrentDir() + PropertyDriver.readProp("excelName");
//		String sheetname = "TC001";
//		String key = "";
//		ExcelConnector con = new ExcelConnector(filename, sheetname);
//		TestDataFactory test = new TestDataFactory();
//		TestDataObject obj = test.GetData(key, con);
//		// Get the whole data
//		LinkedHashMap<String, Map<String, String>> getAllData = obj.getTableData();
//		// Get specific data
//		Map<String, String> fRow = (getAllData.get("1"));
//		// SkriptmateConfigurations.setSlfHelngProp();
//		try {
//			homePage.clickSignin();
//			signInPage.login(fRow.get("UserName"), fRow.get("Password"));
//			myaccountPage.clickMyPersonalInformation();
//			homePage.clickLogout();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		LOGGER.info("Test Execution completed successfully");
//	}
//
//	@Test(priority=3)
//	public void TC001_iframecheck_NoSwitch() throws InterruptedException {
//		BrowserDriver.getCuPalDriver();
//		// WebDriver driver = BrowserDriver.funcGetWebdriver();
//		MyAppPage myAppPage;
//		BrowserDriver.launchWebURL("https://www.rahulshettyacademy.com/AutomationPractice/");
//		myAppPage = PageFactory.initElements(BrowserDriver.getDriver(), MyAppPage.class);
//		System.out.println("clicked");
//		myAppPage.checkIframewithoutswitch();
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority=4)
//	public void TC001_MyApp() throws InterruptedException {
//		BrowserDriver.getCuPalDriver();
//		// WebDriver driver = BrowserDriver.funcGetWebdriver();
//		MyAppPage myAppPage;
//		BrowserDriver.launchWebURL("https://www.rahulshettyacademy.com/AutomationPractice/");
//		myAppPage = PageFactory.initElements(BrowserDriver.getDriver(), MyAppPage.class);
//		System.out.println("clicked");
//		myAppPage.clkRadioBtn1();
//		Thread.sleep(1000);
//		
//	}
//	
//	/*@Test
//	public void IOSWebValidation()
//	{
//		IOSDriver<WebElement> IOSdriver =  null;
//		
//		IOSdriver = MobileDriverSettings.funcGetpCloudyWebIOSdriver("pcloudyIOSWeb");
//		MobileDriverSettings.launchURL("http://automationpractice.com/");
//
//		Mobile_APHomepage homePage = new Mobile_APHomepage(IOSdriver);
//		Mobile_APSignInpage signInPage = new Mobile_APSignInpage(IOSdriver);
//		
//		PropertyDriver propDriver = new PropertyDriver();
//		propDriver.setPropFilePath("src/main/resources/properties/configAutomationPrac.properties");
//		String filename = FileUtils.getCurrentDir() + PropertyDriver.readProp("excelName");
//		String sheetname = "TC001";
//		String key = "";
//		
//		
//		ExcelConnector con = new ExcelConnector(filename, sheetname);
//		TestDataFactory test = new TestDataFactory();
//		TestDataObject obj = test.GetData(key, con);
//		LinkedHashMap<String, Map<String, String>> getAllData = obj.getTableData();
//
//		Map<String, String> fRow = (getAllData.get("1"));
//		try {
//		
//		homePage.clickSignin();
//		signInPage.login(fRow.get("UserName"), fRow.get("Password"));
//
//		homePage.clickLogout();		
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
//		
//			IOSdriver.quit();
//	
//		
//		System.out.println("Test Execution completed successfully");
//	}
//	
//	@Test
//	public void IOSNativeValidation()
//	{
//		IOSDriver<WebElement> iosDriver = null;
//		try {
//			
//		iosDriver  = MobileDriverSettings.funcGetpCloudyNativeIOSdriver("pCloudyIOSAPP");
//		PcloudySampleIOSAppPage iosApp = new PcloudySampleIOSAppPage(iosDriver);
//		iosApp.login("test@testname.com", "testmunk");
//		//iosApp.actions();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		iosDriver.quit();
//		
//		System.out.println("IOS native test execution completed succesfully");
//	}
//*/
//	
////	@Test
////	public void AndroidNativeVAlidation() {
////		AndroidDriver<WebElement> androidDriver = null;
////		androidDriver = MobileDriverSettings.funcGetNativeAndroiddriver("irctcConfig");
////		//SkriptmateConfigurations.setSlfHelngProp();
////		try {
////			InputStream log4j = new FileInputStream(
////					"D:\\workspace-TAF-newstructure\\ScriptedRepo\\TAF-Scripting\\src\\main\\resources\\logConf\\log4j.properties");
////			PropertyConfigurator.configure(log4j);
////			Uts_IrctcPage utsIrcts = new Uts_IrctcPage(androidDriver);
////			utsIrcts.searchTicket();
////			utsIrcts.selectTrain();
////			System.out.println("Android native test execution completed successfully");
////		} catch (Exception e) {
////
////		} finally {
////			MobileDriverSettings.closeDriver();
////
////		}
////
////	}
//}
