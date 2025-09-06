Feature: User want to dalete the product from the cart
Scenario: Delete product from cart
Given User is able to login with Username and password
When Delete item from cart
Then Item deleted successfully