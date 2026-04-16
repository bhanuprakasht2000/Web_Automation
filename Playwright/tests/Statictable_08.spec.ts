import  {test,expect,Locator} from "@playwright/test"
test("Stastic table", async ({ page }) => {
  await page.goto("https://testautomationpractice.blogspot.com/");
  const table = page.locator("table[name='BookTable'] tbody");
  //checking whether the table visible or not
  await expect(table).toBeVisible();
 //Count the number of the rows
 const rows= table.locator("tr");//7rows 
 const rowscount=await rows.count();
 //printing the row count
 console.log("The count of the rows:"+rowscount)
 expect(rows).toHaveCount(7);//1approach of assertion
  expect(rowscount).toBe(7);//2nd approach of assertion
  //Printing single row
  const secondrow=await rows.nth(2).innerText();
  console.log("The data of the second row: "+secondrow)
  //Printing all elements at a time
  console.log(await rows.allInnerTexts())
//Printing the rows 1 by 1
  const rowstexts=await rows.allInnerTexts();
  for(const k of rowstexts){
    console.log(k);
  }
    //Working with the columns
    const columns:Locator=rows.locator("td");
    const colunmscount=await columns.count();
    console.log(colunmscount);
    expect(colunmscount).toBe(24);//Assertion checking approach 1
   await expect(columns).toHaveCount(24);//Assertion checking approach 2
   //Printing allm column data of the row2
   const columnsofrow2=await rows.nth(2).locator("td").allInnerTexts();
   console.log("The columns data of the row2: "+columnsofrow2)
   //Printing all the columns text
   console.log(await columns.allInnerTexts())
   //Printing colum values 1 by 1
   const allcolumntext=await columns.allInnerTexts();
   for(const k in allcolumntext){
    console.log(allcolumntext[k])
   }

//Printing allcol  data of the table excluding header
   const Rowalldata=await rows.all();
console.log("============Printing the all table data excluding the header=======")
for(let x of Rowalldata.slice(1))//Used for removing the header
console.log(await x.allInnerTexts());
const cols=(await rows.locator("td").allInnerTexts());
console.log(cols.join("\t"));



//Print books names where the author is mukesh
console.log("======================================")
console.log("Books written by the author")
for(const x of Rowalldata){
    const cells:string[]=await x.locator("td").allInnerTexts();
    const author= cells[1];
    const book=cells[0];
    if(author==='Mukesh'){
        console.log("The author is "+author+" and "+"The book name is "+book);
        
}}

})
