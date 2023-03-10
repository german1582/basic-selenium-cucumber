Feature: Challenge of last class

  @challenge
  Scenario Outline: Challenge of last class
    Given I navigate to "www.amazon.com"
    And searches for "<Product>"
    And navigates to the page "2"
    And select the third item
    Then I assert that the item would be available for purchase(user would be able to add it to the cart)
    Examples:
      | Product     |
      | alexa       |
      | playstation |
      | laptop dell |