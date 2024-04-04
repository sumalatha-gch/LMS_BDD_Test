Feature: User Module CRUD Operations

 Background: Check if Admin able to generate token with valid credential
    Given Admin creates request with "valid" credentials
    When Admin Admin calls Post Https method  with "valid endpoint"
    Then Admin Admin receives 200 created with auto generated token

 @CreateNewBatch
Scenario: Check if user able to retrieve all batches  with valid LMS API
    Given User creates New User "Create New Batch" from "batches" sheet for the LMS API From Excel
    When User requests to Get "CRUD Operation" Request for the LMS API "End Point"
    Then User receives "Status Code" code with response body "Status Message"
   