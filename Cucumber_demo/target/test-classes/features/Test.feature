Feature: validate login page
@priority1
Scenario Outline:
: check for valid and invalid credentials
Given login page should be open in default browser
When click on login button and enter <username1>
And add <password1>
And click on signin button check <status>
Then login successfully and open home page
Examples:
|username1|password1|status|
|123455|password|fail|
|username|ng45666|fail|
|ahuunsss|234fgh|fail|
|username|password|success|