import {test,expect} from "@playwright/test"
test("Screenshots",async({page})=>{
    await page.goto("https://demowebshop.tricentis.com/");
    const timestamp=Date.now();
    //Visible page
    //Time stamp is used for avoiding the ovveridding concept
   // await page.screenshot({path:'Screenshots/'+"normal_page"+timestamp+'.png'});
    //Full page
   // await page.screenshot({path:'Screenshots/'+'Full_page'+timestamp+'.png',fullPage:true});
    //Element level screenshot
    const logo_locator=page.locator("img[alt='Tricentis Demo Web Shop11']");
await expect(logo_locator).toBeVisible();

})