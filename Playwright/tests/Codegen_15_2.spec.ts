import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
  await page.goto('https://testautomationpractice.blogspot.com/');
  await expect(page.getByText('For Selenium, Cypress &')).toBeVisible();
  await page.getByRole('checkbox', { name: 'Sunday' }).check();
  await page.getByRole('checkbox', { name: 'Monday' }).check();
  await expect(page.getByRole('checkbox', { name: 'Monday' })).toBeVisible();
  await expect(page.locator('#HTML3')).toContainText('Mouse Hover');
});