package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AmazonPage;

public class AmazonSteps {

    AmazonPage amazonPage = new AmazonPage();
    @Given("I navigate to {string}")
    public void iNavigateTo(String url) {
        amazonPage.navigateToAmazon(url);
    }
    @Given("searches for {string}")
    public void searchesFor(String txtToSearch) {
        amazonPage.enterTextToSearch(txtToSearch);
        amazonPage.clickOnSearchingButton();
    }
    @Given("navigates to the page {string}")
    public void navigatesToTheSecondPage(String pageNumber) {
        amazonPage.goToSecondPage(pageNumber);
    }
    @Given("select the third item")
    public void selectTheThirdItem() {
        amazonPage.clickonThirdElement();
        amazonPage.addItemToCart();
    }
    @Then("I assert that the item would be available for purchase\\(user would be able to add it to the cart)")
    public void iAssertThatTheItemWouldBeAvailable() {
        String message = amazonPage.addedToCartMessage();
        Assert.assertEquals("Agregado al carrito",message);
    }
}