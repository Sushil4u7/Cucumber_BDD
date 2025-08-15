package stepDefination;


import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.loginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdef extends Base {
	@Before
	public void browsersetup()
	{ WebDriverManager.chromedriver().setup();

	driver=new ChromeDriver();
		}
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		loginpage=new loginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String URL) {
	   driver.get(URL);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
	  loginpage.enteremail(email);
	  loginpage.enterpassword(password);
	  //
	}

	@When("Click on Login")
	public void click_on_login() {
	  loginpage.clicklogin();
	  
	}

	@When("close browser")
	public void close_browser() {
	//	  driver.quit(); 
	}



}
