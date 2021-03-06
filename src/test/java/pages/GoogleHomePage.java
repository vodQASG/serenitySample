package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

public class GoogleHomePage extends PageObject{
    @FindBy(name="q")
    private WebElementFacade searchInput;

    @FindBy(name="btnG")
    private WebElementFacade submitButton;

    @FindBy(xpath="//*[@id='rso']/div[1]/div/div/h3/a")
    private WebElementFacade firstSearchedLink;

    @FindBy(css = ".sbqs_c")
    private WebElementFacade firstListedSearchAlternative;

    public void enterSearchText(String serachText){
        searchInput.sendKeys(serachText);
    }

    public void submitSearch(){
        submitButton.click();
    }

    public String getFirstSearchedLinkText(){
        return firstSearchedLink.getText();
    }

    public String getFirstListedSearchAlternative() {
        return firstListedSearchAlternative.getText();
    }
}
