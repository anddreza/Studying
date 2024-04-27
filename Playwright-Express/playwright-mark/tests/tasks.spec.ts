import {test, expect} from '@playwright/test'
import { faker } from '@faker-js/faker'


test('deve poder cadastrar uma nova tarefa', async({page}) => {
    
    await page.goto('http://localhost:8080')
   // await page.fill('#newTask', 'Ler um livro de TS')
   //await page.fill('input[class*=InputNewTask]') : outra forma de encontrar 
  // await page.fill('input[placeholder="Add a new Task"]', 'Ler um livro de TS') //This is substitute
    const inputTaskName = page.locator('input[class*=InputNewTask]')
    //await inputTaskName.fill('Ler um livro de TS')
   // await page.fill('input[class*=InputNewTask]', 'Ler um livro de TS')
   await inputTaskName.fill(faker.lorem.words())

//    await inputTaskName.press('Enter') //press the button enter
//    await page.click('xpath=//button[contains(text(), "Create")]'): XPath, it's not a best option
    
    await page.click('css=button >> text=Create')
    
})