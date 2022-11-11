package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ListPage;

import java.util.List;

public class ListPageSteps {

    ListPage list = new ListPage();

    @Given("^I navigate to the list page")
    public void navigateToListPage() {
        list.navigateToListPage();
    }

    @When("^I search (.*) in the list")
    public void searchList(String state) throws InterruptedException {
        list.enterSearchCriteria(state);
    }

    @Then("^I can find (.*) in the list$")
    public void findTextInList(String city) {
        List<String> myList = list.getAllSearchResults();
        boolean textIsThere = myList.contains(city);

        if(textIsThere){
            System.out.println("The text is in the list: PASSED");
        }else{
            throw new Error("The text in no in the list: FAILED");
        }
    }
    @Then("I print all results")
    public void printAllResults() {
        System.out.println("All string elements showed for the search: " + list.getAllSearchResults());
    }

    @Then("I click on a non existing element and print a customized error message")
    public void treatNonExistingElement() {
        list.clickOnNonExistingElement();
    }
}