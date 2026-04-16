import {test,expect} from "@playwright/test"
import fs from 'fs'
/*Pre-requisites:
data:json file
create a token
1>create a booking(post)---->booking id
2>Update booking(put)//required the token
3>Delete booking(delete)//required token
*/
test("Put with the token",async({request})=>{
    //Creating the post request by using the external json file
const jsonpathforrequest="./tests/testdata/testjsondata.json";
const requestbody=JSON.parse(fs.readFileSync(jsonpathforrequest,'utf-8'));
const response=await request.post('/booking',{data:requestbody});
const responsebody=await response.json();
console.log("=====The data after posting====")

console.log(responsebody);
//Reading the data through the Get method
const bookid=1;
const getdata=await request.get(`/booking/${bookid}`);
const getdatabodyjson=await getdata.json();
console.log("======Getting data=====")
console.log(getdatabodyjson)



//Generating the token
console.log("=====Generating the Token======");
const jsonpathfortoken="./tests/testdata/Authtoken.json";
const Authtokenrequestbody=JSON.parse(fs.readFileSync(jsonpathfortoken,'utf-8'));
const Authtokenresponse=await request.post('/auth',{data:Authtokenrequestbody});
const Authtokenresponsebody=await Authtokenresponse.json();
console.log(Authtokenresponsebody);
//getting the booking id
const bookingid=responsebody.bookingid;
console.log("The booking id===>"+bookingid);
//getting the token
const token=Authtokenresponsebody.token;
console.log("The token===>"+token);



//Working with the put data
const updatedatajsonpath="./tests/testdata/updatejsondataput.json";
const updatedatarequestbody=JSON.parse(fs.readFileSync(updatedatajsonpath,'utf-8'));
//Sending the id and the token for updating the data
const updatedresponse=await request.put(`/booking/${bookingid}`,{headers:{cookie:`token=${token}`},
                                                           data:updatedatarequestbody})
const updatedresponsejsonbody=await updatedresponse.json();
console.log("========The Updated data through put ======")
console.log(updatedresponsejsonbody)

//Working with the Patch data
const patchdatajsonpath="./tests/testdata/patchjsondata.json";
const patchdatarequestbody=JSON.parse(fs.readFileSync(patchdatajsonpath,'utf-8'));
//Sending the id and the token for updating the data
const patchresponse=await request.patch(`/booking/${bookingid}`,{headers:{cookie:`token=${token}`},
                                                           data:patchdatarequestbody})
const patchresponsejsonbody=await patchresponse.json();
console.log("========The Updated data througfh patch======")
console.log(patchresponsejsonbody)



//Delete operation
const daletedresponse=await request.delete(`/booking/${bookingid}`,{headers:{cookie:`token=${token}`}});
console.log("The Id data has been deleted")
expect(daletedresponse.statusText()).toBe("Created")//StatusText() is used for  the comparing the Text generated as response
expect(daletedresponse.status()).toBe(201)

})