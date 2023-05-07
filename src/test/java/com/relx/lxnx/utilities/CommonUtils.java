package com.relx.lxnx.utilities;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.relx.lxnx.constants.Constants;
import com.relx.lxnx.driver_manager.DriverManager;
import com.relx.lxnx.pages.HomePage;

public class CommonUtils {
Alert alert;
JavascriptExecutor je;
Actions action;


public static CommonUtils getCommonUtilsInstance() {
	return commonUtilsInstance;
}

private static CommonUtils commonUtilsInstance = null;
	
	private CommonUtils() {
		
	}
	
	public static CommonUtils getInstance() {
		if(commonUtilsInstance==null) {
			commonUtilsInstance=new CommonUtils();
		}
		return commonUtilsInstance;
	}
	
	public void loadProperties() {
		//FileReader reader = null;
		Properties properties = new Properties();
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		}
		catch(Exception  e) {
			e.printStackTrace();
		}
		Constants.APP_URL=properties.getProperty("APP_URL");
		Constants.BROWSER=properties.getProperty("BROWSER");
	}
	
	public void initElements() {
		PageFactory.initElements(DriverManager.getDriver(), HomePage.getInstance());
	}
	
	public void switchToAlert() {
		impWait();
		DriverManager.getDriver().switchTo().alert();
	}
	
	public void aceptAlert() {
		impWait();
		alert.accept();
	}
	
	public void impWait() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void scrollToSpecificElement(WebElement Element) {
		je=(JavascriptExecutor)DriverManager.getDriver();
		je.executeScript("arguments[0].scrollIntoView(true);", Element);
	}
	
	public void mouseOverToSpecificElement(WebElement Element) {
		action = new Actions(DriverManager.getDriver());
		action.moveToElement(Element).click().build().perform();
	}
	
	public void jeExecutor(WebElement Element) {
		je=(JavascriptExecutor)DriverManager.getDriver();
		je.executeScript("arguments[0].click();", Element);
	}
	
	public void navigateBack() {
		DriverManager.getDriver().navigate().back();
	}
	
}
