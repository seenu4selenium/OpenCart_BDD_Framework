package stepdefinitions;

import java.io.IOException;

import com.utilities.ReusableFunctions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpencartLoginWithInvalidtestdata extends ReusableFunctions {
	@Given("Type Opencart  URL using any browser")
	public void openUrl() throws Exception {
		chromeBrowserLaunch();
		getURL("opencart_URL");
	}

	@When("user enter invalid email and password")
	public void typeInvalidTestdata() throws Exception {
		clickByAnyLocator(loc.openCart_MyAccount_menu);
		clickByAnyLocator(loc.openCart_Login_subMenu);
		sendKeysByAnyLocator(loc.openCartLogin_Email_editbox, "opencart_Invalid_Email");
		sendKeysByAnyLocator(loc.openCartLogin_Password_editbox, "opencart_Invalid_Password");
	}

	@When("user enter valid email and password")
	public void typeValidTestdata() throws Exception {
		clickByAnyLocator(loc.openCart_MyAccount_menu);
		clickByAnyLocator(loc.openCart_Login_subMenu);
		sendKeysByAnyLocator(loc.openCartLogin_Email_editbox, "opencart_Email");
		sendKeysByAnyLocator(loc.openCartLogin_Password_editbox, "opencart_Password");
	}

	@And("click on Login button")
	public void clickOnLogin() throws Exception {
		clickByAnyLocator(loc.openCartLogin_Submit_button);
	}

	@Then("Check the Warning message is displayed or not")
	public void verifyWarningMsg() {
		if (driver.findElements(loc.openCartLogin_Warning_message).size() > 0) {
			System.out.println("openCartLogin_Warning_message is displayed************");
		} else {
			System.out.println("openCartLogin_Warning_message is NOT displayed**************");
		}

	}
	
	
	
}
