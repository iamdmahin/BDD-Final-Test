package pages;

import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ArticlePage extends Form {
    private final ILink toolsMenu = getElementFactory().getLink(By.xpath("//*[@id=\"right-navigation\"]/nav[2]"), "Tools Menu");
    private final ILink downloadPDF = getElementFactory().getLink(By.xpath("//*[@id=\"coll-download-as-rl\"]/a/span"), "Download as PDF");
    private final ILink pageInfo = getElementFactory().getLink(By.xpath("//*[@id=\"t-info\"]/a/span"), "Page Information");

    public ArticlePage() {
        super(By.id("firstHeading"), "Article Page");
    }

    public void openToolsMenu() {
        toolsMenu.state().waitForClickable();
        toolsMenu.click();
    }

    public void clickDownloadPDF() {
        downloadPDF.state().waitForClickable();
        downloadPDF.click();
    }

    public void clickPageInfo() {
        pageInfo.state().waitForClickable();
        pageInfo.click();
    }

    public boolean isDisplayed() {
        return getElementFactory().getLabel(By.id("firstHeading"), "Article Heading").state().isDisplayed();
    }
}