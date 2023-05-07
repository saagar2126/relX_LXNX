package com.relx.lxnx.driver_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.relx.lxnx.constants.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

public static WebDriver driver=null;

	
	public static void launchBrowser() {
		try {
			switch(Constants.BROWSER) {
			case "CHROME" :
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				 options.addArguments("--start-maximized");
				 options.addArguments("--remote-allow-origins=*");
			     options.addArguments("--disable-notifications");
			     options.addArguments("--incognito");
			     driver = new ChromeDriver(options);
				break;
				
				default:
					break;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static WebDriver getDriver() {
		return driver;
	}
}
