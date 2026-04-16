import {test,expect} from "@playwright/test"
//The data changing each time check the postman
test("Get the data through the Pathparam get()",async({request})=>{
    test.slow()
    const bookingid=1;
    //Path params for getting the data
const  response=  await request.get(`/booking/${bookingid}`);
const responsebody= await response.json();
console.log("=====Path parameters====")

console.log(responsebody);
expect (responsebody).toHaveProperty("firstname");
expect (response.status()).toBe(200);
})
test("Get the data through Query the Pathparam get()",async({request})=>{
console.log("=====Query parameters====")
//Using the Query parameters
const firstname="Eric";
const lastname="Wilson";
const Queryresponse=await request.get('/booking/',{params:{firstname,lastname}})
const Queryresponsebody=await Queryresponse.json();
console.log(Queryresponsebody)
expect (Queryresponse.status()).toBe(200);
//Output will be received in the format of the array hence assertion are done as per that
expect (Queryresponsebody.length).toBeGreaterThan(0);//Output will be fetched in the form of an array
expect ( typeof(await Queryresponsebody[0].bookingid)).toBe("number");//since its an  array
})