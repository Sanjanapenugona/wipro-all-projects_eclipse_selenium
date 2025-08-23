Feature: user have to check login page is working or not
Scenario:
: user must be enter valid credintials
Given login page navigate to defauly browser
When user enter the email and their password
Then signin successfully