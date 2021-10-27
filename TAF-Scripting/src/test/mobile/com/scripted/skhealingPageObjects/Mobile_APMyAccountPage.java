package com.scripted.skhealingPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.scripted.web.WebHandlers;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Mobile_APMyAccountPage {
	MobileDriver<WebElement> androidDriver ;
	IOSDriver<WebElement> IOSdriver=null;
	
	@FindBy(xpath = "//span[text()='Order history and details']")
	private WebElement orderHistoryandDetails;
	
	@FindBy(xpath = "")
	private WebElement myPersonalInformation;
	//*[@id="center_column"]/div/div[1]/ul/li[4]/a/span
	//span[text()='My personal information']
	
	//Added by AncyAS
	@FindBy(xpath="//*[@id=\"columns\"]/div[4]/a[2]")
	private WebElement myAccount;

	
	
	//*[@id="columns"]/div[1]/a[2]
	//span[text()='My personal information']
	
	//   #center_column > div > div:nth-child(1) > ul > li:nth-child(4) > a > span
	//   @FindBy(xpath = "//span[text()='My personal information']")
	public Mobile_APMyAccountPage(MobileDriver<WebElement> androidDriver) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
	}
	public Mobile_APMyAccountPage(IOSDriver<WebElement> IOSdriver) {
		this.IOSdriver = IOSdriver;
		PageFactory.initElements(new AppiumFieldDecorator(IOSdriver), this);
	}

	public void clickMyPersonalInformation() {
		WebHandlers.click(myPersonalInformation);	
		//WebHandlers.click(myAccount);
	}

}
