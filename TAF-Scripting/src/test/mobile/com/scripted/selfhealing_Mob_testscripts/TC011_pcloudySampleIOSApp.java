//package com.scripted.selfhealing_Mob_testscripts;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import com.scripted.PcloudySampleIOSApp.PcloudySampleIOSAppPage;
//import com.scripted.configurations.SkriptmateConfigurations;
//import com.scripted.mobile.MobileDriverSettings;
//import com.scripted.selfhealing.HealingConfig;
//
//import io.appium.java_client.ios.IOSDriver;
//
//public class TC011_pcloudySampleIOSApp {
//	
//	public static IOSDriver<WebElement> iosDriver = null;
//	
//	public static void main(String[] args) {
//		try {
//			SkriptmateConfigurations.beforeSuite();
//		iosDriver  = MobileDriverSettings.funcGetpCloudyNativeIOSdriver("pCloudyIOSAPP");
//		PcloudySampleIOSAppPage iosApp = new PcloudySampleIOSAppPage(iosDriver);
//		iosApp.login("test@testname.com", "testmunk");
//		//iosApp.actions();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			SkriptmateConfigurations.afterSuite();
//		iosDriver.quit();
//		}
//		System.out.println("IOS native test execution completed succesfully");
//	}
//	
//	
//	/*iosDriver  = MobileDriverSettings.funcGetpCloudyNativeIOSdriver("pCloudyIOSAPP");
//	PcloudySampleIOSApp iosApp = new PcloudySampleIOSApp(iosDriver);
//	iosApp.login("test@testname.com", "testmunk");
//	}catch(Exception e) {
//	
//	}finally {
//		iosDriver.quit();
//	}*/
//	
//
//}
