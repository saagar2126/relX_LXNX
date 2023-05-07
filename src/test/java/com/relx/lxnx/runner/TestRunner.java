package com.relx.lxnx.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue= {"com.relx.lxnx.stepdefenitions"},
dryRun=false,
monochrome=true,
plugin={"rerun:target/failed_scenario.txt", 
		"html:target/cucumber-reports/report.html", 
		"json:target/cucumber-reports/report.json", 
		"junit:target/cucumber-reports/report.xml", 
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class TestRunner {

	
}
