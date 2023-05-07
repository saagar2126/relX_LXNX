package com.relx.lxnx.stepdefenitions;

import org.junit.Assert;

import com.relx.lxnx.pages.HomePage;
import com.relx.lxnx.utilities.CommonUtils;

import io.cucumber.java.en.Then;

public class ValidateStepDefenitions {

	@Then("check and click on FinancialServices option")
	public void check_and_click_on_financial_services_option() {

		try {
			CommonUtils.getInstance().impWait();
			HomePage.getInstance().getCloseSurveyBox().click();
			HomePage.getInstance().checkTransformIsDisplayed();
			CommonUtils.getInstance().scrollToSpecificElement(HomePage.getInstance().getTransformCheck());
			CommonUtils.getInstance().jeExecutor(HomePage.getInstance().getFinancialServices());
			System.out.println("clicking on FinancialServices option,element is clickable");
		}
		catch(Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		
	}

	@Then("wait for some time and navigate back to the home page to click on Insurance")
	public void wait_for_some_time_and_navigate_back_to_the_home_page_to_click_on_insurance() {
		
		try {
			System.out.println("waiting to return back to click on Insurance option");
			CommonUtils.getInstance().navigateBack();
			CommonUtils.getInstance().impWait();
		}
		catch(Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		
	}

	@Then("check and click on Insurance option")
	public void check_and_click_on_insurance_option() {
		
		try {
			CommonUtils.getInstance().jeExecutor(HomePage.getInstance().getInsurance());
			System.out.println("clicking on Insurance option,element is clickable");
		}
		catch(Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		
	}

	@Then("wait for some time and navigate back to the home page to click on LifeandPensions")
	public void wait_for_some_time_and_navigate_back_to_the_home_page_to_click_on_lifeand_pensions(){
		try {
			//CommonUtils.getInstance().navigateBack();
			HomePage.getInstance().gethomeButton().click();
			System.out.println("waiting to return back to click on LifeandPensions option");
			CommonUtils.getInstance().impWait();
		}catch(Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		
	}

	@Then("check and click on LifeandPensions option")
	public void check_and_click_on_lifeand_pensions_option() {
		try {
			System.out.println("clicking on LifeandPensions option");
			CommonUtils.getInstance().jeExecutor(HomePage.getInstance().getlifeAndPensions());
		}
		catch(Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		
	}

	@Then("wait for some time and navigate back to the home page to click on CorporationsandNonProfits")
	public void wait_for_some_time_and_navigate_back_to_the_home_page_to_click_on_corporationsand_non_profits() {
		try {
			System.out.println("waiting to return back to click on CorporationsandNonProfits option");
			CommonUtils.getInstance().impWait();
			CommonUtils.getInstance().navigateBack();
		}
		catch(Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@Then("check and click on LifeandPensions CorporationsandNonProfits")
	public void check_and_click_on_lifeand_pensions_corporationsand_non_profits() {
		try {
			System.out.println("clicking on CorporationsandNonProfits option");
			CommonUtils.getInstance().impWait();
			CommonUtils.getInstance().jeExecutor(HomePage.getInstance().getcorporationsAndNonProfits());
			CommonUtils.getInstance().navigateBack();
		}
		catch(Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		
	}

	@Then("scrollDown to click FinancialServices in chooseIndustryTab")
	public void scroll_down_to_click_financial_services_in_choose_industry_tab() {
		try {
			System.out.println("scrolling down and clicking on FinancialServices ");
			CommonUtils.getInstance().impWait();
			CommonUtils.getInstance().scrollToSpecificElement(HomePage.getInstance().getTransformCheck());
			//CommonUtils.getInstance().jeExecutor(HomePage.getInstance().getchooseIndustry());
			HomePage.getInstance().getchooseIndustry().click();
			CommonUtils.getInstance().jeExecutor(HomePage.getInstance().getindFinancialServices());
		}
		catch(Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		

	}

	@Then("click on FinancialCrimeCompliance")
	public void click_on_financial_crime_compliance() {
		try {
			CommonUtils.getInstance().impWait();
			CommonUtils.getInstance().jeExecutor(HomePage.getInstance().getfinancialCrimeCompliance());
			System.out.println("clicked on FinancialCrimeCompliance");
		}
		catch(Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		

	}
	@Then("navigate to chooseindustry and click on FraudAndIdentityManagement")
	public void navigate_to_chooseindustry_and_click_on_fraud_and_identity_management() {
		try {
			CommonUtils.getInstance().impWait();
			// CommonUtils.getInstance().jeExecutor(HomePage.getInstance().getchooseIndustry());
			HomePage.getInstance().getchooseIndustry().click();
			CommonUtils.getInstance().jeExecutor(HomePage.getInstance().getindFinancialServices());
			CommonUtils.getInstance().impWait();
			CommonUtils.getInstance().jeExecutor(HomePage.getInstance().getfraudAndIdentityManagement());
			System.out.println("clicked on fraudAndIdentityManagement");
		}
		catch(Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		

	}
	@Then("navigate to chooseindustry and click on CustomerDataManagement")
	public void navigate_to_chooseindustry_and_click_on_customer_data_management() {
		try {
			CommonUtils.getInstance().impWait();
			HomePage.getInstance().getchooseIndustry().click();
			CommonUtils.getInstance().jeExecutor(HomePage.getInstance().getindFinancialServices());
			CommonUtils.getInstance().impWait();
			CommonUtils.getInstance().jeExecutor(HomePage.getInstance().getcustomerDataManagement());
			System.out.println("clicked on customerDataManagement");
		}
		catch(Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}

	}
	@Then("navigate to chooseindustry and click on CreditRiskAssesment")
	public void navigate_to_chooseindustry_and_click_on_credit_risk_assesment() {
		try {
			CommonUtils.getInstance().impWait();
			HomePage.getInstance().getchooseIndustry().click();
			CommonUtils.getInstance().jeExecutor(HomePage.getInstance().getindFinancialServices());
			CommonUtils.getInstance().impWait();
			CommonUtils.getInstance().jeExecutor(HomePage.getInstance().getcreditRiskAssesment());
			System.out.println("clicked on creditRiskAssesment");
		}
		catch(Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}

	}
	@Then("navigate to chooseindustry and click on CollectionsAndRecovery")
	public void navigate_to_chooseindustry_and_click_on_collections_and_recovery() {
		try {
			CommonUtils.getInstance().impWait();
			HomePage.getInstance().getchooseIndustry().click();
			CommonUtils.getInstance().jeExecutor(HomePage.getInstance().getindFinancialServices());
			CommonUtils.getInstance().impWait();
			CommonUtils.getInstance().jeExecutor(HomePage.getInstance().getcollectionsAndRecovery());
			CommonUtils.getInstance().impWait();
			System.out.println("clicked on collectionsAndRecovery");
		}
		catch(Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}

	}
	@Then("navigate to chooseindustry and click on TracingAndInvestigations")
	public void navigate_to_chooseindustry_and_click_on_tracing_and_investigations() {
		try {
			CommonUtils.getInstance().impWait();
			HomePage.getInstance().getchooseIndustry().click();
			CommonUtils.getInstance().jeExecutor(HomePage.getInstance().getindFinancialServices());
			CommonUtils.getInstance().impWait();
			CommonUtils.getInstance().jeExecutor(HomePage.getInstance().gettrackingAndInvestigations());
			System.out.println("clicked on trackingAndInvestigations");
		}
		catch(Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}

	}



}
