import  {test,expect,Locator} from "@playwright/test"
test("Alltext&innertext",async({page})=>{
  await  page.goto("https://demowebshop.tricentis.com/");
  //All Text & All Inner Text
const products:Locator=page.locator(".product-title");//6
//Single element innertext
const productnameinner:string=await products.nth(4).innerText();//Returns plain text only elimintes the white spaces and hidden elements
console.log("The innertext of the single element:",productnameinner)
//Single element textcontent
const productnametext:string|null=await products.nth(4).textContent();//Returns plain text with  the white spaces and hidden elements
console.log("The innertext of the single element:",productnametext)
})