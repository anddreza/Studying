import {test, expect} from '@playwright/test'

test('deve poder cadastrar uma nova tarefa', async({page}) => {
    
    await page.goto('http://localhost:8080')
   // await page.fill('#newTask', 'Ler um livro de TS')
   //await page.fill('input[class*=InputNewTask]') : outra forma de encontrar 
  // await page.fill('input[placeholder="Add a new Task"]', 'Ler um livro de TS') //This is substitute

})