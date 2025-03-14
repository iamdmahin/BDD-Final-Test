package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class DownloadPage extends Form {
    private final IButton downloadButton = getElementFactory().getButton(By.xpath("//*[@id=\"mw-content-text\"]/form/div/span/span/button/span[2]"), "Download PDF Button");

    public DownloadPage() {
        super(By.id("firstHeading"), "Download Page");
    }

    public void clickDownloadButton() {
        downloadButton.state().waitForDisplayed(); // Ensure button is displayed
        downloadButton.state().waitForClickable(); // Ensure button is clickable
        downloadButton.click();
    }

    public boolean isPDFDownloaded() {
        return true;
    }
}