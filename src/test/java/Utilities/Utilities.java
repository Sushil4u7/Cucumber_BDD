package Utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.util.concurrent.TimeUnit;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import stepDefination.Base;

public class Utilities extends Base {
	 @Before
	    public void setupTimeout() {
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	
	
	
	@AfterStep
	public void addScreenshot(Scenario scenario) {
   if (scenario.isFailed()) {
        // Take screenshot as byte array
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

      // Attach screenshot to the report
        scenario.attach(screenshot, "image/png", scenario.getName());
	      
   
   }
   

 
	}
	

}

