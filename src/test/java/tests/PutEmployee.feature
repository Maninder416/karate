Feature: Put Employee API demo

  Background:
    * url 'http://localhost:8080'
    * header Accept = 'application/json'
    * def expectedOutput = read('/jsons/employee.json')

  Scenario: Update Employee
    Given path '/employees'
    And request {"id": "100","name": "Robin-200"}
    When method PUT
    Then status 200
    And print response