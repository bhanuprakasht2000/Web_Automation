import {test,expect,FrameLocator} from "@playwright/test"
test("The Iframes method 1",async({page})=>{
    await page.goto("https://demo.automationtesting.in/Frames.html");
   const frame1= await page.frame({url:"https://demo.automationtesting.in/SingleFrame.html"});
   if(frame1){
    await frame1.locator(".col-xs-6 input").fill("Bhanu Reddy");
        //or
        //await frame1.fill('[".col-xs-6 input"]',"Bhanu")

   }
   else 
    console.log("There is no frame available")
await page.waitForTimeout(5000);

})
test("The Iframes method 2",async({page})=>{
    await page.goto("https://demo.automationtesting.in/Frames.html");
  const frame1=  page.frameLocator('[name="SingleFrame"]')
   //or
    //  const frame1=  page.frameLocator('#singleframe')

   if(frame1){
    await frame1.locator(".col-xs-6 input").fill("Bhanuprakash  Reddy");
            

   }
   else 
    console.log("There is no frame available")
await page.waitForTimeout(5000);

})
//Handing the frames in the frame
test("Nested Frames",async({page})=>{
    await page.goto("https://www.dezlearn.com/nested-iframes-example/");
  const Parentframe=  page.frame({url:"https://www.dezlearn.com/wp-content/uploads/2021/03/nested-iframes.html"})

   if(Parentframe){
console.log("Frame is present");
  const childFrames =  Parentframe.childFrames();
  const childframeslength= childFrames.length;
  console.log("The number of child frames are ",childframeslength)
  await childFrames[0].locator("#u_5_6").click();
 const child1frame_text= await childFrames[0].locator("#processing").innerText();
 console.log(child1frame_text)
   


   }
   else 
    console.log("There is no frame available")
await page.waitForTimeout(5000);

})
