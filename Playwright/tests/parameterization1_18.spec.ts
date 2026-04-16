import {test,expect, chromium} from "@playwright/test"

    const items=['Nokia','Samsung','REDMI','wertyu','serdtfgyuhgyftdrsedtfgyuytf6r'];

           for(const it of items)
    {
        test(`Checking the availability of ${it}`,async()=>{
    const browser=await chromium.launch();
    const context=await browser.newContext( { viewport: { width: 1920, height: 1080 } });

    const page= await context.newPage();
     await page.goto("https://www.flipkart.com/mobile-phones-store");
  const search_text=page.locator("(//input[@class='nw1UBF v1zwn25' and @name='q'])[1]");
   await search_text.fill(it);
   console.log("The entered text for searching is: "+await search_text.inputValue());
    const search_button=page.locator("(//button[@class='XFwMiH' and @aria-label])[1]");
    await search_button.click();
   await page.waitForTimeout(3000);
   const nokia_valid=await page.locator("(//div[@class='RG5Slk'])[1]").innerText();
   expect(nokia_valid).toContain(it)
        
    })
      }


  