import {test,expect} from "@playwright/test"
import { request } from "http";
/*
1>No Auth(public Api)
2>Basic Auth/Preemptive Auth(Username,Password)
3>Bearer token
4>Api Key 
*/

//Noauth Api
test("No Authentication",async({request})=>{
const noauthresponse=await request.get("https://restful-booker.herokuapp.com/booking/1");
const noauthresponsebody=await noauthresponse.json();
console.log(noauthresponsebody);
  expect(noauthresponse.ok).toBeTruthy();
    expect(noauthresponse.status()).toBe(200);
})
//Basic Auth
test("Basic Authentication",async({request})=>{
    const basicresponse=await request.get("https://httpbin.org/basic-auth/user/pass",{
                                        headers:{
                                            Authorization:"Basic "+Buffer.from("user:pass").toString("base64")
                                            //At the basic need to use the bactic operator or " "
                                            //After the Basic need to give 1 space else test will fail its a rule
                                            //In the above line Username=user and password=pass{("user:pass")}

                                        }
                                                                                     }
                                        );
    expect(basicresponse.ok).toBeTruthy();
    expect(basicresponse.status()).toBe(200);

})
//Bearer token
test("Bearer Authentication",async({request})=>{
    //Create token from the Github-->account settings-->Developer settings-->personal access tokens-->tokensclassic and generate token
    const bearertoken="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"
    const bearerresponse=await request.get("https://api.github.com/user/repos",{
                                        headers:{
                                            Authorization:`Bearer ${bearertoken}`
                                            //At the basic need to use the bactic operator only since we are giving the token
                                            //After the Bearer need to give 1 space else test will fail its a rule

                                        }
                                                                                     }
                                        );
    expect(bearerresponse.ok).toBeTruthy();
    expect(bearerresponse.status()).toBe(200);
   const  bearerresponsebody=await bearerresponse.json();
    console.log(bearerresponsebody);

})
//Api Key authentication
/*Api key will be sent through the Query aparameters
Expect Api key remaining all the tokens will be passed through the headers
*/
//Not working hence its not moved ahead
test("Apikey Authentication",async({request})=>{
    //Create token from the Github-->account settings-->Developer settings-->personal access tokens-->tokensclassic and generate token
    const Apikeyresponse=await request.get("https://api.github.com/user/repos",{
                                    params:{Apikey:"2e30ba5bb15a93fce4c8f34cf2f2736e"}
                                       
                                        }
                                                                                     
                                        );
    expect(Apikeyresponse.ok).toBeTruthy();
  //  expect(bearerresponse.status()).toBe(200);
   const  Apikeyresponsebody=await Apikeyresponse.json();
    console.log(Apikeyresponsebody);

})