package pages;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class PageInfoPage extends Form {
    public PageInfoPage() {
        super(By.id("firstHeading"), "Page Information");
    }

    public boolean isPageInfoDisplayed() {
        return getElementFactory().getLabel(By.id("content"), "Content").state().isDisplayed(); // Verify page content
    }
}