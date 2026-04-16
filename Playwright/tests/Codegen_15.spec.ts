import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
  await page.goto('https://testautomationpractice.blogspot.com/');
  await page.getByRole('textbox', { name: 'Enter Name' }).fill('Bhanureddy');
  await page.getByRole('textbox', { name: 'Enter EMail' }).fill('bhanubpr420@gmail.com');
  await page.getByRole('radio', { name: 'Male', exact: true }).check();
  await page.getByLabel('Country:').selectOption('india');
  await page.getByLabel('Colors:').selectOption('white');
  await page.getByLabel('Colors:').selectOption('yellow');
  await page.getByLabel('Colors:').selectOption('red');
  await page.getByText('Sorted List: Cat Cheetah Deer').click();
  await page.getByLabel('Sorted List:').selectOption('cheetah');
  await page.locator('#datepicker').click();
  await page.getByTitle('Next').dblclick();
  await page.getByTitle('Next').click();
  await page.getByTitle('Next').dblclick();
  await page.getByRole('link', { name: '15' }).click();
  await page.locator('#txtDate').click();
  await page.getByRole('link', { name: '28' }).click();
  await page.waitForTimeout(6000);
});
//Use the cmd npx playwright codegen https://testautomationpractice.blogspot.com/ for generating the window and perform the actions