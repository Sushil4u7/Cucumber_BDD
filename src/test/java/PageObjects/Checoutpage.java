package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checoutpage {
	//driver initializtion
		WebDriver driver;
		public Checoutpage(WebDriver driver)
		{this.driver=driver;	
		PageFactory.initElements(driver,this);}
		
		
		@FindBy(id="add-to-cart-sauce-labs-backpack")
		WebElement Addtocart;

		@FindBy(xpath="//a[@class='shopping_cart_link']")
		WebElement Checkouticon;
		
		
		@FindBy(id="checkout")
		WebElement CheckoutButton;
		
		
		
		@FindBy(id="first-name")
		WebElement Firstname;
		
		@FindBy(id="last-name")
		WebElement lastname;
		
		@FindBy(id="postal-code")
		WebElement postal;
		
		@FindBy(id="continue")
		WebElement continueButton;
		
		@FindBy(id="finish")
		WebElement finishButton;
		
		
		
		public void clickonaddtocartbutton()
		{ 
			Addtocart.click();
		}
		
		public void clickonCheckouticon()
		{
			Checkouticon.click();
		}
		
		public void Checkoutbutton()
		{
			CheckoutButton.click();
		}
		
		public void enterpersonalimfor()
		{Firstname.sendKeys("Raj");
		lastname.sendKeys("Patel");
		postal.sendKeys("411033");
		}
		
		 public void clickcontinuebutton()
		 {
			 
			 continueButton.click();
		 }
		 
		 public void clickfinishButton()
		 {
			 
			 finishButton.click();
		 }
		
}
