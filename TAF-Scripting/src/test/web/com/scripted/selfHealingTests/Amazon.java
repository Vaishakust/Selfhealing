package com.scripted.selfHealingTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.scripted.AutoPracPageobjects.NewPage;
import com.scripted.selfhealing.SMWebHealer;
import com.scripted.web.BrowserDriver;
import com.scripted.selfhealing.SMWebHealer;

public class Amazon extends BaseTest_SelfHealing{
	public static WebDriver driver ;
	@Test
	public void TC005_Amazon() throws InterruptedException
	{	
		
		BrowserDriver.getCuPalDriver();
		driver= BrowserDriver.getDriver();	
		BrowserDriver.launchWebURL("http://localhost:8080/JenkinsProjectRel1/Sample/src/main/webapp/index.html");
		NewPage seleniumPage1 = PageFactory.initElements(driver, NewPage.class);
		seleniumPage1.clicksimpleformdemo();
		seleniumPage1.entermessage();
		seleniumPage1.clickmessageButton();
	}
}
