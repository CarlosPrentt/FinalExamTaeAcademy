Feature: Mobile Test
  Background:
    Given the user is in the Disney Application

  Scenario: Category List
    Given the user tap on the Map Button
    When the user tap on Category List section
    Then different categories should be listed

  Scenario: Privacy & Legal
    Given the user tap on Menu Button
    When the user tap on Privacy & Legal section
    Then a list of options should be displayed

  Scenario: Add Plans
    Given the user tap on Add Plan button
    When Add Plans option List is shown
    Then Reserve Dining Option should be listed
