package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(
		features= {".//Features//LoginDDT.feature"},
		glue= "stepDef",
		plugin = { "pretty","html:reports/myreport.html",

		"json:reports/myreport.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome=true
		//tags = ("@smoke") 

)
public class testRun {
	

}
