import {test,expect, Locator} from "@playwright/test"
test("Xpath Axes",async({page})=>{
await page.goto("https://www.w3schools.com/html/html_tables.asp");
//self
const self:Locator=page.locator("//td[text()='Germany']/self::td");
console.log("self content of Germany: "+await self.textContent());
await expect(self).toHaveText("Germany");
//parent
const parent:Locator=page.locator("//td[text()='Germany']/parent::tr");
console.log("The parent row has elemnets of the Germany are :"+await parent.textContent());
const parentcount:number=await parent.count();
  expect(parentcount).toBeGreaterThan(0);
//child
const child:Locator=page.locator("//tr/child::td[.='Germany']");
console.log("The parent row to germany child  :"+await child.textContent());
const childcount:number=await child.count();
  expect(childcount).toBeGreaterThan(0);
  //Ancestor
  const anc:Locator=page.locator("//td[text()='Germany']/ancestor::tr");
console.log("The ancestor xpath executed");
const anccount:number=await anc.count();
  expect(anccount).toBeGreaterThan(0);
//Descendant
  const dec:Locator=page.locator("//tbody/descendant::td");
console.log("The Descendent xpath executed");
const deccount:number=await dec.count();
  expect(deccount).toBeGreaterThan(0);
  //Following
  const fol:Locator=page.locator("//td[text()='Germany']/following::td[1]");
console.log("following  of Germany: "+await fol.textContent());
await expect(fol).toHaveText("Centro comercial Moctezuma");
 //Following-sibling
  const fol_sib:Locator=page.locator("//td[text()='Maria Anders']/following-sibling::td");
console.log("following-sibling  of Maria Anders: "+await fol_sib.textContent());
const folcount=fol_sib.count();
await expect(fol_sib).toHaveText("Germany");
  //preceding
  const pre:Locator=page.locator("//td[text()='Germany']/preceding::td[1]");
console.log("preceding  of Germany: "+await pre.textContent());
await expect(pre).toHaveText("Maria Anders");
 //preceding-sibling
  const pre_sib:Locator=page.locator("//td[text()='Germany']/preceding-sibling::td[1]");
console.log("preceding-sibling   of Germany: "+await pre_sib.textContent());
await expect(pre_sib).toHaveText("Maria Anders");
})