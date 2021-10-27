//package com.scripted.skhealingPageObjects;
//
//
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import com.scripted.mobile.MobileHandlers;
//import com.scripted.web.WebHandlers;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//
//public class SampleSwitchToWindowPage {
//	
//	
//	WebDriver driver;
//	
//	@FindBy(id = "win1")
//	private WebElement NewWindow;	
//	
//	@FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")
//	private WebElement GoogleTxt ;
//	
//	@FindBy(id = "alertBox")
//	private WebElement AlertClk;
//	
//	@FindBy(id = "promptBox")
//	private AndroidElement PromptClk;
//	
//	@FindBy(id = "tables")
//	private WebElement table;
//	
//	@FindBy(id="enterText")
//	private WebElement textBox;
//	
//	//*[@id="enterText"]
//	
//
//	
//	public SampleSwitchToWindowPage(WebDriver driver) {
//		this.driver = driver;
//	}
//	
//	public void CheckSwitchToWindow() throws InterruptedException
//	{
//		
//	//	WebHandlers.click(NewWindow);
//	//	WebHandlers.switchToNewWindow();
//	//	WebHandlers.enterText(GoogleTxt, "flower");
//	//	WebHandlers.switchToDefaultWindow();
//	//	WebHandlers.click(AlertClk);
//	//	WebHandlers.dismissAlert();
//	//	WebHandlers.click(PromptClk);
//		WebHandlers.enterText(textBox, "flower");
//		
//
//			
//		
//		
//	}
//}
