//package com.scripted.skhealingPageObjects;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import com.scripted.mobile.MobileHandlers;
//import com.scripted.web.WebHandlers;
//
//import io.appium.java_client.MobileDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.ios.IOSDriver;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//
//public class Mobile_APSignInpage2 {
//
//	MobileDriver<WebElement> androidDriver ;
//	IOSDriver<WebElement> IOSdriver=null;
//
//	@FindBy(name = "//*[@id='eaill']")
//	private  MobileElement emailAddress;
//
//	@FindBy(id = "passwd")
//	public  MobileElement password;
//	//passwd
//
//	@FindBy(id = "SubmitLogin")
//	public  MobileElement SubmitButton;
//	
//	public Mobile_APSignInpage2(MobileDriver<WebElement> androidDriver) {
//		this.androidDriver = androidDriver;
//		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
//	}
//	public Mobile_APSignInpage2(IOSDriver<WebElement> IOSdriver) {
//		this.IOSdriver = IOSdriver;
//		PageFactory.initElements(new AppiumFieldDecorator(IOSdriver), this);
//	}
//
//	public void login(String username, String pass) {
//		MobileHandlers.enterText(emailAddress, username);
//		MobileHandlers.enterText(password, pass);
//		MobileHandlers.click(SubmitButton);
//	}
//}
