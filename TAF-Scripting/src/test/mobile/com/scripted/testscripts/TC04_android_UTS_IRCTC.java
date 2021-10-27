//package com.scripted.testscripts;
//
//import org.openqa.selenium.WebElement;
//
//import com.scripted.UTSPageObjects.Uts_IrctcPage;
//import com.scripted.mobile.MobileDriverSettings;
//
//import io.appium.java_client.android.AndroidDriver;
//
//public class TC04_android_UTS_IRCTC {
//
//	public static AndroidDriver<WebElement> androidDriver = null;
//
//	public static void main(String[] args) {
//		androidDriver = MobileDriverSettings.funcGetNativeAndroiddriver("irctcConfig");
//		
//		try {
//			Uts_IrctcPage utsIrcts = new Uts_IrctcPage(androidDriver);
//			utsIrcts.searchTicket();
//			utsIrcts.selectTrain();
//			utsIrcts.passengerDetails();
//			utsIrcts.bookTicket();
//			utsIrcts.verifyText("Enter your credentials");
//			utsIrcts.login();
//			utsIrcts.logout();
//		}catch(Exception e) {
//			
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
