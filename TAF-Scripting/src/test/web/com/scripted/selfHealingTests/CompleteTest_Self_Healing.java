//package com.scripted.selfHealingTests;
//
//import java.io.FileInputStream;
//import java.io.InputStream;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//import org.apache.log4j.PropertyConfigurator;
//import org.openqa.selenium.TimeoutException;
//import org.openqa.selenium.UnhandledAlertException;
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
//import com.scripted.AutoPracPageobjects.OrangeHRMPage;
//import com.scripted.AutoPracPageobjects.APMyAccountPage;
//import com.scripted.AutoPracPageobjects.APPersonalInformationPage;
//import com.scripted.AutoPracPageobjects.APSignInpage;
//import com.scripted.CRMPomObjects.CRMContactsPage;
//import com.scripted.CRMPomObjects.CRMLoginPage;
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
//import io.appium.java_client.android.AndroidDriver;
//
//public class CompleteTest_Self_Healing extends BaseTest_SelfHealing {
//	
///*
//	@Test	
//	public void TC002_AlertAcceptTest() throws InterruptedException
//	{
//		 BrowserDriver.getCuPalDriver();
//		 WebDriver driver = BrowserDriver.getDriver();
//		 smHealer smhealer = new smHealer();
//		BrowserDriver.launchWebURL("https://chandanachaitanya.github.io/selenium-practice-site/");
//
//		WebSampleSwitchToWindowPage webSampleSwitchToWindowPage = PageFactory.initElements(driver, WebSampleSwitchToWindowPage.class);
//		try
//		{
//		webSampleSwitchToWindowPage.confirmAlert();
//		//	throw new UnhandledAlertException("");
//			
//		}
//		catch(UnhandledAlertException e)
//		{
//			System.out.println("inside unhandled alert exception");
//			WebElement	HealdLctr = smhealer.initiateHealing(e, webSampleSwitchToWindowPage.Message,BrowserDriver.getlthDriver());
//		}
//	
//		webSampleSwitchToWindowPage.OldWindow();
//		System.out.println("Test Execution completed successfully");
//		BrowserDriver.closeBrowser();
//	}
//	
//	@Test	
//	public void TC003_AlertDismissTest() throws InterruptedException
//	{
//		 BrowserDriver.getCuPalDriver();
//		 smHealer smhealer = new smHealer();
//		 WebDriver driver = BrowserDriver.getDriver();
//		BrowserDriver.launchWebURL("https://chandanachaitanya.github.io/selenium-practice-site/");
//
//		WebSampleSwitchToWindowPage webSampleSwitchToWindowPage = PageFactory.initElements(driver, WebSampleSwitchToWindowPage.class);
//		try
//		{
//		webSampleSwitchToWindowPage.confirmAlert();
//			throw new UnhandledAlertException("");
//			
//		}
//		catch(UnhandledAlertException e)
//		{
//			System.out.println("inside unhandled alert exception");
//			WebElement	HealdLctr = smhealer.initiateHealing(e, WebSampleSwitchToWindowPage.Message,BrowserDriver.getlthDriver());
//		}
//		webSampleSwitchToWindowPage.OldWindow();
//		System.out.println("Test Execution completed successfully");
//		BrowserDriver.closeBrowser();
//	}
//	*/
//	
//	/*@Test
//	public void TC004_StaleStateCheck()
//	{ smHealer smhealer = new smHealer();
//		 BrowserDriver.getCuPalDriver();
//		 WebDriver driver = BrowserDriver.getDriver();
//		BrowserDriver.launchWebURL("http://automationpractice.com/");
//
//		APHomepage homePage = PageFactory.initElements(driver, APHomepage.class);
//		APSignInpage signInPage = PageFactory.initElements(driver, APSignInpage.class);
//		APMyAccountPage myaccountPage = PageFactory.initElements(driver, APMyAccountPage.class);
//		APPersonalInformationPage personalInformationPage = PageFactory.initElements(driver, APPersonalInformationPage.class);
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
//
//		// Get the whole data
//		LinkedHashMap<String, Map<String, String>> getAllData = obj.getTableData();
//
//		// Get specific data
//		Map<String, String> fRow = (getAllData.get("1"));
//		
//		try
//		{
//			homePage.clickSignin();
//		}
//		catch(StaleStateException e)
//		{
//			WebElement HealdLctr = smhealer.initiateHealing(e, homePage.Signin,BrowserDriver.getlthDriver());
//			
//		}	
//		System.out.println("Test Execution completed successfully");
//		BrowserDriver.closeBrowser();
//
//		
//	}*/
//	
//	@Test
//	public void TC005_Amazon()
//	{	
//		SMWebHealer smhealer = new SMWebHealer();
//		 BrowserDriver.getCuPalDriver();
//		 WebDriver driver = BrowserDriver.getDriver();
//		BrowserDriver.launchWebURL("https://www.amazon.in/");
//
//		OrangeHRMPage homePage = PageFactory.initElements(driver, OrangeHRMPage.class);
//		homePage.clickTestNG();	
//	}
//	
//	
////	@Test
////	public void TC005_TimeoutCheck()
////	{	
////		
////		SMWebHealer smhealer = new SMWebHealer();
////		 BrowserDriver.getCuPalDriver();
////		 WebDriver driver = BrowserDriver.getDriver();
////		BrowserDriver.launchWebURL("http://automationpractice.com/");
////
////		APHomepage homePage = PageFactory.initElements(driver, APHomepage.class);
////		homePage.clickMobile();
////		//APSignInpage signInPage = PageFactory.initElements(driver, APSignInpage.class);
////		APSignInpage signInPage = PageFactory.initElements(driver, APSignInpage.class);
////		APMyAccountPage myaccountPage = PageFactory.initElements(driver, APMyAccountPage.class);
////		APPersonalInformationPage personalInformationPage = PageFactory.initElements(driver, APPersonalInformationPage.class);
////		
////		PropertyDriver propDriver = new PropertyDriver();
////		propDriver.setPropFilePath("src/main/resources/properties/configAutomationPrac.properties");
////		String filename = FileUtils.getCurrentDir() + PropertyDriver.readProp("excelName");
////		String sheetname = "TC001";
////		String key = "";
////		
////		ExcelConnector con = new ExcelConnector(filename, sheetname);
////		TestDataFactory test = new TestDataFactory();
////		TestDataObject obj = test.GetData(key, con);
////
////		// Get the whole data
////		LinkedHashMap<String, Map<String, String>> getAllData = obj.getTableData();
////
////		// Get specific data
////		Map<String, String> fRow = (getAllData.get("1"));
////
////		try
////		{
////			throw new TimeoutException("");
////		}
////		catch(TimeoutException e)
////		{
////			WebElement HealdLctr = smhealer.initiateHealing(e, homePage.Signin,BrowserDriver.getlthDriver());
////			homePage.clickSignin();
////
////		}
////		System.out.println("Test Execution completed successfully");
////	BrowserDriver.closeBrowser();
////	
////		
////	}
//	
///*	@Test
//	public void AndroidNative() {
//		AndroidDriver<WebElement> androidDriver = null;
//		androidDriver = MobileDriverSettings.funcGetNativeAndroiddriver("irctcConfig");
//		//SkriptmateConfigurations.setSlfHelngProp();
//		try {
//			InputStream log4j = new FileInputStream(
//					"D:\\workspace-TAF-newstructure\\ScriptedRepo\\TAF-Scripting\\src\\main\\resources\\logConf\\log4j.properties");
//			PropertyConfigurator.configure(log4j);
//			Uts_IrctcPage utsIrcts = new Uts_IrctcPage(androidDriver);
//			utsIrcts.searchTicket();
//			utsIrcts.selectTrain();
//			System.out.println("Android native test execution completed successfully");
//		} catch (Exception e) {
//
//		} finally {
//			MobileDriverSettings.closeDriver();
//
//		}
//
//	}*/
//
///*	@Test
//	public void AutopracValidation() {
//		AndroidDriver<WebElement> androidDriver;
//
//		androidDriver = MobileDriverSettings.funcGetWebAndroidDriver("androidWebbrowser");
//		MobileDriverSettings.launchURL("http://automationpractice.com/");
//
//		Mobile_APHomepage homePage = new Mobile_APHomepage(androidDriver);
//		Mobile_APSignInpage signInPage = new Mobile_APSignInpage(androidDriver);
//
//		PropertyDriver propDriver = new PropertyDriver();
//		propDriver.setPropFilePath("src/main/resources/properties/configAutomationPrac.properties");
//		String filename = FileUtils.getCurrentDir() + PropertyDriver.readProp("excelName");
//		String sheetname = "TC001";
//		String key = "";
//
//		ExcelConnector con = new ExcelConnector(filename, sheetname);
//		TestDataFactory test = new TestDataFactory();
//		TestDataObject obj = test.GetData(key, con);
//
//		// Get the whole data
//		LinkedHashMap<String, Map<String, String>> getAllData = obj.getTableData();
//
//		// Get specific data
//		Map<String, String> fRow = (getAllData.get("1"));
//
//		// SkriptmateConfigurations.setSlfHelngProp();
//		try {
//
//			homePage.clickSignin();
//
//			signInPage.login(fRow.get("UserName"), fRow.get("Password"));
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			homePage.clickLogout();
//		}
//
//		System.out.println("Test Execution completed successfully");
//
//	}*/
//	/*@Test
//	public void TC006_AutomationpracValidation()
//	{
//		WebDriver driver = BrowserDriver.funcGetWebdriver();
//		BrowserDriver.launchWebURL("http://automationpractice.com/");
//
//		APHomepage homePage = PageFactory.initElements(driver, APHomepage.class);
//		//APSignInpage signInPage = PageFactory.initElements(driver, APSignInpage.class);
//		APSignInpage signInPage = new APSignInpage(driver);
//		APMyAccountPage myaccountPage = PageFactory.initElements(driver, APMyAccountPage.class);
//		APPersonalInformationPage personalInformationPage = PageFactory.initElements(driver, APPersonalInformationPage.class);
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
//
//		// Get the whole data
//		LinkedHashMap<String, Map<String, String>> getAllData = obj.getTableData();
//
//		// Get specific data
//		Map<String, String> fRow = (getAllData.get("1"));
//		
//		//SkriptmateConfigurations.setSlfHelngProp();
//		try {
//		
//		homePage.clickSignin();
//
//		
//	
//		signInPage.login(fRow.get("UserName"), fRow.get("Password"));
//		myaccountPage.clickMyPersonalInformation();
//		
//		
//		personalInformationPage.validatePersonalInfo("Social title",fRow.get("Social title"));
//		personalInformationPage.validatePersonalInfo("First name",fRow.get("First name"));
//		personalInformationPage.validatePersonalInfo("Last name",fRow.get("Last name"));
//		personalInformationPage.validatePersonalInfo("E-mail address",fRow.get("E-mail address"));
//		personalInformationPage.validatePersonalInfo("dobDay",fRow.get("dobDay"));
//		personalInformationPage.validatePersonalInfo("dobMonth",fRow.get("dobMonth"));
//		personalInformationPage.validatePersonalInfo("dobYear",fRow.get("dobYear"));
//
//		
//
//		homePage.clickLogout();
//		
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
//		finally
//		{
//			//homePage.clickLogout();
//		}
//		BrowserDriver.closeBrowser();
//		System.out.println("Test Execution completed successfully");
//		*/
//	//}
//	
//
//}
