Feature: GET API Demo

  Background:
    * url 'http://localhost:9001'
    * header Accept = 'application/json'

  #Here we are providing the proper API url
  Scenario: Test a Get Employee call with given URL
    Given url 'http://localhost:9001/employees'
    When method GET
    Then status 200
    And print response
    And print responseStatus
    And print responseTime
    And print responseHeaders
    And print responseCookies

  Scenario: Test a Get Employee call with Background URL
    Given path '/employees'
    When method GET
    Then status 200
    And print response

  Scenario: Test a GET Employee by Id
    Given path '/employees/'
    And param employee = 1
    When method GET
    Then status 200
    And print response

  Scenario: Test a GET Employee with Assertions
    Given path '/employees'
    When method GET
    Then status 200
    And print response
    And match header Content-Type == 'application/json'
