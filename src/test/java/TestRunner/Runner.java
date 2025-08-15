package TestRunner;

import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.junit.runner.RunWith;


@CucumberOptions(
		  features = "src\\test\\resources\\Feature",
  		  glue = {"stepDefination","Utilities"},
  dryRun = false,
  monochrome=true,
  plugin = {"pretty", "html:target/cucumber-html-report","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
,tags="@checkout"
		)
		
public class Runner extends AbstractTestNGCucumberTests {

}
