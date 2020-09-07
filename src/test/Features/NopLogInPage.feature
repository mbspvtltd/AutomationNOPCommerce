Feature: User login for Automation Practise
  As a user
  I want to Login successfully
  So that I can access my account

  Background:
    Given User am on the homepage
    When I select LogIn link
    Then I should be on the Welcome Please Sign In Page
  @smoke2
  Scenario: : User can able to LogIn with valid credentials
    And I Enter the Email as shwetapagaria6778@gmail.com
    And I Enter the Password as helloworld123
   And i click Login

    @smoke3
    Scenario Outline:
    Verify User can see validation messages for invalid credentials
      And I Enter the Email as <email>
      And I Enter the Password as <password>
      And i click Login
      Then I should see Validation message as <message>

      Examples:
        |email|password|message|
       | shwetabuchcha@gmail.com| welcome12|Login was unsuccessful. Please correct the errors and try again.No customer account found|




