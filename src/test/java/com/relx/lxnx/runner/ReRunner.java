package com.relx.lxnx.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue= {"com.relx.lxnx.stepdefenitions"},
dryRun=false,
monochrome=true,
plugin={"rerun:target/failed_scenario.txt"}
)
public class ReRunner {

}
