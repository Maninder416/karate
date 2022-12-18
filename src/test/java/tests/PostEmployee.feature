Feature: Post API Employee Demo

  Background:
    * url 'http://localhost:8080'
    * header Accept = 'application/json'
    * def expectedOutput = read('/jsons/employee.json')

  Scenario: Post Employee
    Given path '/employees'
    And request {"id": "100","name": "Robin-100"}
    When method POST
    Then status 200
    And print response

  Scenario: Post Employee with Assertions
    Given path '/employees'
    And request {"id": "201","name": "Robin-201"}
    When method POST
    Then status 200
    And match response =={"id": 201, "name": "Robin-201"}
    And print response

  Scenario: Post employee with get response from file
    Given path '/employees'
    And request {"id": "201","name": "Robin-201"}
    When method POST
    Then status 200
    And match response == expectedOutput
    And print response

  Scenario: Post employee with get request and response from file
    Given path '/employees'
    And def requestBody = read('/jsons/employee.json')
    And request requestBody
    When method POST
    Then status 200
    And match response == expectedOutput
    And print response




