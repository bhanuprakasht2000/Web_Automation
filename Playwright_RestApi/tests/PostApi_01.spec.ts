import{test,expect} from "@playwright/test"
test("Post method with normal json request",async({request})=>{
    const requestbody={
                 "firstname" : "Jim",
                "lastname" : "Brown",
                "totalprice" : 111,
                 "depositpaid" : true,
                  "bookingdates" : {
                         "checkin" : "2018-01-01",
                        "checkout" : "2019-01-01"
                                     },
                     "additionalneeds" : "Breakfast"        
                        }
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
        "firstname": "Jim",
        "lastname": "Brown",
        "totalprice": 111,
        "depositpaid": true,
        "bookingdates": {
            "checkin": "2018-01-01",
            "checkout": "2019-01-01"
        }})
        expect(booking.bookingdates).toMatchObject({
            //Nested json object validation
            "checkin": "2018-01-01",
            "checkout": "2019-01-01"
        })



})