package testrunpizza;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src\\test\\resources\\pizza.feature", 
		glue = {"stepdefinition"}, 
		dryRun = false, 
		monochrome = false,         // give this brazes ) and delete this --> ,
		//plugin = {"pretty"})
		//plugin = {"html:reports\\report.html"})
		  //plugin = {"json:reports\\report.json"})
		//  plugin = {"junit:reports\\report.xml"})

  plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})




public class Testrunpizza {

}
