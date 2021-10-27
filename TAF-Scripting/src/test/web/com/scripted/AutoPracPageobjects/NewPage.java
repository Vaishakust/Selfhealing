package com.scripted.AutoPracPageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.scripted.web.WebHandlers;

public class NewPage {

	WebDriver driver;

	    @FindBy(xpath = "//form[@id='get-input']/div[1]/input[1]")
        private WebElement input_Pleaseenteryour;
	    @FindBy(xpath = "//div[@id='navbar-brand-centered']/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	    private WebElement a_SimpleFormDemo;
	    @FindBy(xpath = "//div[@id='navbar-brand-centered']/ul[1]/li[1]/a[1]")
	    private WebElement a_InputForms;
	    @FindBy(xpath = "//form[@id='get-input']/button[1]")
	    private WebElement button_ShowMessage;
	    @FindBy(xpath = "/html/body/div[1]/div[2]/nav[1]/div[1]/div[1]/button[1]")
	    private WebElement button_Togglenavigatio;

	public void clicksimpleformdemo() throws InterruptedException {
		Thread.sleep(2000);
		WebHandlers.click(a_InputForms);
		Thread.sleep(2000);
		WebHandlers.click(a_SimpleFormDemo);
		Thread.sleep(2000);
	}
	
	public void entermessage() throws InterruptedException {
		Thread.sleep(2000);
		WebHandlers.enterText(input_Pleaseenteryour, "sharath");
		Thread.sleep(2000);
	}
	
	public void clickmessageButton() throws InterruptedException {
		Thread.sleep(2000);
		WebHandlers.click(button_ShowMessage);
		Thread.sleep(2000);
	}
		
}
