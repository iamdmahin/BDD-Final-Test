Feature: Wikipedia Page Information

  Scenario: Viewing the page information
    Given I am on the Wikipedia main page
    When I search for "Bengal tiger"
    And I navigate to "Page information" from the Tools menu
    Then The "Page information" page should be displayed