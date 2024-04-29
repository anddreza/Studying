import { test, expect } from '@playwright/test';

test('deve tocar uma musica', async ({ page }) => {

  const song = {
    title: 'Bughium'
  }
  await page.goto('https://parodify.vercel.app/');


  const loggedUser = page.locator('.logged-user')
  await expect(loggedUser).toHaveText('Fernando Papito');

  await page.click(`//div[contains(@class, "song")]//h6[text()="${song.title}"]/..//button`);
  await page.waitForTimeout(5000);
});

