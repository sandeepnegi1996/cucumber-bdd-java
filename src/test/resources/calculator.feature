Feature: Evaluate Calculator Service

  Scenario: Verify addition
    Given Execute Calculator service add method
    When if i will enter 10 and 20
    Then we should get 30

