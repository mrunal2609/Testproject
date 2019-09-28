package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"src/test/java/feature/log.feature"},glue= {"glucode"},plugin= {"json:target/cucumberreport.json"})
public class cucumberrunner  extends AbstractTestNGCucumberTests{
	

}
