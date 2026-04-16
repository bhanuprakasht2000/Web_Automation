import {test,expect} from "@playwright/test"
test("autowaiting",async({context})=>{
    test.setTimeout(60000)//default time for the testcase is 30sec and I am making it as 60 sec
    const page=await context.newPage();
    await page.goto("https://testautomationpractice.blogspot.com/");
    const mouselocator=page.locator("//div[@class='widget HTML']/h2[@class='title' and text()='Mouse Hover']");
    await expect.soft(mouselocator).toContainText("M",{timeout:10000});//Default time for the expect is 5 sec and i am making it as 10sec
    const  header=page.locator(".titlewrapper .title");
    await expect(header).toContainText("Auto");

})