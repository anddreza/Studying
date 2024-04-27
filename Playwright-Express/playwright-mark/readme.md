Install: 

1. yarn create playwright
-> In your terminal will list a lot of question, but that's OK. On this course, wou will execute in Typescript
2. sudo yarn playwright install-deps
3. npm rebuild
-> I did execute this, because yarn did work and npm it's weird. I can't explain. However, I found solution when I found this link: https://stackoverflow.com/questions/27541586/error-could-not-locate-the-bindings-file-tried-5 
4. npm run dev
5. Execute playwright: yarn playwright test
-> This command will open report 
6. Install yarn: sudo npm install --global yarn
7. yarn playwright test --headed: esse é o argumento que faz ele não rodar em headed 
8. headless: false: para não precisar passar o tempo todo --headed, isso foi alterado no arquivo de configuração
9. yarn playwright test --debug : onde é possível analisar cada step em tempo real
10. yarn playwright test tasks --debug : dessa forma você pod executar somente o arquivo 'tasks' em modo debug (opcional)
