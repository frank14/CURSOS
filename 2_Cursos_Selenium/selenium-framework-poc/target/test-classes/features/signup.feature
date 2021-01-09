Feature: Client sign up

  Scenario: Client sign up successfully
    Given Pepito wants to have an account
    When He sends required information to get the account
    Then He should be told that the account was created

  Scenario: Client sign up failed
    Given Pepito wants to have an account
    When He sends required information to get the account
    Then He should be told that the account was not created
