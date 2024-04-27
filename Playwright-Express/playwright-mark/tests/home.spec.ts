import { test, expect } from '@playwright/test'

test('webapp deve estar online', async ({page}) => {
    await page.goto('http://localhost:8080') // This is import here see Promise in JS
    await expect(page).toHaveTitle('Gerencie suas tarefas com Mark L') //acessa a página no primeiro teste e agora nesse segundo ele faz a validação
    await page.waitForTimeout(3000) //As instruções com timeout para verificar perfeitamente
})


