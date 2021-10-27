package com.scripted.skhealingPageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.scripted.web.WebHandlers;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CRMLoginPage {
	MobileDriver<WebElement> androidDriver ;
	
	@FindBy(name = "email")
	private MobileElement loginUname;
	@FindBy(name = "password")
	private MobileElement loginPass;
	@FindBy(xpath = "//div[text()='Login']")
	private MobileElement loginbtn;
	@FindBy(xpath = "//input[@name='button']")
	private MobileElement acceptBtn;

	public CRMLoginPage(MobileDriver<WebElement> androidDriver) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
	}

	public void login(String user, String pass) {
		//WebHandlers.click(acceptBtn);
		WebHandlers.enterText(loginUname, user);
		WebHandlers.enterText(loginPass, pass);
		WebHandlers.click(loginbtn);
		
	}

}
