import { test,expect } from '@playwright/test';
import { Loginpageclass } from '../Pages/Loginpagefile.ts';
import { Homepageclass } from '../Pages/Homepage.ts';
import { Cartpageclass } from '../Pages/Cartpage.ts';
test("loginpagetest",async({page})=>{
    test.slow();
    //Login page tests
   await page.goto("https://www.demoblaze.com/index.html")
   const lgpage= new Loginpageclass(page);
  await  lgpage.clickloginlink();
  await lgpage.Usernamefill("Abc143");
  await lgpage.Passwordfill("123");
  await lgpage.Loginbuttonclick();
   expect( await page.locator("//a[.='Log out']").textContent()).toBe("Log out");
   //Home page
 const hmpage= new Homepageclass(page);
 await hmpage.clickonprodlink();
 await hmpage.addtocartbtn_inthepage();
  expect(await page.locator("//a[.='Add to cart']").innerText()).toBe("Add to cart")
  //Cartpage 
  const ctpage=new Cartpageclass(page);
  await ctpage.addcartbtnclick();
  expect(await page.locator("(//td[text()='Samsung galaxy s6'])[1]").innerText()).toContain("s6");

})
