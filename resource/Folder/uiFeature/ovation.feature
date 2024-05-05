Feature: Oviation Other service Functionalities
Scenario: New user SignUp
Given user is at home page
When user click on other services link
Then user navigates to travel page
When user click on signIn button
Then user navigates to signIn page
When user click on sign up here link
Then user navigate to signUp page
When user enters the email as <"test@gmail.com">
And user enters the firstname as <"testname">
And user enters the lastname as <"testlastname">
And user enters the password as <"test@123">
And user re enters the password as <"test@123">
And user click on country dropdown
And user select country as india 
And user select the term and condition checkbox
And user select the personal information checkbox
And user select the ocation travel checkbox
And user click on create button

 