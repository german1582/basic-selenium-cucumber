@StaticTable @Ger
Feature: Test different actions on a static table.

  # The Rule es quizas lo más importante del feature file. Es lo que le da el sentido a todos los escenarios.Scenario
  # Es el norte u objetivo al que apuntan todos los escenarios y la feature en si.
  # No está linkeada tecnicamente a ningun codigo pero nos dice cual es la bussiness rule que esta feature va a cubrir.
  Rule: The user can return values from the table and validate them

  #Tambien podría hacerse con hooks pero a nivel de reporte, no van a ser legibles como con el Background.
  Background: Navigate to Table web app
    Given I navigate to the static table


  Scenario: As a Test Engineer, I want to retrieve the value of an static table.
    Then I can return the value I wanted
    # El step de abajo falla debido a que la tabla es no editable. Por eso lo comento.
    #And I can edit that cell

  Scenario: As a Test Engineer, I want to validate the static table is displayed
    Then I can validate the table is displayed
