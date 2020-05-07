package main.java.stepdefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {

    @Given("^I am on the Login page URL \"([^\"]*)\"$")
    public void iAmOnTheLoginPageURL(String url) throws Throwable {
        System.out.println(url);
    }

    @When("^I enter username as \"([^\"]*)\"$")
    public void iEnterUsernameAs(String username) throws Throwable {
        System.out.println(username);
    }

    @And("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String passowrd) throws Throwable {
        System.out.println(passowrd);
    }

    @And("^click on login button$")
    public void clickOnLoginButton() {
    }

    @Then("^I sould see application homepage$")
    public void iSouldSeeApplicationHomepage() {
    }
}
