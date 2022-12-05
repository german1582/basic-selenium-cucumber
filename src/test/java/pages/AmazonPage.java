package pages;

public class AmazonPage extends BasePage {

    public AmazonPage() {
        super(driver);
    }

    private String inputSearch = "//input[@id='twotabsearchtextbox']";
    private String btonSearch = "//input[@id='nav-search-submit-button']";
    private String btonGoToPage2 = "//span/a[@aria-label='Go to page 2']";

    //private String thirdElement = "//div/div[@data-index='3']"; --> no funciona bien
    private String thirdElement = "(//div/span//a/div/img)[3]";
    private String addToCartDisableButton = "//span[@id='exportsUndeliverable-cart-announce']";
    private String addToCartButton = "//input[@id='add-to-cart-button']";

    private String addedMessageText = "//span[contains(text(),'Agregado al carrito')]";

    public void navigateToAmazon(String url) {
        navigateTo("https://" + url);
    }

    public void enterTextToSearch(String txtToSearch) {
        write(inputSearch, txtToSearch);
    }

    public void clickOnSearchingButton() {
        clickElement(btonSearch);
    }

    public void goToSecondPage(String pageNumber) {

        goToLinkText(pageNumber);
    }

    public void clickonThirdElement() {
        clickElement(thirdElement);
    }

    public void addItemToCart() {
        clickElement(addToCartButton);
    }

    public String addedToCartMessage() {
        return textFromElement(addedMessageText);
    }
}