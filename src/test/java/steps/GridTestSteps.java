package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GridPage;

public class GridTestSteps {
    GridPage grid = new GridPage();

    @Given("^I navigate to the static table$")
    public void navigateToGridPage(){
        grid.navigateToGrid();
    }

    @Then("^I can return the value I wanted$")
    public void returnValue(){
        String value = grid.getValueFromGrid(3,2);
        System.out.println(value);
    }

    // Este steps va a fallar ya que la grilla no es editable. Por eso quedó comentado en el gherkin.
    @And("^I can edit that cell$")
    public void editCell(){
        grid.editValueOfACell(3,2,"whatever");
    }

}