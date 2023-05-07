Feature: Navigate to lexisNexis UK WebSite and check for options availability

Scenario: validate the availability of Risk Decision Making Features


when HomePage is displayed 
Then check and click on FinancialServices option
And wait for some time and navigate back to the home page to click on Insurance
Then check and click on Insurance option
And wait for some time and navigate back to the home page to click on LifeandPensions
Then check and click on LifeandPensions option
And wait for some time and navigate back to the home page to click on CorporationsandNonProfits
Then check and click on LifeandPensions CorporationsandNonProfits
And scrollDown to click FinancialServices in chooseIndustryTab
Then click on FinancialCrimeCompliance
And navigate to chooseindustry and click on FraudAndIdentityManagement 
Then navigate to chooseindustry and click on CustomerDataManagement
And navigate to chooseindustry and click on CreditRiskAssesment
Then navigate to chooseindustry and click on CollectionsAndRecovery
And navigate to chooseindustry and click on TracingAndInvestigations

