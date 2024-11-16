package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = {"FeatureFiles"},monochrome = true,glue = {"stepDefination"}
,plugin= {"pretty","html:target/report/cucumber",
		"json:target/report/cucumber.json",
		"junit:target/report/cucumber.xml",
		},tags = ("@supplier"))
public class AppTest extends AbstractTestNGCucumberTests{

}
