package com.Stepdefinition;

import java.io.IOException;

import com.pages.Jainbook_Aresetpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jainbook_Areset {
	Jainbook_Aresetpage b=new Jainbook_Aresetpage();
	@Given("^user launchs the chrome application$")
	public void user_launchs_the_chrome_application() {
		b.launch("chrome");
	}

	@When("^the user open the jainbookagency and login into the page$")
	public void the_user_open_the_jainbookagency_and_login_into_the_page() throws IOException {
		b.LoginPage();
		b.login();
	}

	@Then("^the user  enters book name in the text box and click on reset$")
	public void the_user_enters_book_name_in_the_text_box_and_click_on_reset() throws InterruptedException, IOException {
		b.reset();
	}

	@Then("^the user logout from the page and close the browser$")
	public void the_user_logout_from_the_page_and_close_the_browser() throws InterruptedException {
		b.close();
	}
	
}
