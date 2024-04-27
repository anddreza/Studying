import {test, expect} from '@playwright/test'
//import { faker } from '@faker-js/faker'


test('deve poder cadastrar uma nova tarefa', async({page, request}) => {
   
    //Dado que eu tenho uma nova tarefa
    //E que estou na página de cadastro
    //Quando faço o cadastro dessa tarefa
    //Então essa tarefa deve ser exibida na lista

    const taskName = 'Ler um livro de TS'
   
    //request: acesso a requisições HTTP
    await request.delete('http://localhost:3333/tasks/' + taskName)
    await page.goto('http://localhost:8080')
   // await page.fill('#newTask', 'Ler um livro de TS')
   //await page.fill('input[class*=InputNewTask]') : outra forma de encontrar 
  // await page.fill('input[placeholder="Add a new Task"]', 'Ler um livro de TS') //This is substitute
    const inputTaskName = page.locator('input[class*=InputNewTask]')
    //await inputTaskName.fill('Ler um livro de TS')
 //   await page.fill('input[class*=InputNewTask]', 'Ler um livro de TS')
   await inputTaskName.fill(taskName)

//    await inputTaskName.press('Enter') //press the button enter
//    await page.click('xpath=//button[contains(text(), "Create")]'): XPath, it's not a best option
    
    await page.click('css=button >> text=Create')

    const target = page.getByTestId('task-item')
    await expect(target).toHaveText(taskName)

    
})