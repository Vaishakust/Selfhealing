package com.scripted.skhealingPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.scripted.web.WebHandlers;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Mobile_APPersonalInformationPage {

	MobileDriver<WebElement> androidDriver ;
	IOSDriver<WebElement> IOSdriver=null;

	@FindBy(id = "id_gender1")
	private WebElement socialTileMr;

	@FindBy(id = "id_gender2")
	private WebElement socialTileMrs;

	@FindBy(id = "firstname")
	private WebElement firstname;

	@FindBy(id = "lastname")
	private WebElement lastname;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "days")
	private WebElement day;

	@FindBy(id = "months")
	private WebElement month;

	@FindBy(id = "years")
	private WebElement year;

	boolean flag = false;
	
	public Mobile_APPersonalInformationPage(MobileDriver<WebElement> androidDriver) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
	}
	public Mobile_APPersonalInformationPage(IOSDriver<WebElement> IOSdriver) {
		this.IOSdriver = IOSdriver;
		PageFactory.initElements(new AppiumFieldDecorator(IOSdriver), this);
	}

	public void validatePersonalInfo(String objectName, String strValue) {
		if (objectName.equals("Social title")) {
			if (strValue.equals("Mr.")) {
				flag = WebHandlers.radioBtnIsSelected(socialTileMr);
				if (flag == true) {
					System.out.println("Passed");
				}
			}
		}

		if (objectName.equals("First name")) {
			flag = WebHandlers.verifyText(firstname, strValue);
			if (flag == true) {
				System.out.println("Passed");
			}
		}
		if (objectName.equals("Last name")) {
			flag = WebHandlers.verifyText(lastname, strValue);
			if (flag == true) {
				System.out.println("Passed");
			}
		}
		if (objectName.equals("E-mail address")) {
			flag = WebHandlers.verifyText(email, strValue);
			if (flag == true) {
				System.out.println("Passed");
			}
		}
		if (objectName.equals("dobDay")) {
			flag = WebHandlers.verifyText(day, strValue);
			if (flag == true) {
				System.out.println("Passed");
			}
		}
		if (objectName.equals("dobMonth")) {
			flag = WebHandlers.verifyText(month, strValue);
			if (flag == true) {
				System.out.println("Passed");
			}
		}
		if (objectName.equals("dobYear")) {
			flag = WebHandlers.verifyText(year, strValue);
			if (flag == true) {
				System.out.println("Passed");
			}
		}
	}

}
