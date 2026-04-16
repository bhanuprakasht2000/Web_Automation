Feature: Register to the application 
@dev @wip @ignore 
Scenario: Signing into the facebook app website
Given User Should navigate the facebook Url
When User Should provide the firstname "Xyz" and surname "AA"
And User should provide the date of bith "15-07-2000"in the DOB column
And User should select select the any one of the gender"Male" in the gender column
And User should fill the phone no. or email id"12345678" along with the password "bhanu@123"
And User should click on the Signup button
Then User should succefully created the new account and log in into the Facebook

Scenario: Signing into the facebook app website without providing the email id or phone number and the password  
Given User Should navigate the facebook Url
When User Should provide the firstname "Xyz" and surname "AA"
And User should provide the date of bith "15-07-2000"in the DOB column
And User should select select the any one of the gender"Male" in the gender column
And User should  not filled the phone no. or email id  and  the password
And User should click on the Signup button
Then User will not get account created the new account and log in into the Facebook