Feature: Search Text on Google webpage

  @smoke
  Scenario: String search returns many results
    Given I am on google home page
    When I search ThoughtWorks
    When I submit search
    Then I see first result as ThoughtWorks: Agile Development and Experience Design