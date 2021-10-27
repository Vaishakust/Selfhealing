//package com.scripted.selfhealing_Mob_testscripts;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//
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
//import com.scripted.PcloudySampleIOSApp.PcloudySampleIOSAppPage;
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
//import io.appium.java_client.MobileDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.ios.IOSDriver;
//
//public class SH_PcloudyIOS_Validation_TestNG extends BaseTest_SelfHealing {
//	
//
//
////	@Test
////	public void IOSNativeValidation()
////	{
////		IOSDriver<WebElement> iosDriver =  null;
////		try {
////		iosDriver  = MobileDriverSettings.funcGetpCloudyNativeIOSdriver("pCloudyIOSAPP");
////		PcloudySampleIOSAppPage iosApp = new PcloudySampleIOSAppPage(iosDriver);
////		iosApp.login("test@testname.com", "testmunk");
////		//iosApp.actions();
////		}catch(Exception e) {
////			e.printStackTrace();
////		}finally {
////			iosDriver.quit();
////		}
////		System.out.println("IOS native test execution completed succesfully");
////	}
////	
//	
//	@Test
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
//		propDriver.setPropFilePath("src/main/resources/Mobile/Properties/configAutomationPrac.properties");
//		String filename = FileUtils.getCurrentDir() + PropertyDriver.readProp("excelName");
//		String sheetname = "TC001";
//		String key = "";
//		ExcelConnector con = new ExcelConnector(filename, sheetname);
//		TestDataFactory test = new TestDataFactory();
//		TestDataObject obj = test.GetData(key, con);
//		LinkedHashMap<String, Map<String, String>> getAllData = obj.getTableData();
//		Map<String, String> fRow = (getAllData.get("1"));
//		try {
//		homePage.clickSignin();
//		signInPage.login(fRow.get("UserName"), fRow.get("Password"));
//		homePage.clickLogout();		
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
//		finally
//		{
//			IOSdriver.quit();
//		}
//		
//		System.out.println("Test Execution completed successfully");
//		
//	}
//	
//
//
//	
//
//}
