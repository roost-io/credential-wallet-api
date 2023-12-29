Feature: Credential Wallet API
  As a user of the Credential Wallet API
  I want to be able to perform CRUD operations on accounts
  So that I can manage my account effectively

  Background:
    Given the base URL is "http://localhost:8080"

  Scenario: Create my account 
    When the client sends a POST request "/accounts" with the accounts_body payload
    Then create an account with the specified informatio
    And verify the account created using GET request for "/me"
