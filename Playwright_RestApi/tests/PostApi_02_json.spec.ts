import{test,expect} from "@playwright/test"
import fs from 'fs';
test("Post method with external json request",async({request})=>{
    const jsonpath="./tests/testdata/testjsondata.json";
    let requestbody=JSON.parse(fs.readFileSync(jsonpath,'utf-8'))
   /* const requestbody={
                 "firstname" : "Jim",
                "lastname" : "Brown",
                "totalprice" : 111,
                 "depositpaid" : true,
                  "bookingdates" : {
                         "checkin" : "2018-01-01",
                        "checkout" : "2019-01-01"
                                     },
                     "additionalneeds" : "Breakfast"        
                        }*/
const response=await request.post("https://restful-booker.herokuapp.com/booking",{data:requestbody});
const responsebody=await response.json()//converting the data into the Json format
console.log("The Api data as follows:")
console.log(responsebody)
//Validate the status
expect(response.ok()).toBeTruthy()
expect(response.status()).toBe(200)
//Validate the response body
expect(responsebody).toHaveProperty("bookingid")
expect(responsebody).toHaveProperty("booking")
//Validate the booking object
const booking=responsebody.booking;
expect(booking).toMatchObject({
    //Check the output in the postman once
    //Json object validation
        "firstname": requestbody.firstname,
        "lastname": requestbody.lastname,
        "totalprice": requestbody.totalprice,
        "depositpaid": requestbody.depositpaid,
        "bookingdates":requestbody.bookingdates
    }
    )
       //Nested json object validation
        expect(booking.bookingdates).toMatchObject(requestbody.bookingdates)
         
         



})