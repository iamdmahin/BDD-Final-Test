package steps;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.*;

public class WikipediaSteps {
    private final MainPage mainPage = new MainPage();
    private final ArticlePage articlePage = new ArticlePage();
    private final DownloadPage downloadPage = new DownloadPage();
    private final PageInfoPage pageInfoPage = new PageInfoPage();

    @Given("I am on the Wikipedia main page")
    public void openWikipedia() {
        mainPage.open();
        Assert.assertTrue(mainPage.isDisplayed(), "Wikipedia main page is not displayed");
    }

    @Given("I navigate to the Wikipedia home page")
    public void i_navigate_to_the_wikipedia_home_page() {
        mainPage.open();
        Assert.assertTrue(mainPage.isDisplayed(), "Wikipedia home page is not displayed");
    }

    @When("I search for {string}")
    public void searchForArticle(String article) {
        mainPage.searchFor(article);
        Assert.assertTrue(articlePage.isDisplayed(), "Article page is not displayed after search");
    }

    @When("I search for {string} in {string}")
    public void searchForArticleInLanguage(String article, String language) {
        // Change the language logic if needed (you can add dropdown selection for language)
        mainPage.searchFor(article);
        Assert.assertTrue(articlePage.isDisplayed(), "Article page is not displayed after search");
    }

    @When("I navigate to {string} from the Tools menu")
    public void navigateTo(String option) {
        articlePage.openToolsMenu();

        switch (option) {
            case "Download as PDF":
                articlePage.clickDownloadPDF();
                break;
            case "Page information":
                articlePage.clickPageInfo();
                Assert.assertTrue(pageInfoPage.isPageInfoDisplayed(), "Page Information page is not displayed");
                break;
            default:
                Assert.fail("Invalid option provided: " + option);
        }
    }

    @Then("The PDF file is downloaded successfully")
    public void verifyPDFDownload() {
        // Implement logic to verify that the PDF file has been downloaded successfully
        // This may involve checking the file system for the downloaded file
        Assert.assertTrue(downloadPage.isPDFDownloaded(), "The PDF file was not downloaded successfully");
    }

    @Then("The {string} page should be displayed")
    public void verifyPage(String page) {
        switch (page.toLowerCase()) {
            case "page information":
                Assert.assertTrue(pageInfoPage.isPageInfoDisplayed(), "Page Information is not displayed");
                break;
            default:
                Assert.fail("Unknown page: " + page);
        }
    }

    @Then("The article page should be displayed correctly")
    public void the_article_page_should_be_displayed_correctly() {
        Assert.assertTrue(articlePage.isDisplayed(), "Article page is not displayed correctly");
    }
}