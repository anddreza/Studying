import { test, expect } from '@playwright/test'
//import { faker } from '@faker-js/faker'

import { TaskModel } from './fixtures/task.model'

import { deleteTaskByHelper, postTask } from './support/helper.spec'

import { TasksPage } from './support/pages/tasks'

import data from './fixtures/tasks.json'

let tasksPage: TasksPage
test.beforeEach(({page})=>{
    tasksPage = new TasksPage(page)
})
test.describe('cadastro', () => {
    test('deve poder cadastrar uma nova tarefa', async ({ page, request }) => {

        const task = data.success as TaskModel
        // const task: TaskModel = {
        //     name: 'Ler um livro de TS',
        //     is_done: false
        // } 
    
        await deleteTaskByHelper(request, task.name)
        //Dado que eu tenho uma nova tarefa
        //E que estou na página de cadastro
        //Quando faço o cadastro dessa tarefa
        //Então essa tarefa deve ser exibida na lista
    
        //request: acesso a requisições HTTP
        // await request.delete('http://localhost:3333/tasks/' + task.name)
        //await page.goto('http://localhost:8080')
        // await page.fill('#newTask', 'Ler um livro de TS')
        //await page.fill('input[class*=InputNewTask]') : outra forma de encontrar 
        // await page.fill('input[placeholder="Add a new Task"]', 'Ler um livro de TS') //This is substitute
        // const inputTaskName = page.locator('input[class*=InputNewTask]')
        //await inputTaskName.fill('Ler um livro de TS')
        //   await page.fill('input[class*=InputNewTask]', 'Ler um livro de TS')
        //await inputTaskName.fill(task.name)
    
        //    await inputTaskName.press('Enter') //press the button enter
        //    await page.click('xpath=//button[contains(text(), "Create")]'): XPath, it's not a best option
    
        //   await page.click('css=button >> text=Create')
    
        // const target = page.getByTestId('task-item')
        //  await expect(target).toHaveText(taskName)
        //   const target = page.locator('.task-item') //div[class*=listItem]
    
        //    const target = page.locator('css=.task-item p >> text=' + taskName)
    
     //   const tasksPage: TasksPage = new TasksPage(page)
    
        await tasksPage.go()
        await tasksPage.create(task)
        await tasksPage.shouldHaveText(task.name)
    
        //  const target = page.locator(`css=.task-item p >> text=${task.name}`)
    
    
        //  await expect(target).toHaveText(taskName)
        //  await expect(target).toBeVisible()
    
    })
    
    test('não deve permitir tarefa duplicada', async ({ request }) => {
    
        const task = data.duplicate as TaskModel
        // const task: TaskModel = {
        //     name: 'Comprar Ketchup',
        //     is_done: false
        // }
    
        await deleteTaskByHelper(request, task.name)
        //await request.delete('http://localhost:3333/helper/tasks/' + task.name)
        //  const newTask = await request.post('http://localhost:3333/tasks/', {data: task})
        await postTask(request, task)
        //expect(newTask.ok()).toBeTruthy()
    
       // const tasksPage: TasksPage = new TasksPage(page)
        await tasksPage.go()
        await tasksPage.create(task)
        await tasksPage.alertHaveText('Task already exists!')
        //Task already exists!
        //const target = page.locator('.swal2-html-container')
        //await expect(target).toHaveText('Task already exists!')
    })
    
    test('campo obrigatório', async() => {
       
        const task = data.required as TaskModel
        // const task: TaskModel = {
        //     name: '',
        //     is_done: false
        // }
    
    //    const tasksPage: TasksPage = new TasksPage(page)
        await tasksPage.go()
        await tasksPage.create(task)
    
       // const inputTaskName = page.locator('input[class*=InputNewTask]')
        const validationMessage = await tasksPage.inputTaskName.evaluate(e => (e as HTMLInputElement).validationMessage)
        expect(validationMessage).toEqual('This is a required field')
    
    })
    
})


test.describe('atualização', () => {
    test('deve concluir uma tarefa', async({request}) =>{
        const task = data.update as TaskModel 
    
        await deleteTaskByHelper(request, task.name)
        await postTask(request, task)
    
  //      const tasksPage: TasksPage = new TasksPage(page)
    
        await tasksPage.go()
        await tasksPage.toggle(task.name)
        await tasksPage.shouldBeDone(task.name)
    
    })
})


test.describe('exclusão', () => {
    test('deve excluir uma tarefa', async({request}) =>{
        const task = data.delete as TaskModel 
    
        await deleteTaskByHelper(request, task.name)
        await postTask(request, task)
    
    //    const tasksPage: TasksPage = new TasksPage(page)
    
        await tasksPage.go()
        await tasksPage.remove(task.name)
        await tasksPage.shouldNotExist(task.name)
    
    })
})