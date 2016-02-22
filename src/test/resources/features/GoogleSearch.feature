Feature: Search Text on Google webpage

  Scenario: String search returns many results
    When I search ThoughtWorks
    When I submit search
    #Then I see many results