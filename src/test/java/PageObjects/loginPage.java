package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
//driver initializtion
	WebDriver driver;
	public loginPage(WebDriver driver)
	{this.driver=driver;	
	PageFactory.initElements(driver,this);}
	
//find elements
	
	
	//username
@FindBy(id="user-name")
WebElement UserName;

//passwors
@FindBy(xpath="//input[@id='password']")
WebElement PassWord;

	//login Button
@FindBy(id="login-button")
WebElement Button;

public void enteremail(String email)
{UserName.sendKeys(email);
	}

public void enterpassword(String password)
{PassWord.sendKeys(password);
	}

public void clicklogin()

{Button.click();
	}
}