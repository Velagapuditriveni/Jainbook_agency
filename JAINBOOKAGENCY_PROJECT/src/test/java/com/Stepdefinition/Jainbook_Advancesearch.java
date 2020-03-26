package com.Stepdefinition;

import java.io.IOException;

import com.pages.Jainbook_Advancesearchpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jainbook_Advancesearch {
	Jainbook_Advancesearchpage sp=new Jainbook_Advancesearchpage();
	@Given("^user launches the chrome application$")
	public void user_launches_the_chrome_application() {
		sp.launch("chrome");
		sp.launchpage();
		sp.login();
	}

	@When("^the user clicks advanced search$")
	public void the_user_clicks_advanced_search() throws InterruptedException, IOException {
		sp.search();
	}

	@Then("^the user fills the form$")
	public void the_user_fills_the_form() throws InterruptedException, IOException {
		sp.filldetails();
	}

	@Then("^user clicks the search button then the user gets the searched book$")
	public void user_clicks_the_search_button_then_the_user_gets_the_searched_book() throws InterruptedException {
		sp.close_search();
	}
}
