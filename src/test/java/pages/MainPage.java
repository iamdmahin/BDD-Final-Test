package pages;

import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class MainPage extends Form {
    private final ITextBox searchInput = getElementFactory().getTextBox(By.name("search"), "Search Input");

    public MainPage() {
        super(By.className("central-textlogo"), "Wikipedia Main Page");
    }

    public void searchFor(String query) {
        searchInput.state().waitForDisplayed(); // Ensure input box is displayed
        searchInput.clearAndType(query);
        searchInput.submit();
    }

    public void open() {
        getDriver().navigate().to("https://www.wikipedia.org/");
    }

    public boolean isDisplayed() {
        return getElementFactory().getLabel(By.className("central-textlogo"), "Wikipedia Logo").state().isDisplayed();
    }

    private WebDriver getDriver() {
        return getBrowser().getDriver();
    }
}