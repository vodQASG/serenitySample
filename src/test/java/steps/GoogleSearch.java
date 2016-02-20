package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import net.serenitybdd.core.Serenity;
import pages.GoogleHomePage;

public class GoogleSearch extends Serenity {
    GoogleHomePage googleHomePage;
    @Given("^I am on google home page$")
    public void I_am_on_google_home_page() throws Throwable {
        googleHomePage.open();
    }
}
