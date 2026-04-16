import {test,expect, chromium} from "@playwright/test"
test("browerContext",async()=>{
    const browser=await chromium.launch();
    const context= await browser.newContext();
    const Mainpage= await context.newPage();
    await Mainpage.goto("https://testautomationpractice.blogspot.com/")
  /*  const page2= await context.newPage();
    await page2.goto("https://www.5movierulz.degree/movies/page/4")
    await page2.waitForTimeout(5000);
*/
await Mainpage.waitForLoadState();
const newtablocator=Mainpage.locator("//button[.='New Tab']");

await Promise.all([
  context.waitForEvent('page'),//pages will be opened in the context 
  newtablocator.click()
]);
const allpages= context.pages();
console.log("The number of the pages are "+allpages.length);
//Method1
console.log("The title of the pages in method 1")
for( const k of allpages){
  console.log(await k.title());
}
//Method2
const page1= allpages[0];
const page2= allpages[1];
const page1_title=await page1.title();
const page2_title=await page2.title();


console.log("The title of the pages in method 2")
console.log(page1_title);
console.log(page2_title)
expect(page2_title).toContain("SD");

})
test("Popup pages",async()=>{
  const browser=await chromium.launch();
  const context=await browser.newContext();
  const Parentpage=await context.newPage();
    await Parentpage.goto("https://testautomationpractice.blogspot.com/")
  const Parentpage_locator=Parentpage.locator("#PopUp")
  await Promise.all([Parentpage.waitForEvent('popup'), Parentpage_locator.click()])//Popups will be opened in the page
    await Parentpage.waitForTimeout(6000);
  const allpopups=context.pages();
  console.log("The number of the pop- up pages are "+allpopups.length)
  //Printing the urls in the method1
 const popup1_page_url=  allpopups[0].url();
  const popup2_page_url=  allpopups[1].url();
    const popup3_page_url=  allpopups[2].url();
console.log("The webpages Urls are in method1 ")
console.log("1st Url : "+popup1_page_url );
console.log("2nd Url : "+popup2_page_url );
console.log("3rd Url : "+popup3_page_url );
  //Printing the urls in the method2
console.log("The Urls in the method2:")
for(const k of allpopups){
  console.log("The Url==>"+ k.url()+"and the title==> "+await k.title());
  if((await k.title()).includes("Playwright")){
    await k.locator(".getStarted_Sjon").click();
  }
}


 await Parentpage.waitForTimeout(5000);
})