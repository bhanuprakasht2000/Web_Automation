import {test,expect} from "@playwright/test"
test("Mouse actions",async({page})=>{
    //Hover the mouse
await page.goto("https://testautomationpractice.blogspot.com/");
//await page.locator("//button[text()='Point Me']").hover();
//await page.waitForTimeout(4000);
//right click
//await page.locator("#end-date+.submit-btn").click({button:"right"});
//await page.waitForTimeout(4000);
//Double click
//await page.locator("#end-date+.submit-btn").dblclick();
//await page.waitForTimeout(4000);
//Drag and drop
//await page.locator("//p[.='Drag me to my target']").dragTo(page.locator('//p[.="Drop here"]'));
//await page.waitForTimeout(4000);
await page.mouse.move(150, 300);
await page.waitForTimeout(4000);


})
test("Down and up",async({page})=>{
await page.goto("https://www.awwwards.com/websites/fullscreen/");
//Page downing
//await page.mouse.down();//press the mouse to stop at perticular point
//await page.waitForTimeout(4000)
//await page.mouse.up();//press the mouse to stop at perticular point
//await page.waitForTimeout(4000)
//await page.mouse.move(500, 700);
//await page.waitForTimeout(4000)
await page.evaluate(() => {
    window.scrollTo(0, 2000);
  });
await page.waitForTimeout(4000)



})