

  Feature: Register


    Scenario: User should able to register
      Given User should register with valid credentials
      Then User should verify status code


    Scenario: User should input the valid credentials
      Given Input valid credentials
      Then verify token Status Code

    @wip
    Scenario: User should able to be authorized
      Given User should be authorized with valid credentials
      Then verify authorized Status Code

    @wip
    Scenario: User should able to see the collection
      Given User should see the book list
      Then User should verify the book status code

    @wip
    Scenario: User should able to all books list from store
      Given User should see book list
      Then User verify the books status codes

    @wip
    Scenario: User should able to add new book to the collection
      Given User should add new book
      Then User should verify the add book status code

    @wip
    Scenario: User should able to update the books
      Given User should update the collection
      Then User should verify the update status code

    @wip
    Scenario: User should able delete a book from collection
      Given User should delete a book
      Then User should verify delete status code

    @wip
    Scenario: User should able delete account
      Given User should delete account
      Then User should verify delete account status code
