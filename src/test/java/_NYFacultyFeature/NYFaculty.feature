Feature: Checking Faculty&Staff page functionality
  @NY
  Scenario: Verifying Faculty&Staff menu button
    Given User navigates to the main page "urlMain"
    When User hover over on Faculty&Staff button on menu
    Then Button color changes
    And Button is clickable

  Scenario: Verifying Faculty&Staff dropdown menu
    Given User navigates to the main page "urlMain"
    When User hover over Faculty&Staff button on menu
    Then Dropdown menu is visible

  Scenario: Verifying Faculty&Staff menu link
    Given User navigates to the main page "urlMain"
    When User clicks Faculty&Staff button on menu
    Then User navigates to respective page