import {test} from "@playwright/test"
test("mak",async({page})=>{
   // test.slow();
    await page.goto("https://www.makemytrip.com/flights/");
    //Cancelling the 2 popups
    await page.locator("span[class*='commonModal__close']").click();
    await page.locator("(//div[@class='tp-dt-header-icon'])[2]").click();

      //Identifying the fromcity locator
           await page.locator("input#fromCity").click();
      //Dropdown elements from city
      await page.waitForSelector("div#react-autowhatever-1")
    const alldropdownbtns_from=await page.locator("div#react-autowhatever-1 div").all();
   
    for(const a of alldropdownbtns_from){
        if(await a.innerText()==='Bengaluru, India'){
            await a.click();
            break;
        }
    }

        //Identifying the tocity locator
    await page.locator("input#toCity").click();
    //Dropdown elements to city
    await page.waitForSelector("div.revampedPopularList")
    const alldropdownbtns_to=await page.locator("div.revampedPopularList div").all();
    for(const a of alldropdownbtns_to){
        if(await a.innerText()==="Kolkata, India"){
            await a.click();
            break;
        }
    }
    //Date selection
    await page.locator("(//div[@class='dateInnerCell']/p[text()='18'])[1]").click();
    //Click on search button
    await page.locator("p a[class*='font24 ']").click();
    await page.waitForURL("https://www.makemytrip.com/flight/search?itinerary=BLR-CCU-18/04/2026&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&lang=eng")
    await page.waitForTimeout(5000)
    
}
    )