import {test,expect} from "@playwright/test"

test("Verify Page Url",async({page})=>{
await page.goto("https://www.google.com/");
let url= await page.url();
console.log("url="+url);
await expect(page).toHaveURL(url)

})
