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
    public void iAmOnGoogleHomePage(){
        googleHomePage.open();
    }

    @When("^I type \"([^\"]*)\" as search text$")
    public void iTypeAsSearchText(String searchText){
        googleHomePage.enterSearchText(searchText);
    }

    @When("^I submit search$")
    public void iSubmitSearch(){
        googleHomePage.submitSearch();
    }

    @Then("^I see first result as \"([^\"]*)\"$")
    public void iSeeFirstResultAs(String expectedFirstSearchLinkText){
        assertThat(googleHomePage.getFirstSearchedLinkText()).isEqualTo(expectedFirstSearchLinkText);
    }

    @Then("^I see at least one listed alternative search options$")
    public void iSeeAtLeastOneListedAlternativeSearchOptions(){
        assertThat(googleHomePage.getFirstListedSearchAlternative()).isNotNull();
    }

}
