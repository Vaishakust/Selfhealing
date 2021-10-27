package com.scripted.skhealingPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.scripted.web.WebHandlers;


public class OrangeHRMPage {
	WebDriver driver;
	
	@FindBy(id = "txtUsername")
	private WebElement loginUserName;
	//*[@id="txtUsername"]
	
	
	@FindBy(id = "txtPassword")
	private WebElement loginPassword;

	@FindBy(id = "btnLogin")
	private WebElement btnLogin;
	
	@FindBy(id="welcome")
	private WebElement welcomeAdmin;

	@FindBy(id = "menu_admin_viewAdminModule")
	private WebElement linkAdmin;
	
	@FindBy(id="btnAdd")
	private WebElement addUser;
	
	@FindBy(id="systemUser_userType")
	private WebElement userType;
	
	@FindBy(id="systemUser_employeeName_empName")
	private WebElement employeeName;
	
	@FindBy(id="systemUser_userName")
	private WebElement employee_userName;
	
	@FindBy(id="systemUser_password")
	private WebElement employee_password;
	
	@FindBy(id="systemUser_confirmPassword")
	private WebElement employee_Confirmpassword;
	
	@FindBy(id="btnSave")
	private WebElement saveUser;
	
	@FindBy(id="btnDelete")
	private WebElement deleteUser;
	
	@FindBy(id="dialogDeleteBtn")
	private WebElement delete_OK;
	
	@FindBy(id="resultTable")
	private WebElement usertable;
	
	@FindBy(xpath=".//a[contains(@href,'saveSystemUser') and text()='Admin']")
	private WebElement adminLink;
	
	@FindBy(xpath="//*[@id=\"systemUser_userType\"]/option[1]")
	private WebElement userrole_Admin;
	
	@FindBy(id="btnCancel")
	private WebElement btncancel;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement linkLogout;
	

	
	public OrangeHRMPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String userName, String passWord) {
		WebHandlers.enterText(loginUserName,userName);
		WebHandlers.enterText( loginPassword, passWord);
		WebHandlers.click(btnLogin);
		//click(btnLogin);
	}
	
	public void navigate_SystemUser() {
		WebHandlers.click(linkAdmin);
	}
	
	public void adduser(String empType, String empName, String empUserName, String empPwd, String empConfirmPwd) {
		WebHandlers.click(addUser);
		WebHandlers.dropDownSetByVal(userType, empType);
		WebHandlers.enterText(employeeName, empName);
		WebHandlers.enterText(employee_userName, empUserName);
		WebHandlers.enterText(employee_password, empPwd);
		WebHandlers.enterText(employee_Confirmpassword, empConfirmPwd);
	}
	
	public void saveUser() {
		WebHandlers.click(saveUser);
	}
	
	public void checkUser(String userName) {
		WebHandlers.getIndexofVal(usertable, userName);
	}
	
	/*public void deleteUser(String userName) {
		WebHandlers.TblCelChkboxClick(usertable, userName);
		WebHandlers.click(deleteUser);
		WebHandlers.click(delete_OK);
		
	}*/
	
	public void  navigate_userPage(String user) {
		WebHandlers.click(adminLink);
	}
	
	public void verifyUser() {
		WebHandlers.verifyText(userrole_Admin, "Admin");
		WebHandlers.click(btncancel);
	}
	
	public void logOut() {
		WebHandlers.click(welcomeAdmin);
		WebHandlers.click(linkLogout);
	}
	

	public void headerVal() {
		System.out.println(WebHandlers.getTblHeaderVal(usertable));
	}
	
	public void BodyVal() {
		System.out.println(WebHandlers.getTblBodyVal(usertable));
	}
	
	public void tdValue() {
		System.out.println(WebHandlers.getTblTdVal(usertable,2,1));
	}
	
	public void thValue() {
		System.out.println(WebHandlers.getTblThVal(usertable,0,3));
	}
	
	public void inxValue() {
		System.out.println(WebHandlers.getIndexofVal(usertable, "vijaykumar"));
	}
	
	public void colmapHdrValue(String str) {
		System.out.println(WebHandlers.getColMapByHdrVal(usertable,str));
}
	public void rowmapHdrValue(int rowHeader) {
		System.out.println(WebHandlers.getRowMapByIndxVal(usertable,rowHeader));
}
	public void ColMapByIndxVal() {
		System.out.println(WebHandlers.getColMapByIndxVal(usertable,2));
	}
	public void RowMapByIndxVal() {
		System.out.println(WebHandlers.getRowMapByIndxVal(usertable,2));
	}
	/*public void tblClick(String str) {
		WebHandlers.TblCelChkboxClick(usertable, str);
	}*/

	public void tblLink(String str) {
		WebHandlers.TblCelLinkClick(usertable, str);
	}
	
public void orangeHRMTableLogin_Android(String userName, String passWord) {
		
		
		WebHandlers.enterText(loginUserName,userName);
		WebHandlers.verifyText(loginUserName, "Hello");
		WebHandlers.clearText(loginUserName);
		System.out.println("text cleared");
		WebHandlers.existText(loginUserName);
		WebHandlers.enterText(loginUserName,userName);
		WebHandlers.enterText( loginPassword, passWord);
		WebHandlers.objExists(btnLogin);
		WebHandlers.objDisabled(btnLogin);
	//	WebHandlers.verifyProperty(btnLogin,"name", "Submit");
		WebHandlers.click(btnLogin);
		WebHandlers.click(linkAdmin);
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
