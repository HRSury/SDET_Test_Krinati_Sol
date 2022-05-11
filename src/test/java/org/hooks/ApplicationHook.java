package org.hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class ApplicationHook {
	public static WebDriver driver;
	@Before
	public void openBrowser()
	{
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
	}
	

}
