import{test,expect, Locator} from "@playwright/test"
test("Dynamic table",async({page})=>{
    await page.goto("https://practice.expandtesting.com/dynamic-table")
    //Identifying the table
    const table_body=page.locator("table[class='table table-striped'] tbody")
    //Identifying the row locator
    const table_rows=table_body.locator("tr");
    const rowscount=await table_rows.count();
    //Assertion checking the rows count
    expect(rowscount).toBe(4);
    await expect(table_rows).toHaveCount(4);
    //Printing all tne texts of the rows and printing 1 by 1
    const rowsalltext=await table_rows.allInnerTexts();
    console.log("==========================All rows at a time==============================");
    console.log(rowsalltext);
    console.log("==========================All rows 1 by 1==============================");

    for(const k of rowsalltext)
        {
            console.log(k);
    }
    const table_column=table_rows.locator("td");
    //Printing all the Columns data at a time
        console.log("==========================All columns at a time==============================");
    const columnalltext=await table_column.allInnerTexts();
    console.log(columnalltext);
    //Printing all the Columns data at 1 by one
        console.log("==========================All columns by 1 by 1==============================");
        for(const k of columnalltext)
        {
            console.log(k);
        }
        //Checking the column data whether it has the data of chrome
        let cpuload='';
        const allrows:Locator[]=await table_rows.all();
         for(const row of allrows){
            //getting the chrome location //getting the first row 
            //getting the first colum data nth(0)
            const processname=await row.locator("td").nth(0).innerText();
            console.log(processname);
            if(processname==='Chrome'){
                 cpuload=await row.locator("td:has-text('%')").innerText();//css selector
                 //or
               // cpuload=await row.locator("td",{hasText:'%'}).innerText();//xpath selector
               console.log("Cpuload of the chrome "+cpuload);
               break;
            }

         }
         let yellowcpupercentage=await page.locator("#chrome-cpu").innerText();
            console.log("The yellow box value is"+yellowcpupercentage)
            if(( yellowcpupercentage).includes(cpuload)){
                console.log("The CPU load is present in the CPU Load in the yellobox")
            }
            else
            {
                console.log("The CPU load is not present  yellowbox")
            }
})
     test.only("Demo",async({page})=>{
        await page.goto("https://testautomationpractice.blogspot.com/p/download-files_25.html");
        const table_body= page.locator("#taskTable");
        console.log("=================printing all table body=================");
        console.log(await table_body.innerText());
        //Row identification
        const table_rows=table_body.locator("tr");
        //rows count
        const rowscount=await table_rows.count();
        console.log("The rows count is "+rowscount)
        //printing all the rows
        const rowstexts=await table_rows.allInnerTexts();
         console.log("=================printing all table rows at a time=================");
        console.log("The rows texts of all rows are "+ rowstexts);
         console.log("=================printing all table rows 1 by 1 =================");
        for(const k of rowstexts)
        {
            console.log(k);
        }
        //column texts
        const table_column=table_rows.locator("td");
        const columstexts=await table_column.allInnerTexts();
        //printing all columns data
        console.log("=================printing all table columns at a time=================");
        console.log("The all columns data  is "+columstexts)
        //Printing 1 by 1 
        console.log("=================printing all table columns 1 by 1 =================");
        for(const k of columstexts){
            console.log(k)
        }
        console.log("=========================")

//Finding the the chrome
  let cpuload ;

  for (let i = 0; i < await table_rows.count(); i++)
     {
    const row = table_rows.nth(i);
   // console.log(await row.innerText())
    const processnames= await row.locator("td").allInnerTexts();
    //console.log(processnames)
    for(const pname of processnames)
      {
   if (pname === 'Chrome') 
    {
      cpuload = await row.locator("td",{hasText:'%'}).textContent(); // CPU column
      console.log("The cpuload percentage of chrome is " + cpuload);
      break;//breaks the inner for loop
    }
     break;//breaks the outer for loop
}
 }
  await page.waitForTimeout(6000);
//Finding the firefox network of firefox
for(let i=0;i<await table_rows.count();i++){
const row=table_rows.nth(i);
const cols=await row.locator("td").allInnerTexts();
for(const c of cols){
  
if(c==='Firefox'){
  const network=await row.locator('td:has-text("Mbps")').innerText();
  console.log("The network capacity of firefox is "+network);
  break;
}
break;
}

}
//Finding the Disk space of Firefox
for(let i=0;i<await table_rows.count();i++){
const row=table_rows.nth(i);
const cols=await row.locator("td").allInnerTexts();
for(const c of cols){
  
if(c==='Internet Explorer'){
  const Diskspace=await row.locator('td:has-text("MB/s")').innerText();
  console.log("The diskcapacity  of Internet Explorer is "+Diskspace);
  break;
}
break;
}
}

     })
      test("Demo with the xpath",async({page})=>{
        await page.goto("https://testautomationpractice.blogspot.com/p/download-files_25.html");
        await page.evaluate(()=>window.scrollBy(0,1500));
    
        const table_rows=page.locator('//table[@id="taskTable"]/tbody/tr');
        //rows count
        const rowscount=await table_rows.count();
        console.log("The rows count is "+rowscount)
        // all the rows
        const rowstexts=await table_rows.allInnerTexts();
        //column texts
        const table_column=table_rows.locator("td");
        const columstexts=await table_column.allInnerTexts();
 
//Finding the the chrome
  let cpuload ;

  for (let i = 0; i < await table_rows.count(); i++)
     {
    const row = table_rows.nth(i);
   // console.log(await row.innerText())
    const processnames= await row.locator("td").allInnerTexts();
    //console.log(processnames)
    for(const pname of processnames)
      {
   if (pname === 'Chrome') 
    {
       cpuload = await row.locator("xpath=.//td[contains(text(), '%')]").textContent();
    // cpuload = await row.locator("td",{hasText:'%'}).textContent(); // CPU column
      console.log("The cpuload percentage of chrome is " + cpuload);
      break;//breaks the inner for loop
    }
     break;//breaks the outer for loop
}
 }
 await page.waitForTimeout(3000)
  

     })