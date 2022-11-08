package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.DemoQAPage;

public class DemoQASteps {
    DemoQAPage demoqa = new DemoQAPage();

    @Given("^I navigate to the demoqa page$")
    public void navigateToDemoQAPage(){
        demoqa.navigateToDemoQA();
    }

    @And("^select {string} from the dropdown$")
    public void selectFromDropDown(String color){
        demoqa.selectCategory(color);
    }
}