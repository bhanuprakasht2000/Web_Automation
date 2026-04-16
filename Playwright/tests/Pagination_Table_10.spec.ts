import{test,expect} from "@playwright/test"
import { log } from "node:console";
test("Pagination table all rows printing",async({page})=>{
    await page.goto("https://datatables.net/examples/basic_init/zero_configuration.html");
    //Let print data from the all pages-->1page at 1 time
    console.log("==================Printing all rows from all pages==================")

    let hasmorepages=true;
    while(hasmorepages)
{
   const rows=await page.locator("#example tbody tr").all();
    for(let row of rows){
        const rowtext=await row.innerText();
        console.log(rowtext)
    }
   const nextbtn= page.locator("//button[@aria-label='Next']");
   if(await nextbtn.isEnabled()){
    await nextbtn.click();
   }
   else{
    hasmorepages=false;
   }
}
await page.waitForTimeout(4000);




})

test("Pagination table selected rows printing",async({page})=>{
    await page.goto("https://datatables.net/examples/basic_init/zero_configuration.html");
    console.log("==================Selected rows printing==================")
//Selecting the length as fixed
const dropdownlocator=page.locator("#dt-length-0");
await dropdownlocator.click();
await dropdownlocator.selectOption({value:'25'});//selecting the 25rows
await page.waitForTimeout(5000);
const table_rows_afterselectionlocator=page.locator("#example tbody tr");
const table_rows_afterselectionlocator_count=await table_rows_afterselectionlocator.count();
console.log("The number of rows in the table are "+table_rows_afterselectionlocator_count)
const table_rows_array= await table_rows_afterselectionlocator.allInnerTexts();
console.log("====================================")
for(const k of table_rows_array)
{
    console.log(k)
}}
)


test("Search option existing records",async({page})=>{
    console.log("Finding the searched records with in the rows")
    await page.goto("https://datatables.net/examples/basic_init/zero_configuration.html");
  const searchBox = page.getByRole('searchbox', { name: 'Search:' });
  await searchBox.fill('667891')
    await page.waitForTimeout(2000);
    const tablerows_aftersearch=page.locator("#example tbody tr");
    const rowscount=await tablerows_aftersearch.count();
    console.log(rowscount);
    console.log("++++++++++++++++++++++++");

    if(rowscount>0){
    const tablerows_alltexts=await tablerows_aftersearch.allInnerTexts();
    for(const k of tablerows_alltexts)
        {
        console.log(k);
    }
    }
    else{
        console.log("No records found");
    }


})

