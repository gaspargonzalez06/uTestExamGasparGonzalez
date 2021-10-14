# Author : Gaspar Gonzalez
@Stories
Feature: utest exam
    As a user , I want to create my account for utes.com

    @scenario1
    Scenario: when the user was creating a new account

    Given than Mark wants to create a new user for utest.com
    | strFirstName	|strLastName	|strEmailAddress|strBirthdayMonth|strBirthdayDay|strBirthdayYear| strZip|strPassword  | strConfirmPassword  |
    |	YourFirstName|	YourLastName|YourEmailAddress|YourBirthdayMonth|YourBirthdayDay|YourBirthdayYear|YourZip|YourPassword | YourPasswordAgain    |

    When he finish the form the system search the confirmation Page
    |strRedirectionPage|
    |Confirmation Page|
    Then he finds the confirmation Page
    |strRedirectionPage|
    |Confirmation Page|

