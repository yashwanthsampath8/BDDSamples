package runners;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true, 
		features = "src//test//resources//sampleFeatures//GooglePage.feature",
		glue = {"stepDefs"},
		monochrome = true,
		dryRun = false,
		plugin = {
//				"pretty",
				"html:target/reports/HtmlReport.html",
//				"useage:target/reports/HtmlReport",
//				"Json:target/reports/HtmlReport.json",
//				"Junit:target/reports/HtmlReport.xml",
//				"rerun:target/reports/failed_scenarios.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}
		)
public class GooglePageRunner {
	//
}
// useagereport, html, json, junit, rerun

//extend reports