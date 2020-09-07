Feature: Register feature for NOPCommerce
  As an User :
  I want to Register .
  So that i can log in successfully

  @smoke1
  Scenario: User can able to Register with valid credentials

    Given user is on the register page
    And I select the Gender as Male
    And I Enter the First Name as MonaPag
    And I Enter the Last Name as buchcha
    And I Enter the Date of birth as 7,June,2017
    And I Enter the Email as shwetapagaria666@gmail.com
    And I Enter the Password as helloworld123
    And I Confirm Password as helloworld123
   And I click Register
    And I click continue
    And I logout







