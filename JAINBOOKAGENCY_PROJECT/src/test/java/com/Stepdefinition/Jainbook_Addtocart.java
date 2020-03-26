package com.Stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.pages.Jainbook_Addtocartpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jainbook_Addtocart {
	 WebDriver driver;
	Jainbook_Addtocartpage cart=new Jainbook_Addtocartpage(driver);
	@Given("^launch the chrome application$")
	public void launch_the_chrome_application() throws InterruptedException {
		cart.launch("chrome");
		cart.launchpage();
		cart.login();
	}

	@When("^the user clicks add to cart$")
	public void the_user_clicks_add_to_cart() throws InterruptedException, IOException {
		cart.add();	
	}

	@Then("^the user gets the cart details$")
	public void the_user_gets_the_cart_details() throws InterruptedException, IOException {
		cart.cdetails();
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws InterruptedException {
		cart.close_search();
	}



}
