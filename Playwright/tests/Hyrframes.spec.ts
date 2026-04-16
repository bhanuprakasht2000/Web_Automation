import{test,expect, chromium} from "@playwright/test";
test("Dropdown by Gmail" , async ({page})=>
{
   
    await page.goto("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&dsh=S623689725%3A1773244634913538&ifkv=ASfE1-rXlY3_AQxnK_nAWW6tadELhE8TRLOwPKVPT2sBKQXKYQ42mLWs6C5HSR-tPWY9Gu_7xo08BA&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
   const language=page.locator('//div[@class="VfPpkd-aPP78e"]')
   await language.click();
   await page.waitForTimeout(2000);
   await page.waitForSelector('//div[@class="VfPpkd-aPP78e"]/following::ul/li')
        const gmail =page.locator('//span[@class="VfPpkd-BFbNVe-bF1uUb NZp2ef"]/following::ul/li[@class="MCs1Pd HiC7Nc VfPpkd-OkbHre VfPpkd-aJasdd-RWgCYc-wQNmvb VfPpkd-rymPhb-ibnC6b VfPpkd-rymPhb-ibnC6b-OWXEXe-SfQLQb-Woal0c-RWgCYc"]');
    const count=await gmail.count();
    console.log("Total languages:",count);
   for(let i=0; i<count; i++)
    {
       let  text=await gmail.nth(i).textContent(); 
        console.log(text?.trim());
    
    }
     for(let i=0; i<count; i++)
    { let text=await gmail.nth(i).innerText();
        if(text?.trim()==="తెలుగు")
        { 
            await gmail.nth(i).click();
            return;
        }
    }
    
});
test("Dropdown by Facebook" , async ({page})=>
{
    await page.goto("https://www.facebook.com/login.php/");
    await page.locator('//a[contains(text(),"More languages…")]').click();
    await page.waitForSelector('//div[@class="x1l6x9ta x1e2s88x xh8yej3 x1lyhvkc x1twisyj"]/div/span/span/div')
    const fb= page.locator('//div[@class="x1l6x9ta x1e2s88x xh8yej3 x1lyhvkc x1twisyj"]/div/span/span/div');
    const count=await fb.count();
    console.log("Total Languages:",count);
    console.log("The languages are as follows: ");
    
    for(let i=0; i<count; i++)
    {
       let  text=await fb.nth(i).textContent(); 
        console.log(text?.trim());
    
    }
     for(let i=0; i<count; i++)
    { let text=await fb.nth(i).textContent();
        if(text?.trim()==="తెలుగు")
        { 
            await fb.nth(i).click();
            return;
        }
    }
    
});
test("Hyr Frames",async({page})=>{
    
    await page.goto("https://www.hyrtutorials.com/p/frames-practice.html");
    //Chaining to the frame3 and into the inside frame2
    await page.frameLocator('#frm3').frameLocator('#frm2').locator("#firstName").fill("Bhanuprakash Reddy ")
     await page.frameLocator('#frm3').frameLocator('#frm2').locator("#lastName").fill("Thummalapeta")
    await page.waitForTimeout(6000)
     //Entering in the second frame directly
    await page.frameLocator("#frm2").locator("#firstName").fill("Bhanu Reddy");
    await page.frameLocator("#frm2").locator("#lastName").fill("T");
    await page.waitForTimeout(5000)
   

})