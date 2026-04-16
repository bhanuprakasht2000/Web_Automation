import {test} from "@playwright/test"
test("Single file upload through input",async({page})=>{
await page.goto("https://testautomationpractice.blogspot.com/");
let singlefile=page.locator("//input[@id='singleFileInput']");
await singlefile.setInputFiles("C:/Users/Bhanuprakash Reddy/Desktop/Kaveri tech/Playwright/tests/testdata/Credentials.csv");
console.log("The file uploaeded successfully");
await page.locator("//button[text()='Upload Single File']").click();
await page.waitForTimeout(5000);
})
test("Multiple file uploads",async({page})=>{
    await page.goto("https://testautomationpractice.blogspot.com/");
    let multiplefileupload=page.locator("//input[@id='multipleFilesInput']");
await multiplefileupload.setInputFiles([
    "C:/Users/Bhanuprakash Reddy/Desktop/Kaveri tech/Playwright/tests/testdata/Credentials.csv",
    "C:/Users/Bhanuprakash Reddy/Desktop/Kaveri tech/Playwright/tests/testdata/Exceldata.xlsx"
]);
await page.locator("//button[text()='Upload Multiple Files']").click();
await page.waitForTimeout(5000);


})
test("file download through input",async({page})=>{
    await page.goto("https://practice.expandtesting.com/download#google_vignette");

    const [ download_file ] = await Promise.all([
page.waitForEvent('download'),
   await page.locator("//a[normalize-space()='1775135307234_sampletest.pdf']").click()
   
]);
await download_file.saveAs("C:/Users/Bhanuprakash Reddy/Desktop/Kaveri tech/Playwright/tests/filedownload/fileupload21_download.pdf");
    console.log("The file downloaded")
})
test("fileupload through the button",async({page})=>{
    await page.goto("https://www.naukri.com/registration/createAccount?othersrcp=22636");
    await page.locator("//p[normalize-space()='I have work experience (excluding internships)']").click();
    await page.waitForTimeout(2000);
    let [file_choosen_upload_btn]=await Promise.all([
         page.waitForEvent('filechooser'),
       page.locator("//button[normalize-space()='Upload Resume']").click()
    ])
    
await file_choosen_upload_btn.setFiles("C:/Users/Bhanuprakash Reddy/Desktop/Kaveri tech/Playwright/tests/filedownload/fileupload21_download.pdf");
console.log("The file upload is successfully done")
})