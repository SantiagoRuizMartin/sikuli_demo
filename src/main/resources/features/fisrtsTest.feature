Feature: My first test

  Scenario: As a user I want to sent a request using postman
    Given I have postman open
    And I go to the consumers tab
    When I press the send button
    Then The authorization field should be marked
