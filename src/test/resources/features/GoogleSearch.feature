Feature: Search Text on Google webpage

  @smoke
  Scenario: String search returns many results
    Given I am on google home page
    When I type "ThoughtWorks" as search text
    When I submit search
    Then I see first result as "ThoughtWorks: Agile Development and Experience Design"

  @smoke
  Scenario: String search shows alternative search options
    Given I am on google home page
    When I type "ThoughtWorks" as search text
    Then I see at least one listed alternative search options