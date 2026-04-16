import {test,expect, Locator} from "@playwright/test"
//page.getByAltText
test("Alttext",async({page})=>{
    await page.goto("https://demo.nopcommerce.com/");
  const logo:Locator= page.getByAltText("Picture for category Appare");
  await expect(logo).toBeVisible();

})
//page.getByText
test("Text",async({page})=>{
await page.goto("https://demo.nopcommerce.com/");
const text:Locator=page.getByText("Welcome to our store");
await expect(text).toBeVisible();

})
//Page.getByRole
test("Role",async({page})=>{
await page.goto("https://demo.nopcommerce.com/");
await page.getByRole("link",{name:"Register"}).click();
 page.setDefaultNavigationTimeout(60000); 
await expect(page.getByRole('heading', { name: 'Register' })).toBeVisible();
})
//Page.getByLabel
test("Label",async({page})=>{
    await page.goto("https://demo.nopcommerce.com/register?returnUrl=%2F");
    await page.getByLabel("First name:").fill('Bhanu');
    await page.waitForTimeout(5000); // waits 5 seconds
})
//Page.getByPlaceholder
test("Placeholder",async({page})=>{
    await page.waitForTimeout(5000);
    await page.goto("https://demo.nopcommerce.com/");
    await page.getByPlaceholder("Search store").fill("Iphone");
    await page.waitForTimeout(5000);
})
//page.getByTitle
test("Title",async({page})=>{
    await page.goto("https://testautomationpractice.blogspot.com/p/playwrightpractice.html");
   const tit:Locator= page.getByTitle("Home page link");
   console.log(tit);
        await expect(tit).toHaveText("Home");
})
//page.getByTestId
test("Testid",async({page})=>{
    await page.goto("https://testautomationpractice.blogspot.com/p/playwrightpractice.html");
   const testid:Locator= page.getByTestId("profile-email");
   console.log(testid);
    page.setDefaultNavigationTimeout(5000)
        await expect(testid).toHaveText("john.doe@example.com");
})