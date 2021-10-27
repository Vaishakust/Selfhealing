package com.scripted.testscripts;
import org.openqa.selenium.WebElement;

import com.scripted.PageObjects.SauceAndroidNativeApp;

import com.scripted.mobile.MobileDriverSettings;

import io.appium.java_client.android.AndroidDriver;
 
public class SauceLab_Android_NativeAppTest {
	
	public static AndroidDriver<WebElement> androidDriver =  null;
	
  public static void main(String[] args) throws Exception {
	  androidDriver = MobileDriverSettings.funcGetSauceNativeAndroiddriver("sauceLabMobileConfig");
	  
	  try {
		  
		  SauceAndroidNativeApp saucetest=new SauceAndroidNativeApp(androidDriver);
		  saucetest.submitComment("flower");
			
		}catch(Exception e) {
			
		}finally {
			androidDriver.quit();
			
		}
	
  }
}