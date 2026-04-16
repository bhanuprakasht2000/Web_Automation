import {test,expect} from "@playwright/test"
test("Static date picker",async({page})=>{
await page.goto("https://testautomationpractice.blogspot.com/");
//Filling the dateby text inputing
const datepicker=page.locator("//input[@id='datepicker']");
await datepicker.fill("12/25/2026");
await page.waitForTimeout(4000);

})


test("By using the selection",async({page})=>{
await page.goto("https://testautomationpractice.blogspot.com/");
const datepicker=page.locator("//input[@id='datepicker']");
await datepicker.click();
const Yearlocator=page.locator(".ui-datepicker-year");
const Monthlocator=page.locator(".ui-datepicker-month")
const year="2030";
const month="July";
const date="16";

let futuredate=true;
while(futuredate){
    const nextbtn=page.locator('//a[@data-handler="next"]');

    if(await Monthlocator.innerText()===month && await Yearlocator.innerText()===year )
    {
        const Datelocatoallr= await page.locator(".ui-datepicker-calendar tbody tr td").all();
       for(let i of Datelocatoallr){
     //console.log(await i.innerText());
     if(await i.innerText()===date)
        {
        i.click();
     }
       }
    
       break;
    }
    else{
        await nextbtn.click();
    }
}
await page.waitForTimeout(5000);


})