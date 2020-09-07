
Feature: User search for the product
  As a user
  I want to Login successfully
  So that I can access my account
Background:
  Given User am on the homepage
  When I select LogIn link
  And I Enter the Email as shwetapagaria666@gmail.com
  And I Enter the Password as helloworld123
  And i click Login

  @smoke5
  Scenario:User Search for the Product with valid credentials
    And User selects desktop from the computer section

