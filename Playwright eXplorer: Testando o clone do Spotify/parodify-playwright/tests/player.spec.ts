import { test, expect } from '@playwright/test';

test('deve tocar uma musica', async ({ page }) => {

  const song = {
      id: 1,
      title: "Bughium",
      artist: "Nullvana",
      description: "Nullvana",
      image: "https://raw.githubusercontent.com/qaxperience/mock/main/covers/nevertesting.jpg",
      type: "album",
      src: "https://raw.githubusercontent.com/qaxperience/mock/main/songs/nirvana.mp3"
    }

    //interceptar a rota que a aplicação web consome
  await page.route('**/songs', route => route.fulfill({
    status: 200,
    body: JSON.stringify([song])
  }))
  
  await page.goto('https://parodify.vercel.app/');

  const loggedUser = page.locator('.logged-user')
  await expect(loggedUser).toHaveText('Fernando Papito');

  const songCard = page.locator('.song').filter({ hasText: song.title })
  const pause = songCard.locator('.pause')

  const play = songCard.locator('.play')
  await play.click()
  await expect(pause).toBeVisible({ timeout: 2000 })
  await expect(play).toBeVisible({ timeout: 171000 })

  // await page.click(`//div[contains(@class, "song")]//h6[text()="${song.title}"]/..//button`);
  // await page.waitForTimeout(5000);
});

