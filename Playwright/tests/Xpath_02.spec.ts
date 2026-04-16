import {test,expect, Locator} from "@playwright/test"
//absolute xpath
test("xpath demo abs",async({page})=>{
    await page.goto("https://demowebshop.tricentis.com/");
    const abs:Locator=page.locator('//html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/a[1]/img[1]');
   await expect(abs).toBeVisible();
})
//relative xpath
test("xpath demo rel",async({page})=>{
    await page.goto("https://demowebshop.tricentis.com/");
    const rel:Locator=page.locator("xpath=//img[@alt='Tricentis Demo Web Shop']");
    await expect(rel).toBeVisible();

})
//contains function 
test("xpath contains",async({page})=>{
    await page.goto("https://demowebshop.tricentis.com/");
    const contains:Locator=page.locator("//img[contains(@alt,'Tricentis Demo')]");
    await expect(contains).toBeVisible();

})
//starts-with function 
test("xpath starts",async({page})=>{
    await page.goto("https://demowebshop.tricentis.com/");
    const starts:Locator=page.locator("//img[starts-with(@alt,'Tricentis Demo')]");
    await expect(starts).toBeVisible();

})
//last() function 
test("xpath last",async({page})=>{
    await page.goto("https://demowebshop.tricentis.com/");
    const last:Locator=page.locator("//ul[@class='top-menu']/li[last()]");
    await expect(last).toBeVisible();

})
//position() function 
test("xpath position",async({page})=>{
    await page.goto("https://demowebshop.tricentis.com/");
    const pos:Locator=page.locator("//ul[@class='top-menu']/li[position()=4]");
    await expect(pos).toBeVisible();

})
//Dynamic webelement
test("xpath dynamic",async({page})=>{
    await page.goto("https://testautomationpractice.blogspot.com/p/playwrightpractice.html");
    const dn:Locator=page.locator("//button[@name='start' or @name='stop']");
    for(let i=1;i<=3;i++){
    await dn.click();
    await page.waitForTimeout(2000);
    }
    await expect(dn).toBeVisible();

})

