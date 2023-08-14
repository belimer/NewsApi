Feature: Get Country Article
  Scenario: Fetching articles of a country when correct params are sent and with has articles
    When  When I send a valid GET request to "http://localhost:8881/api/news?country=us"
    Then I should receive a success response with data
  Scenario: Fetching articles of a country when the country param is invalid or doe not have articles
    When  When I send a an invalidGET request to "http://localhost:8881/api/news?country=usw"
    Then I should receive a success response without data