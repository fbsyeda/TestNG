Feature: TextBox
  Scenario: User fill out text box
    Given : User should be able to launch browser
    Then : User enter full name
    Then : user enter current address
    Then : User validate form label
    And : User click submit

Scenario: Checkbox
  Given : User should be able to launch browser
  Then : User click on Checkbox
  Then : user clik on Home checkbox

  Scenario: Radio button
    Given : User should be able to launch browser
    Then : User click on Radio Button
    Then : User validate text before selection
    Then : User validate Yes and Impression radio button enabled
    Then : User validate No is dissabled
    Then : User select Yes
    #And : User validate text after selection