import { test, expect } from '@playwright/test';

test('Verify GO TO HOMEPAGE link presence on Flipkart Mobiles page', async ({ page }) => {
  // Step 1: Navigate to the URL
  await page.goto('https://www.flipkart.com/mobiles-accessories/mobiles/');

  // Step 2: Wait until the webpage is fully loaded
  await page.waitForLoadState('load');

  // Step 3: Verify whether the "GO TO HOMEPAGE" link is present
  const homeLink = await page.$('a:has-text("GO TO HOMEPAGE")');
  expect(homeLink).not.toBeNull();
});