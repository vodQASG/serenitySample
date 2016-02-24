package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import pages.GoogleHomePage;

import static org.assertj.core.api.Assertions.assertThat;

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

    @Then("^I see first result as (.*)$")
    public void verifyFirstSearchedLink(String expectedFirstSearchLinkText) {
        assertThat(googleHomePage.getFirstSearchedLinkText()).isEqualTo(expectedFirstSearchLinkText);
    }
}
