
package pages;

import org.junit.experimental.categories.Categories;

public class DemoQAPage extends BasePage {
    private String categoryDropdown = "//select[@id='oldSelectMenu']";

    public DemoQAPage(){
        super(driver);
    }

    public void navigateToDemoQA(){
        navigateTo("https://demoqa.com/select-menu");
    }

    public void selectCategory(String category){
        selectFromDropDownByText(categoryDropdown, category);
    }
}