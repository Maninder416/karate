Feature: Verify Persons

  Background:
    Given url 'http://localhost:9000/'

  Scenario: Post Employee
    Given path '/employees'
    And request {"name": "Robin-201"}
    When method POST
    Then status 200
    And print response
    And print response.name
    And match response.name == "Robin-201"


#  Scenario: Get Employee call with given URL
#    Given url 'http://localhost:9000/employees'
#    When method GET
#    Then status 200
#    And print response
#    And print responseStatus
#    And print responseTime
#    And print responseHeaders
#    And print responseCookies
#
#  Scenario: Test a Get Employee call with Background URL
#    Given path '/employees'
#    When method GET
#    Then status 200
#    And print response
#
#  Scenario: Test a GET Employee by Id
#    Given path '/employees/2'
#    And param employee = 10
#    When method GET
#    Then status 200
#    And print response
##    And match response.name= "Maninder"
#
#  Scenario: Test a GET Employee with Assertions
#    Given path '/employees'
#    When method GET
#    Then status 200
#    And print response
#    And match header Content-Type == 'application/json'
#
#  Scenario: Delete Employee
#    Given path '/employees/1'
#    When method DELETE
#    Then status 200
#    And print response

