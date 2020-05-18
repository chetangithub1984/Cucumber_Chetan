package stepdefinations;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;
import java.util.Set;

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

    @Given("^I am a good Player$")
    public void iAmAGoodPlayer() {
    }

    @When("^I play \"([^\"]*)\" and give my \"([^\"]*)\"$")
    public void iPlayAndGiveMy(String game, String percentage) throws Throwable {
        System.out.println("game name is " +game + "percentage is - " + percentage);
    }

    @Then("^I feel happy$")
    public void iFeelHappy() {
    }

    @Given("^I am having a bike$")
    public void iAmHavingABike() {
    }

    @And("^I started bike and went to fruit market$")
    public void iStartedBikeAndWentToFruitMarket() {
    }

    @When("^I bought below mentioned fruits$")
    public void iBoughtBelowMentionedFruits(DataTable dataTable) {
        List<List<String>> listveg = dataTable.raw();

        for (List<String> list : listveg) {
                for (String listv : list) {
                    System.out.print(listv + " ");
                }
                System.out.println();
        }
    }

    @Given("^I am having a car$")
    public void iAmHavingACar() {
    }

    @And("^I started car and went to fruit market$")
    public void iStartedCarAndWentToFruitMarket() {
    }

    @When("^I bought below mentioned fruit$")
    public void iBoughtBelowMentionedFruit(DataTable dataTable) {
        List<Map<String, String>> lists = dataTable.asMaps(String.class, String.class);
        for (Map<String,String> rows : lists) {

                System.out.println("Fruit is - " + rows.get("fruit") + " and taste is - " + rows.get("taste"));

        }
    }

    @Given("^We are following background$")
    public void weAreFollowingBackground() {
        System.out.println("Background steps running");
    }
}
