Feature: Config demo

  #We can give the URL path in the config class and use everywhere
  #here we are using (baseURL). The value will come from config.js
  Background:
    * url baseURL
    * header Accept = 'application/json'

  Scenario: Config demo
    Given print name

  Scenario: Simple GET Request
    Given path '/users?page=2'
    When method GET
    Then status 200
    And print response