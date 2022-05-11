package org.stepDefinations;

import org.hooks.ApplicationHook;
import org.junit.Assert;
import org.pomPages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDef {
	
	LoginPage lp=new LoginPage(ApplicationHook.driver);
	
	@Given("user navigate to url")
	public void user_navigate_to_url() {
		String actTitle=lp.get_page_title();
		System.out.println("Login Page Title = " + actTitle);
		Assert.assertEquals(actTitle,"Swag Labs");
	}
	@When("user enter username as {string}")
	public void user_enter_username_as(String username) {
	     lp.enter_username(username);
	}
	@When("user enter password as {string}")
	public void user_enter_password_as(String password) {
	    lp.enter_password(password);
	}
	@When("user click on login button")
	public void user_click_on_login_button() {
	   lp.Click_on_loginBtn();
	}
	@Then("user should be redirect to next page")
	public void user_should_be_redirect_to_next_page() {
		
		String actTitle=lp.get_page_title();
		System.out.println("Home Page Title = " + actTitle);
		Assert.assertEquals(actTitle,"Swag Labs");
	}

}
