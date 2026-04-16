import {test,expect} from "@playwright/test"

test(" Verify Page",async({page})=>{
await page.goto("https://www.google.com/");
let title= await page.title();
console.log("title="+title);
await expect(page).toHaveTitle("Google")

})
