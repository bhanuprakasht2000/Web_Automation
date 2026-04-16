import {test,expect} from "@playwright/test"
import Ajv, { JSONSchemaType } from "ajv";

/*install Ajv by using the cmd==>npm install ajv
==>npm install -D ajv
*Use the line==>import Ajv, { JSONSchemaType } from "ajv";
*for importing the ajv
 Use the url ==>https://jsonlint.com/json-schema-generator
* under the covert options select the json schema generator
*Just copy paste the url in the post man and copy the output data and paste it in the url
*U will get the json schema validator
*/
/*Json Schema==> first 2 lines related to schema(additional lines==>skip them) and no need to copy
{
  "$schema": "https://json-schema.org/draft/2020-12/schema",
  "title": "Generated Schema",
  "type": "object",
  "properties": {
    "firstName": {
      "type": "string"
    },
    "lastName": {
      "type": "string"
    },
    "city": {
      "type": "string"
    },
    "state": {
      "type": "string"
    }
  }
}*/
test("JsonSchema validation",async({request})=>{
const response=await request.get("https://mocktarget.apigee.net/json");
const responsebody=await response.json();
console.log(responsebody);
const schema={
    //Schema should have to be taken form the website of json schema validator==>https://jsonlint.com/json-schema-generator
   //For Schema genaration the json bvalues should mbe taken from the postman but not from the output of this test

  "type": "object",
  "properties": {
    "firstName": {
      "type": "string"
    },
    "lastName": {
      "type": "string"
    },
    "city": {
      "type": "string"
    },
    "state": {
      "type": "string"
    }
  }
}
//Validation of the schema
const ajv=new Ajv()
const v=ajv.compile(schema);//Here ajv.compile() returns v of  validatefunction() type
//We are creating the validate function and passing the responsebody
//If we are using the v at the top line means we need to use the same for the below line as well
const k=v(responsebody);//k returns true or false on comparing the schema and responsebody

  expect(k).toBeTruthy();
})
test("JsonSchema validation for normal",async({request})=>{
const response=await request.get("https://restful-booker.herokuapp.com/booking/10174");
const responsebody=await response.json();
console.log(responsebody);
const schema={
  //Schema should have to be taken form the website of json schema validator==>https://jsonlint.com/json-schema-generator
  //For Schema genaration the json bvalues should mbe taken from the postman but not from the output of this test
  // "$schema": "https://json-schema.org/draft/2020-12/schema",
  // "title": "Generated Schema",
  "type": "object",
  "properties": {
    "firstname": {
      "type": "string"
    },
    "lastname": {
      "type": "string"
    },
    "totalprice": {
      "type": "integer"
    },
    "depositpaid": {
      "type": "boolean"
    },
    "bookingdates": {
      "type": "object",
      "properties": {
        "checkin": {
          "type": "string"
        },
        "checkout": {
          "type": "string"
        }
      }
    },
    "additionalneeds": {
      "type": "string"
    }
  }
}
//Validation of the schema
const ajv=new Ajv()
const v=ajv.compile(schema);//Here ajv.compile() returns v of  validatefunction() type
//We are creating the validate function and passing the responsebody
//Is we are using the v at the top line means we need to use the same for the below line as well
const k=v(responsebody);//k returns true or false on comparing the schema and responsebody
  expect(k).toBeTruthy();
})