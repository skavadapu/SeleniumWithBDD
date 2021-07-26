Feature: Application Login

Scenario: Home page login with set1 data
Given User is on Netbanking login page
When User login into login application with "Ram" and "1234"
Then Home page is populated
And Cards displayed are "true"


Scenario: Home page login with set2 data
Given User is on Netbanking login page
When User login into login application with "Lalit" and "5678"
Then Home page is populated
And Cards displayed are "false"

