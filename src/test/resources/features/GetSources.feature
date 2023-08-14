Feature: Get Sources

  Scenario: Fetching all sources
    When  When I send a GET request to "http://localhost:8881/api/sources"
    Then I should receive a success response with data

