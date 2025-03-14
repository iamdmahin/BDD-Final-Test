Feature: Wikipedia search language

  Scenario: Search for a Wikipedia article and check the page display
    Given I navigate to the Wikipedia home page
    When I search for "Gabriel García Márquez"
    Then The article page should be displayed correctly
