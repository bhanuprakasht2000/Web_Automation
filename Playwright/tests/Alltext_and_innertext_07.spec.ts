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


const Allproductsinnertext=await products.allInnerTexts();
console.log("All products innertext",Allproductsinnertext);
const allproductstextcontents=await products.allTextContents();
console.log("All products textcontents",allproductstextcontents);
//for printing the all inner text elements 1 by 1
console.log("***************All the innertext of elements******************")
for(const k of Allproductsinnertext)
  console.log(k);
console.log("***************All the textcontents of elements******************")

for(const k of allproductstextcontents)
  console.log(k);
console.log("***************All the textcontents of elements after removing the spaces and breaks******************")
for(const k of allproductstextcontents)
  console.log(k?.trim());//Since the textcontents returns null as well hence we use ? before trim method

})






test("All()",async({page})=>{
 await  page.goto("https://demowebshop.tricentis.com/");
const products:Locator=page.locator(".product-title");//6
const allproducts:Locator[]=await products.all();
//printing a single element
 console.log(await products.nth(3));
 console.log("======================")
 //Printing all elements
 for(const k of allproducts){
  console.log(k);
 }
 //printing the inner texts of all elements
  console.log("**********************The inner text in all()*****************************");
 for(const k in allproducts)
  console.log(await allproducts[k].innerText())
 //printing the content texts of all elements
 console.log("********************************The text contents in all()*******************");
 for(const l in allproducts)
  console.log(await allproducts[l].textContent());
 //Assertion checking
const allproductcount=allproducts.length;
 expect(allproductcount).toBe(6);

})