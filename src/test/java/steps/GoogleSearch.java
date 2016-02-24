package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import pages.GoogleHomePage;

public class GoogleSearch {
    GoogleHomePage googleHomePage;

    @When("^I search ThoughtWorks$")
    public void searchText(){
        googleHomePage.enterSearchText("ThoughtWorks");
    }

    @When("^I submit search$")
    public void submitSearch() {
        googleHomePage.submitSearch();
    }
}
