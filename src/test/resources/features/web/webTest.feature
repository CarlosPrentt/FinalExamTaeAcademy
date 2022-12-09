Feature: Web Test

  Scenario: Sign Up
    Given the user click to login
    And the user click on Sign Up
    When the user enter valid credential
    Then a homepage should be shown

  Scenario: Watch Page
    Given the user click on Watch
    When the user click on the second card of the carousel
    Then a window should be opened

  Scenario: Log out
    Given the user click back to Landing Page
    When the user click on log out
    Then the account should be closed