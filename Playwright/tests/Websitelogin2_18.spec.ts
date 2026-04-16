import {chromium, expect, Page, test} from "@playwright/test"
const cred:string[][]=[['bhanubpr420@gmail.com','bhanu123@A','Valid'],
                       ['AA@gmail.com','rtyu@A','InValid'], 
                       ['ghj@gmail.com','345@A','InValid'],
                       ['','','nocred'] 

                    ]
                   
test.beforeEach('Starting of Webpage',async({page})=>{
    
   await  page.goto("https://demo.nopcommerce.com/")
   await page.locator(".ico-login").click();
   await page.waitForTimeout(1000);

})
for(let data of cred){


test.skip(`Action of login ${data[0]}and ${data[1]}`,async({page})=>{ 
const email_locator= page.locator(".email");
await email_locator.fill(data[0]);
const password_locator=page.locator('[name="Password"]')
await password_locator.fill(data[1]);
const login_button=page.locator("//div/button[@class='button-1 login-button']");
await login_button.click();
await page.waitForTimeout(1000);
if(data[2]==="Valid"){
    const validation:string=await page.locator("//a[.='Log out']").innerText()
 expect(validation).toContain("Log");
 console.log("The Login with the credentials is successful");
}
else if(data[2]==="InValid"){
     console.log("The Login with the credentials is not-successful");
      expect(await page.locator("//div[@class='message-error validation-summary-errors']").innerText()).toContain("Login was unsuccessful.");

}
else if(data[2]==="nocred"){
         console.log("The Login with the credentials are not entered");
         expect(await page.locator("#Email-error").innerText()).toContain("Please enter your email");

}
    
})
  }





 for(let [email,password,validity] of cred){


test(`Action of login with the ${email}and ${password}`,async({page})=>{ 
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
else if(validity==="InValid"){
     console.log("The Login with the credentials is not-successful");
      expect(await page.locator("//div[@class='message-error validation-summary-errors']").innerText()).toContain("Login was unsuccessful.");

}
else if(validity==="nocred"){
         console.log("The Login with the credentials are not entered");
         expect(await page.locator("//span[@id='Email-error']").innerText()).toContain("Please enter your email");

}
    
})
  }