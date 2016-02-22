package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GoogleHomePage extends PageObject{
    @FindBy(name="q")
    private WebElementFacade searchInput;

    @FindBy(name="btnK")
    private WebElementFacade submitButton;

    public void enterSearchText(String serachText){
        searchInput.sendKeys(serachText);
    }

    public void submitSearch(){
        submitButton.click();
    }
}
