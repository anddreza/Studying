# Project Title
Playwright eXpress

## Description
Nesse curso será verificado: 
* Construir um projeto de testes de ponta a ponta para aplicações web
* Automatizar testes de regressão com Playwright
* Preencher formulários automáticamente
* Boas práticas para implementação de testes automatizados
* Como validar o comportamento esperado
* Automação de ações que o usuário realiza em um navegador da Web
* Como testar aplicações simulando um ambiente real
* As vantagens ao usar Typescript para testes automatizados

## Getting Started
- Prerequisites: Install Visual Studio Code, Node 18, Windows Terminal, Git

### Installing
 
1. yarn create playwright
-> In your terminal will list a lot of question, but that's OK. On this course, wou will execute in Typescript
2. sudo yarn playwright install-deps
3. npm rebuild
-> I did execute this, because yarn did work and npm it's weird. I can't explain. However, I found solution when I found this link: https://stackoverflow.com/questions/27541586/error-could-not-locate-the-bindings-file-tried-5 
4. npm run dev


### Executing program


5. Execute playwright: yarn playwright test
-> This command will open report 
6. Install yarn: sudo npm install --global yarn
7. yarn playwright test --headed: esse é o argumento que faz ele não rodar em headed 
8. headless: false: para não precisar passar o tempo todo --headed, isso foi alterado no arquivo de configuração
9. yarn playwright test --debug : onde é possível analisar cada step em tempo real
10. yarn playwright test tasks --debug : dessa forma você pod executar somente o arquivo 'tasks' em modo debug (opcional)


## Readme
I started study more about Plawright and I found this website with good locators:
https://dev.to/hatemtemimi/testing-with-playwright-gn5