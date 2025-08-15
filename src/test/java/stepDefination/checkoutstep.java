package stepDefination;
import io.cucumber.java.en.*;
import PageObjects.Checoutpage;
import PageObjects.loginPage;

public class checkoutstep extends Base{

	
	

	@Given("Add Item in Cart")
	public void add_item_in_cart() {
		checkoutpage=new Checoutpage(driver);
		checkoutpage.clickonaddtocartbutton();
	}

	@Then("Click on Cart Butto")
	public void click_on_cart_butto() throws InterruptedException {
		Thread.sleep(5000);
		checkoutpage.clickonCheckouticon();
	}

	@Then("Click on Chekout Button")
	public void click_on_chekout_button() {
		checkoutpage.Checkoutbutton();
	}

	@Then("Enter personal imformation")
	public void enter_personal_imformation() {
		checkoutpage.enterpersonalimfor();
	}

	@Then("Click on Continue Button")
	public void click_on_continue_button() {
		checkoutpage.clickcontinuebutton();
	}

	@Then("Click on Finish Button")
	public void click_on_finish_button() {
		checkoutpage.clickfinishButton();
	}


}
