package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class GoogleSearch extends sere{
    GoogleHomePage googleHomePage;
    @Given("^I am on google home page$")
    public void I_am_on_google_home_page() throws Throwable {
        googleHomePage.open();
    }
}
