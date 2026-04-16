import {test,expect} from "@playwright/test"
test("Single dropdown",async({page})=>{
    await page.goto("https://testautomationpractice.blogspot.com/");
    ///4 ways for the selecting the option
    //await page.locator("#country").selectOption({value:"canada"});//by using the attribute
   // await page.locator("#country").selectOption({label:"Canada"});//by using the label
  // await page.locator("#country").selectOption({index:5});//by using the index
 // await page.locator("#country").selectOption("Canada");//by using the name
 const x=page.locator("#country>Option");
    let alloptionsarray= await x.allTextContents();
  const alloptionstext=alloptionsarray.map(text=>text.trim());
console.log(alloptionstext);
//assertion checking
    let size=alloptionsarray.length;
    expect(alloptionstext).toContain('India');
      expect(size).toBe(10);
      //Otherway of printing 
      for(const a  of alloptionsarray){
       console.log( a.trim());
      }
})


//Multiple selection option
//1.selecting options 4types
test("Multi dropdown",async({page})=>{
    await page.goto("https://testautomationpractice.blogspot.com/");
    await page.locator("#colors").selectOption(['Red','Green']);//By name  or visible text
    await page.waitForTimeout(3000);
    await page.locator("#colors").selectOption([{label:"Yellow"},{label:"White"}]);//By label
    await page.waitForTimeout(3000);
    await page.locator("#colors").selectOption([{value:"blue"},{label:"White"}]);//By value
    await page.waitForTimeout(3000);
    await page.locator("#colors").selectOption([{index:1},{value:"white"}]);//By index
//2.Checking the number of options available
let multiloc=page.locator("#colors>Option");
let multidroparray=multiloc.allTextContents();
let count=(await multidroparray).length;
 expect(count).toBe(7);
//3.Printing all options
let multidroptexts=(await multidroparray).map(x=>x.trim());
console.log(multidroptexts);

})



//Checking wheather the dropdown options are sorted or not
test(" checking sorted dropdown or not",async({page})=>{
    await page.goto("https://testautomationpractice.blogspot.com/");
    //Unsorted Dropdown Locator
                 const alloptionsarray=page.locator("#colors>option");
    //Sorted Dropdown locator       
               //  const alloptionsarray=page.locator("#animals>option");
        //Programs starts
    let Alloptionstext=await alloptionsarray.allTextContents();
    let Alloptionstextindividual:string[]=Alloptionstext.map(t=>t.trim())
    const Originalarray:string[]=await [...Alloptionstextindividual];
     //Spead operator==>[...Nameofarray]-->Which will not allow mutation for the original array
         console.log("The actual the elements are: ")
    console.log(Originalarray);
    //Without spread operator the eoriginal array will also get impacted bcz of mjutation concept
    const Sortedarray:string[]=[...Originalarray].sort();
    console.log("The after sorting the elements are: ")
    console.log(Sortedarray)
    expect(Originalarray).toEqual(Sortedarray);
})




//Checking duplicates are there in the Dropdown options
test("Duplicates",async({page})=>{
await page.goto("https://testautomationpractice.blogspot.com/");
 //Duplicate Dropdown Locator
                 const alloptionsarray=page.locator("#colors>option");
    //Unique Dropdown locator       
                //const alloptionsarray=page.locator("#animals>option");
       const alloptionstext=alloptionsarray.allTextContents();
       const alloptionstextindivual:string[]=(await alloptionstext).map(t=>t.trim());
       console.log(alloptionstextindivual);
       //Forstoring the duplicates
       const Duplicatearry:string[]=[];
       //For storing Unique elements
       const uniqueset=new Set();
       for(const t of alloptionstextindivual)
        {
        if(uniqueset.has(t))
            {
                Duplicatearry.push(t);

        }
        else
            uniqueset.add(t);
        
       }
       if(Duplicatearry.length<1)
        console.log("No duplicate elements found")
    else 
       console.log("The duplicate elements are : "+Duplicatearry)

       console.log("The Unique elements are : ")
       for(const k of uniqueset)
       {
        console.log(k);
       }
})

/*test("sorted array123",async({page})=>{
    await page.goto("https://testautomationpractice.blogspot.com/");
    //Unsorted Dropdown Locator
    const alloptionsarray=page.locator("#country>Option");
    //Sorted Dropdown locator
      //  let alloptionsarray=page.locator("#animals>option");
        //Programs starts
    let Alloptionstext=await alloptionsarray.allTextContents();
    let Alloptionstextindividual=Alloptionstext.map(t=>t.trim())
    console.log(Alloptionstextindividual);
    //THe Original Array
    let OriginalArray=Alloptionstext;
        console.log("The Original Array options: "+OriginalArray);//Original Array Elements
    let Sortedarray=OriginalArray.sort();//Sorting applied for the original array
    console.log("The Sorted array : "+ Sortedarray);
    //Aftert the sorting applied the original array is also getting changed bcz of Mutation concept
    //For checking the Mutation whether the original array got chnaged or not we are printing the Original array elements again. 
            console.log("The Original Array options: "+OriginalArray);
            //To Over cpme this problem of mutation we use the Spread operator =>[...Original array]
            let Origionalarraywithnochange:string[]=[...OriginalArray]
            let Sortedarraywithoutchangingoriginal:string[]=[...Origionalarraywithnochange].sort();
            expect(Origionalarraywithnochange).toEqual(Sortedarraywithoutchangingoriginal);

    /*if( Origionalarraywithnochange==Sortedarraywithoutchangingoriginal)
       { console.log("The Dropdown is Sorted");}
    else 
        {console.log("The Dropdown is not sorted")}

    
})*/

