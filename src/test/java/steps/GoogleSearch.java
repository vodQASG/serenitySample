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

    @Given("^I am on google home page$")
    public void openGoogleHomePage() throws Throwable {
        googleHomePage.open();
    }

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

    @Then("^I see at least one listed alternative search options$")
    public void iSeeAtLeastOneListedAlternativeSearchOptions() throws Throwable {
        assertThat(googleHomePage.getFirstListedSearchAlternative()).isNotNull();
    }
}
