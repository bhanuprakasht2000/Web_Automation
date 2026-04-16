import { test, expect } from '@playwright/test';

test('Verify search button presence on nopCommerce demo site', async ({ page }) => {
  // Step 1: Navigate to the URL
  await page.goto('https://demo.nopcommerce.com/');

  // Step 2: Wait until the page loads successfully
  await page.waitForLoadState('load');

  // Step 3: Verify whether the "search" button is present
  const searchButton = await page.$('button[type="submit"]');
  expect(searchButton).not.toBeNull();
});