Feature: Wikipedia PDF Download

  Scenario: Downloading a Wikipedia article as a PDF
    Given I am on the Wikipedia main page
    When I search for "Albert Einstein"
    And I navigate to "Download as PDF" from the Tools menu
    Then The PDF file is downloaded successfully