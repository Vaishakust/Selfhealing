//package com.scripted.skhealingPageObjects;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.ios.IOSDriver;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import com.scripted.mobile.MobileHandlers;
//
//
//
//public class Mobile_APHomepage {
//
//	//MobileDriver<WebElement> androidDriver ;
//	AppiumDriver<WebElement> appiumdriver=null;
//
//	@FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
//	public  MobileElement Signin;
//	//*[@id="header"]/div[2]/div/div/nav/div[1]/a
//	//*[@id="header"]/div[2]/div/div/nav/div[1]/a
//	//*[@id="header"]/div[2]/div/div/nav/div[1]/a
//
//	@FindBy(xpath= "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
//	private  MobileElement logout;
//	
///*	public Mobile_APHomepage(MobileDriver<WebElement> androidDriver) {
//		this.androidDriver = androidDriver;
//		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
//	}*/
//	
//	public Mobile_APHomepage(AppiumDriver<WebElement> appiumDriver) {
//		this.appiumdriver = appiumDriver;
//		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
//	}
//	public void clickSignin()
//	{
//		MobileHandlers.click(Signin);
//	}
//	
//	public void clickLogout()
//	{
//		MobileHandlers.click(logout);
//		System.out.println("Logout completed");
//	}
//		
//}
