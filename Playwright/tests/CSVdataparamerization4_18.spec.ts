import {test,expect} from "@playwright/test"
import fs from "fs";
import { parse } from 'csv-parse/sync';
const csvpath="tests/testdata/Credentials.csv";
const filecontent=fs.readFileSync(csvpath,'utf-8');
const records: any[] = parse(filecontent, {
  columns: true,
  skip_empty_lines: true,
});


//Hook
test.beforeEach('Starting of Webpage',async({page})=>{
    
   await  page.goto("https://demo.nopcommerce.com/")
   await page.locator(".ico-login").click();
   await page.waitForTimeout(1000);

})

 for(const data of records){
  test(`Login with ${data.email} and ${data.password}`, async ({ page }) => {
    
    const email_locator= page.locator(".email");
await email_locator.fill(data.email);
const password_locator=page.locator('[name="Password"]')
await password_locator.fill(data.password);
const login_button=page.locator("//div/button[@class='button-1 login-button']");
await login_button.click();
await page.waitForTimeout(1000);
if(data.validity==="Valid"){
    const validation:string=await page.locator("//a[.='Log out']").innerText()
 expect(validation).toContain("Log");
 console.log("The Login with the credentials is successful");
}
else if(data.validity==="InValid"){
     console.log("The Login with the credentials is not-successful");
      expect(await page.locator("//div[@class='message-error validation-summary-errors']").innerText()).toContain("Login was unsuccessful.");

}
else if(data.validity==="Nocred"){
         console.log("The Login with the credentials are not entered");
         expect(await page.locator("//span[@id='Email-error']").innerText()).toContain("Please enter your email");

}
    
})
  }
