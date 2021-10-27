//package com.scripted.selfhealing_Mob_testscripts;
//
//import java.io.FileInputStream;
//import java.io.InputStream;
//
//import org.apache.log4j.PropertyConfigurator;
//import org.openqa.selenium.WebElement;
//
//
//import com.scripted.UTSPageObjects.Uts_IrctcPage;
//import com.scripted.configurations.SkriptmateConfigurations;
//import com.scripted.mobile.MobileDriverSettings;
//import com.scripted.selfhealing.HealingConfig;
//
//import io.appium.java_client.android.AndroidDriver;
//import junit.framework.Assert;
//
//public class Native_android_UTS_IRCTC  {
//
//	public static AndroidDriver<WebElement> androidDriver = null;
//
//	public static void main(String[] args) {
//		androidDriver = MobileDriverSettings.funcGetNativeAndroiddriver("irctcConfig");
//		SkriptmateConfigurations.beforeSuite();
//		try {
//			InputStream log4j = new FileInputStream
//					("D:\\workspace-TAF-newstructure\\ScriptedRepo\\TAF-Scripting\\src\\main\\resources\\logConf\\log4j.properties");
//	//		D:\workspace-TAF-newstructure\ScriptedRepo\TAF-Scripting\src\main\resources\logConf
//			PropertyConfigurator.configure(log4j);
//			Uts_IrctcPage utsIrcts = new Uts_IrctcPage(androidDriver);
//			utsIrcts.searchTicket();
//			utsIrcts.selectTrain();
//			//utsIrcts.passengerDetails();
//			//utsIrcts.bookTicket();
//			//utsIrcts.verifyText("Enter your credentials");
//			//utsIrcts.login();
//			//utsIrcts.logout();
//			System.out.println("Android native test execution completed successfully");
//		}catch(Exception e) {
//			System.out.println("Exception :"+e);
//		}finally {
//			MobileDriverSettings.closeDriver();
//			
//		}
//		
//	
//		
//		
//	}
//}
