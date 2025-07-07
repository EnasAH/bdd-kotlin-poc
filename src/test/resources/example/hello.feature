Feature: Say hello

  Scenario: Saying hello to a user
    Given the user name is "John"
    When I say hello
    Then I should see "Hello, John!"