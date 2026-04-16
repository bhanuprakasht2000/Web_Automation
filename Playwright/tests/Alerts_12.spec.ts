import{test,expect} from "@playwright/test"
test("Simple Alert",async({page})=>{
    await page.goto("https://testautomationpractice.blogspot.com/");
    page.on('dialog',(dialog)=>{
        console.log("The dialog box type is =",dialog.type());
        console.log("The dialog box message is =",dialog.message())
        dialog.accept();

    })
    await page.locator("#alertBtn").click();
    await page.waitForTimeout(3000);
})
test("Confirmation Alert",async({page})=>{
    await page.goto("https://testautomationpractice.blogspot.com/");
    page.on('dialog',(dialog)=>{
        console.log("The dialog box type is =",dialog.type());
        console.log("The dialog box message is =",dialog.message())
        dialog.accept();

    })
    await page.locator("#confirmBtn").click();
    const text=await page.locator("#demo").innerText();
    console.log("The text after clicking the confirmation btn = "+text);
    expect(text).toContain("OK!")
    await page.waitForTimeout(3000);
})
test("Prompt Alert",async({page})=>{
    await page.goto("https://testautomationpractice.blogspot.com/");
    page.on('dialog',(dialog)=>{
        console.log("The dialog box type is =",dialog.type());
        console.log("The dialog box message is =",dialog.message());
        console.log("The default value in the prompt box = "+dialog.defaultValue());
        dialog.accept("Bhanu");

    })
    await page.locator("#promptBtn").click();
    const text=await page.locator("#demo").innerText();
    console.log("The text after clicking the confirmation btn = "+text);
    expect(text).toContain("Bhanu");
    await page.waitForTimeout(3000);
})