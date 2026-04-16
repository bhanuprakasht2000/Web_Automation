import {test,expect} from "@playwright/test"
//Text input
test("inputfield",async({page})=>{

await page.goto("https://testautomationpractice.blogspot.com/");

const text=page.locator("#name");
await expect(text).toBeVisible();
await expect(text).toBeEnabled();

const inputvalue=await text.fill("Anu");//for filling the input field
const enterdvalue=await text.inputValue();//for getting the input value(wt we wrote==>Anu)
await page.waitForTimeout(3000);
console.log("The input value in the name :"+enterdvalue);
  expect(enterdvalue).toBe("Anu");
})


//Radio Button
test("radio",async({page})=>{
    await page.goto("https://testautomationpractice.blogspot.com/");
  const malebtn = page.locator("#male");
  await expect(malebtn).toBeVisible();
  await expect(malebtn).toBeEnabled();
  expect( await malebtn.isChecked()).toBe(false);//ensure that the male btn is not checked previously

 await malebtn.check();

  expect( await malebtn.isChecked()).toBe(true);
 await page.waitForTimeout(3000);
})



//specific Checkbox
test("checkbox",async({page})=>{
    await page.goto("https://testautomationpractice.blogspot.com/");
  const sundaycheck = page.getByLabel("Sunday");
  await expect(sundaycheck).toBeVisible();
  await expect(sundaycheck).toBeEnabled();
  expect( await sundaycheck.isChecked()).toBe(false);//ensure that the sunday check btn is not checked previously

 await sundaycheck.check();

  expect( await sundaycheck.isChecked()).toBe(true);
 await page.waitForTimeout(3000);
})
//All checkbox
test("allcheckbox",async({page})=>{
    await page.goto("https://testautomationpractice.blogspot.com/");
    //Checking all check boxes
  const allchecklabels:string[] =['Sunday','Monday','Tuesday','Wednesday','Thursday','Friday','Saturday'];
  const allcheck= allchecklabels.map(index=>page.getByLabel(index));
expect(allcheck.length).toBe(7);
for(const c of allcheck){
await c.check();
await expect(c).toBeChecked();
}
await page.waitForTimeout(3000);
//Unchecking the last 3 check boxes
for(const s of allcheck.slice(-3)){
await s.uncheck();
await expect(s).not.toBeChecked();
}
await page.waitForTimeout(3000);
//Togging the checkbox:checked-->Unchecked and Unchecked-->checked
for(const t of allcheck)
    if(await t.isChecked()){
        await t.uncheck();
        await expect(t).not.toBeChecked();
    }
    else{
       await t.check();
       await expect(t).toBeChecked();
    }
    await page.waitForTimeout(3000);
//Randomly checking the checkboxes
const indexes:number[]=[1,3,6];
for(const i of indexes)
{
    await allcheck[i].check();
    await expect(allcheck[i]).toBeChecked();

}
    await page.waitForTimeout(3000);
    //Named checkbox only

    const labelname:string='Sunday';
    for(const k of allchecklabels)//here  we need to take the array of weekdays
        {
    if(k.toLowerCase()===labelname.toLowerCase()){
        const chb=page.getByLabel(labelname);
        await chb.check();
       await  expect(chb).toBeChecked();
    }}
await page.waitForTimeout(4000);

})