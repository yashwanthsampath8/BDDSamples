package runners;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true, 
		features = "@target/reports/failed_scenarios.txt",
		glue = {"stepDefs"}	
		)
public class RerunRunner {

	
}
