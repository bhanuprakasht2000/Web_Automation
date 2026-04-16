import {test,expect} from "@playwright/test"
test("dynamic locator in website",async ({page})=>{
    await page.goto("https://www.flipkart.com/account/login?ret=https%3A%2F%2Fwww.flipkart.com%2Ffpg%2Fcbc%2Fsbi%2Fstore-page%3Futm_source%3DGSN_OTA%26utm_context%3DSEM%26cmpid%3Dcontext_23394340014_gmc_pla%26entryMethod%3D23394340014%26gad_source%3D1%26gad_campaignid%3D23394340014%26gbraid%3D0AAAAADxRY5_cb-aBwMSMErbQan4zlKQqz%26gclid%3DCjwKCAiA-sXMBhAOEiwAGGw6LHXAQLotXwYz7lhHoONd0RyIp7okigvdhKMDNE2KcFBo4jOxPnXv1RoC0xEQAvD_BwE");
    const searchlocator= await page.locator("//input[@placeholder='Search for products, brands and more']").fill("iphone");
    //After entering the name need to wait for sometime to get the searched data from the server
    await page.waitForTimeout(3000);
    const dynamic_elements=page.locator("ul>li.humcQA");
    let dynamic_elementstexts= await dynamic_elements.allTextContents();
    let dynamic_elements_single_text=dynamic_elementstexts.map(t=>t.trim())
    console.log("The elements are: ");
    console.log(dynamic_elements_single_text)
    const count=dynamic_elements_single_text.length;
        console.log("The size of the elements: "+count);
//Clicking the option based on the index
   /* for(let i=0;i<count;i++){
        if(i==3){
            await dynamic_elements.nth(2).click();
            await page.waitForTimeout(5000);
            break;
        }
     }*/
     for(let i=0;i<count;i++){
       let text=await dynamic_elements.nth(i).innerText();
        if(text==='iphone 17 pro')
        {
            dynamic_elements.nth(i).click();
            await page.waitForTimeout(3000);
            break;
        }
     }
   
})
test("Dymanic dropdown",async({page})=>{
    await page.goto("https://aws.amazon.com/quick/flows/?trk=a1d4fbf5-e127-441d-9900-ec084e238fb6&sc_channel=ps&gad_campaignid=23523526761&gbraid=0AAAAADjHtp_C4mV5foQVSkYk7TB4MrPrG&gclid=CjwKCAiAncvMBhBEEiwA9GU_fpH7RTRAgqqG7PcJEau7J2hpVC3bdXxEon4qcUvuN1xFbxBazGwfwxoCrI8QAvD_BwE");
    const dropdown_btn=page.locator("//li[@aria-label='Capabilities submenu']//span[@class='rgsn_19d4a58a rgsn_a1b66739 rgsn_3ed66ff4 rgsn_bc1a8743']//*[name()='svg']")
    //After clicking need to check the count options
        await dropdown_btn.click();
        await page.waitForTimeout(4000);
        const Dropdownopt=page.locator("//ul[@class='rgsn_3da1576c rgsn_1035c2c9']/li[starts-with(.,'Qui')]");
    const dropdown_alltexts=await Dropdownopt.allTextContents();
    const dropdown_sinle_text= dropdown_alltexts.map(t=>t.trim());
    console.log(dropdown_alltexts)
    const count=dropdown_sinle_text.length;
    console.log("The Options count is: "+count)
    for(let i=0;i<count;i++){
      console.log(await Dropdownopt.nth(i).textContent());
      const text=await Dropdownopt.nth(i).textContent();
      if(text==='Quick Sight'){
       await Dropdownopt.nth(i).click();
       await page.waitForTimeout(6000)
       break;
      }
    }

})