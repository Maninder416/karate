Feature: Delete Employee API demo

  Background:
    * url 'http://localhost:9001'
    * header Accept = 'application/json'
    * def expectedOutput = read('/jsons/employee.json')

  Scenario: Delete Employee
    Given path '/employees/1'
    When method DELETE
    Then status 200
    And print response