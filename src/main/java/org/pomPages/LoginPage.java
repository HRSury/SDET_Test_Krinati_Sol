package org.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(id="user-name")
	private WebElement uName;
	
	@FindBy(id="password")
	private WebElement pwd;

	@FindBy(id="login-button")
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public String get_page_title()
	{
		return driver.getTitle();
	}
	public void enter_username(String username)
	{
		uName.sendKeys(username);
	}
	
	public void enter_password(String password)
	{
		pwd.sendKeys(password);
	}
	
	public void Click_on_loginBtn()
	{
		loginbtn.click();
	}

}
