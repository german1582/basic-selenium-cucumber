Feature: Test different actions on a list Page

  @Lists
  Scenario Outline: As a Test Engineer, I want to validate that a text is present inside the list.
    Given I navigate to the list page
    When I search <state> in the list
    Then I print all results
    Then I can find <city> in the list
    Examples:
      | state      | city                |
      | Washington | Seattle, Washington |
      | Illinois   | Chicago, Illinois   |
      | Texas      | Dallas, Texas       |


  @Error
  Scenario: As a Test Engineer, I want to validate that a proper error message is displayed
    Given I navigate to the list page
    Then I click on a non existing element and print a customized error message
