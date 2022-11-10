Feature: Test different actions on a sandbox page.

  Scenario: As a Tests Enginner, I try out different actions on a sandbox page.
    Given I navigate to the demoqa page
    And select a value from the dropdown

  @Ger
  Scenario: As a Test Engineer, I want to retrieve the value of an static table.
    Given I navigate to the static table
    Then I can return the value I wanted
    # El step de abajo falla debido a que la tabla es no editable. Por eso lo comento.
    #And I can edit that cell
  @Ger
  Scenario: As a Test Engineer, I want to validate the static table is displayed
    Given I navigate to the static table
    Then I can validate the table is displayed

  @Lists
  Scenario: As a Test Engineer, I want to validate that a text is present inside the list.
    Given I navigate to the list page
    When I search the list
    Then I print all results
    Then I can find the text in the list
