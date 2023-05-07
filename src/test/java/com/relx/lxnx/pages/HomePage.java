package com.relx.lxnx.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

private static HomePage homeInstance;
	
	private HomePage() {
		
	}
	
	public static HomePage getInstance() {
		if (homeInstance==null) {
			homeInstance= new HomePage();
		}
		return homeInstance;
	}
	
	@FindBy(xpath="//a[@class='score-button btn-clickable-area' and @href='https://risk.lexisnexis.co.uk/financial-services']")
	public WebElement financialServices;
	
	@FindBy(xpath="//a[@class='score-button btn-clickable-area' and @href='https://risk.lexisnexis.co.uk/insurance']")
	public WebElement insurance;
	
	@FindBy(xpath="//a[@class='score-button btn-clickable-area' and @href='https://risk.lexisnexis.co.uk/life-and-pension']")
	public WebElement lifeAndPensions;
	
	@FindBy(xpath="//a[@class='score-button btn-clickable-area' and @href='https://risk.lexisnexis.co.uk/corporations-and-non-profits']")
	public WebElement corporationsAndNonProfits;
	
	@FindBy(xpath="//li[@data-ux-module='LNRS/Components/IndustrySection']")
	public WebElement chooseIndustry;
	
	@FindBy(xpath="//a[@data-industryname='Financial Services ' and @data-industrylink='/financial-services' ][1]")
	public WebElement indFinancialServices;
	
	@FindBy (xpath="//button[@id='onetrust-accept-btn-handler']")
	public WebElement acceptCookies;
	
	@FindBy (xpath="//img[@class='cancel-btn']")
	public WebElement closeSurveyBox;
	
	@FindBy (xpath="//h1[@style='z-index: 1;']")
	public WebElement transformCheck;
	
	@FindBy (xpath="//span[@itemprop='name']")
	public WebElement homeButton;
	
	@FindBy (xpath="//a[@href='/financial-services/financial-crime-compliance']")
	public WebElement financialCrimeCompliance;
	
	@FindBy (xpath="//a[@href='/financial-services/fraud-and-identity-management']")
	public WebElement fraudAndIdentityManagement;
	
	@FindBy (xpath="//a[@href='/financial-services/customer-data-management']")
	public WebElement customerDataManagement;
	
	@FindBy (xpath="//a[@href='/financial-services/credit-risk-assessment']")
	public WebElement creditRiskAssesment;
	
	@FindBy (xpath="//a[@href='/financial-services/collections-and-recovery']")
	public WebElement collectionsAndRecovery;
	
	@FindBy (xpath="//a[@href='/financial-services/tracing-and-investigations']")
	public WebElement trackingAndInvestigations;
	
	public WebElement getFinancialServices() {
		return financialServices;
	}
	
	public WebElement getInsurance() {
		return insurance;
	}

	public WebElement getAcceptCookies() {
		return acceptCookies;
	}

	public WebElement getCloseSurveyBox() {
		return closeSurveyBox;
	}
	
	public WebElement getTransformCheck() {
		return transformCheck;
	}
	
	public WebElement getlifeAndPensions() {
		return lifeAndPensions;
	}
	
	public WebElement getcorporationsAndNonProfits() {
		return corporationsAndNonProfits;
	}
	
	public WebElement getchooseIndustry() {
		return chooseIndustry;
	}
	
	public WebElement getindFinancialServices() {
		return indFinancialServices;
	}
	
	public WebElement gethomeButton() {
		return homeButton;
	}
	
	public WebElement getfinancialCrimeCompliance() {
		return financialCrimeCompliance;
	}
	
	public WebElement getfraudAndIdentityManagement() {
		return fraudAndIdentityManagement;
	}
	
	public WebElement getcustomerDataManagement() {
		return customerDataManagement;
	}
	
	public WebElement getcreditRiskAssesment() {
		return creditRiskAssesment;
	}
	
	public WebElement getcollectionsAndRecovery() {
		return collectionsAndRecovery;
	}
	
	public WebElement gettrackingAndInvestigations() {
		return trackingAndInvestigations;
	}

	public void checkTransformIsDisplayed() {
		if(getTransformCheck().isDisplayed()) {
			System.out.println("Transform Your Risk Decision Making is displayed");
		}else {
			System.out.println("element not present in the DOM");
		}
	}
	


	
	
}
