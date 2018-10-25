@ClassicsjaveAFeatures
Feature: Test ClassicsJavaA App
I want to use this template for my feature file

@smoke
@TestCaseKey=ABC-T001
Scenario: Open and Close ClassicsJavaA App
Given I start ClassicsJavaA App
Then I close the App

@smoke
@TestCaseKey=ABC-T002
Scenario: maximize and restore ClassicsJavaA App
Given I start ClassicsJavaA App
Then I maximize the App
Then I click the same button to restore the App
Then I close the App