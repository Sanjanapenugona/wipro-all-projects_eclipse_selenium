Feature: User want to checkout the page
Scenario Outline: Checkout page
 Given  login home page with valid credintials
 When user give information "<firstname>" "<lastname>" "<address>" "<state>" "<postalcode>" These rae the information
 Then Order successfully confirmed
 Examples:
 
| firstname | lastname  | address        | state          | postalcode |
| Sanjana  | Penugonda  | Gummalladoddi  | AndhraPradesh  | 533289     |