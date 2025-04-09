
@tag
Feature: Title of your feature
  I want to use this template for my feature file

Background:

		Given Navigate to url "http://automationexercise.com"
		Then Verify that Home page is visible successfully
		
  @tag1
  Scenario: Title of your scenario
    
    When Click on SignupLogin button
		Then Verify That "New User Signup!" is visible
		When Enter name "mohamed" and email address "mohamed.ahmeddd@gmail.com"
		When Click Signup button
    

  