package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GridPage;

public class GridTestSteps {
    GridPage grid = new GridPage();

    @Given("^I navigate to the static table$")
    public void navigateToGridPage() {
        grid.navigateToGrid();
    }

    @Then("^I can return the value I wanted$")
    public void returnValue() {
        final String value = grid.getValueFromGrid(3, 2);
        System.out.println(value);
        Assert.assertEquals("r: 2, c: 1", value);
    }

    @Then("^I can validate the table is displayed$")
    public void vtableIsThere() {
        //Assert.assertFalse("El elemento si es mostrado. Explotó todo!!!", grid.cellStatus()); --> va a fallar y el msje de la excepcion va a ser: "El elemento si es mostrado. Explotó todo!!!"
        Assert.assertTrue("Ahora si es mostrado", grid.cellStatus()); // Aunque no veo el mensaje "Ahora si es mostrado" por ningun lado
    }


    // Este steps va a fallar ya que la grilla no es editable. Por eso quedó comentado en el gherkin.
    @And("^I can edit that cell$")
    public void editCell() {
        grid.editValueOfACell(3, 2, "whatever");
    }

}