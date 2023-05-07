package com.relx.lxnx.stepdefenitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.relx.lxnx.constants.Constants;
import com.relx.lxnx.driver_manager.DriverManager;
import com.relx.lxnx.pages.HomePage;
import com.relx.lxnx.utilities.CommonUtils;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class CommonStepDefenition {


	private static String scenarioName = null;

	public static String getScenarioName() 
	{ 
		return scenarioName; 
	}


	@Before
	public void beforeScenario(Scenario scenario) {
		try {
			scenarioName=scenario.getName();
			CommonUtils.getInstance().loadProperties();
			if(DriverManager.getDriver()==null) {
				DriverManager.launchBrowser();
				DriverManager.getDriver().manage().window().maximize();
				CommonUtils.getInstance().initElements();
				login();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	private void login() {
		DriverManager.getDriver().get(Constants.APP_URL);
		CommonUtils.getInstance().impWait();
		HomePage.getInstance().getAcceptCookies().click();
	}

	@AfterStep 
	public void attachScreenShot(Scenario scenario){
		if(scenario.isFailed()){ 
			byte[] screenshotTaken = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotTaken, "image/png", "error screen");
		} 
	}

}
