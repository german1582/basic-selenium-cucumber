@Ger
Feature: Test different actions on a sandbox page.

  Scenario: As a Tests Enginner, I try out different actions on a sandbox page.
    Given I navigate to the demoqa page
    And select a value from the dropdown

  Scenario: As a Test Engineer, I want to retrieve the value of an static table.
    Given I navigate to the static table
    Then I can return the value I wanted
    # El step de abajo falla debido a que la tabla es no editable. Por eso lo comento.
    #And I can edit that cell
