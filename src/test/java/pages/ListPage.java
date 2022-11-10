package pages;

import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ListPage extends BasePage {

    private String searchField = "//body/form[1]/input[1]";
    private String searchResults = "name";

    private String nonExistingElement = "//a[@name='itDoesNotExist']";

    public ListPage() {
        super(driver);
    }

    public void navigateToListPage() {
        navigateTo("https://andreidbr.github.io/JS30/06AjaxTypeAhead/index.html");
    }

    public void enterSearchCriteria() throws InterruptedException {
        // es mala practica pero en este caso es necesario ya que sin el sleep, esta lista en particular, funciona de tal manera que
        // escribe directamente sin traer todas las opciones que necesitamos para popular nuestra lista.
        Thread.sleep(600);
        write(searchField, "Washington");
    }

    public List<String> getAllSearchResults() {
        List<WebElement> list = bringMeAllElements(searchResults);
        List<String> stringsFromList = new ArrayList<String>();
        for (WebElement e : list) {
            stringsFromList.add(e.getText());
        }
        return stringsFromList;
    }

    public void clickOnNonExistingElement(){
        try {
            clickElement(nonExistingElement);
        } catch (NoSuchContextException e) {
            System.out.println("Web element was not found");
            e.printStackTrace();
        }
    }
}