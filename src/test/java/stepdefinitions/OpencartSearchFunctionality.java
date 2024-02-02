package stepdefinitions;



import com.utilities.ReusableFunctions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpencartSearchFunctionality extends ReusableFunctions {
	
	@When("user search any product by typing in search edit box")
	public void SearchProduct() throws Exception {
          sendKeysByAnyLocator(loc.opencartSearch_product, "search_Iphone");
		
	}
	@And("click on Search button")
	public void clickOnLogin() throws Exception {
		clickByAnyLocator(loc.opencartSearch_button);
	}
	//@Then("Check if the it opens the search product ")
	//public void verifyWarningMsg() {
		//if (driver.findElements(loc.openCartLogin_Warning_message).size() > 0) {
			//System.out.println("openCartLogin_Warning_message is displayed************");
		//} else {
			//System.out.println("openCartLogin_Warning_message is NOT displayed**************");
		//}

	//}


}