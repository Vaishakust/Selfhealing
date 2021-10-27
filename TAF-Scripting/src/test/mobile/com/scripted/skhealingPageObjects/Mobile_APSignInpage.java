//package com.scripted.skhealingPageObjects;
//
//import java.util.List;
//import java.util.Map;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import com.scripted.mobile.MobileHandlers;
//
//import org.openqa.selenium.WebElement;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//
//public class Mobile_APSignInpage {
//
//	private AppiumDriver<WebElement> driver;
//
//	/*public Mobile_APSignInpage(MobileDriver<WebElement> androidDriver) {
//		this.androidDriver = androidDriver;
//		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
//	}*/
//	public Mobile_APSignInpage(AppiumDriver<WebElement> driver) {
//	    this.driver = driver;
//	    PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//	}
//	@FindBy(id = "emaill")
//	private MobileElement input_login;
//
//	@FindBy(id = "passswd")
//	public MobileElement password;
//	// passwd
//
//	@FindBy(id = "SubmitLogin")
//	public MobileElement SubmitButton;
//
//	public void login(String username, String pass) {
//		MobileHandlers.enterText(input_login, username);
//		MobileHandlers.enterText(password, pass);
//		MobileHandlers.click(SubmitButton);
//	}
//}
