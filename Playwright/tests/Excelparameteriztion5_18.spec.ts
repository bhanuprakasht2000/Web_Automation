import {test,expect} from "@playwright/test"
import fs from "fs";
import * as XlSX from 'xlsx';
//Load the excel file
//File-->workbook-->sheets-->rows&columns
const Excelpath="tests/testdata/Exceldata.xlsx"
const workbook=XlSX.readFile(Excelpath);
const sheetname=workbook.SheetNames[0];
const worksheet=workbook.Sheets[sheetname];
//Converting sheet to json
const Logindata:any=XlSX.utils.sheet_to_json(worksheet);

//Hook
test.beforeEach('Starting of Webpage',async({page})=>{
    
   await  page.goto("https://demo.nopcommerce.com/")
   await page.locator(".ico-login").click();
   await page.waitForTimeout(1000);

})


 for(let {email,password,validity} of Logindata){
test(`Action of login with the ${email} and ${password}`,async({page})=>{ 
const email_locator= page.locator(".email");
await email_locator.fill(email);
const password_locator=page.locator('[name="Password"]')
await password_locator.fill(password);
const login_button=page.locator("//div/button[@class='button-1 login-button']");
await login_button.click();
await page.waitForTimeout(1000);
if(validity==="Valid"){
    const validation:string=await page.locator("//a[.='Log out']").innerText()
 expect(validation).toContain("Log");
 console.log("The Login with the credentials is successful");
}
else if(validity=="InValid"){
     console.log("The Login with the credentials is not-successful");
      expect(await page.locator("//div[@class='message-error validation-summary-errors']").innerText()).toContain("Login was unsuccessful.");

}
else if(validity==="Nocred"){
         console.log("The Login with the credentials are not entered");
         expect(await page.locator("//span[@id='Email-error']").innerText()).toContain("Please enter your email");

}
    
})
  }