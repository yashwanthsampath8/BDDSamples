package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true, 
		features = "src//test//resources//taggedFeatures",
		glue = {"stepDefs"},
		monochrome = true,
		//tags = "@smokeTest and @RegressionTest"
		//tags = "@smokeTest" 
		//tags = "@smokeTest or @RegressionTest"
		tags = "@phaseOne and @RegressionTest"
		)
public class CRMRunner {

}
