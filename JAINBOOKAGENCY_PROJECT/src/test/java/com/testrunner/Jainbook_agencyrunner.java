package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/Testcase.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TC01_Jainbookagency_login,@TC02_Jainbookagency_resetpage,@TC03_Jainbookagency_searchthebook,@TC04_Jainbookagency_Addtocart"},
		glue = {"com.Stepdefinition"},
		monochrome = true
		)
public class Jainbook_agencyrunner {

}
