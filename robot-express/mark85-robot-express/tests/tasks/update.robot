*** Settings ***
Documentation     Consumindo a API Rest do sistema Mark85

Resource        ../../resources/base.resource

Test Setup        Start Session
Test Teardown     Take Screenshot   
*** Keywords ***
Deve poder marcar uma tarefa como concluida
    
    ${data}    Get fixture    task    done

    Clean user from database    ${data}[user][email]
    Insert user from database   ${data}[user]

    POST user session    ${data}[user]
    POST a new task      ${data}[task]

    Submit login form           ${data}[user]
    User should be logged in    ${data}[user][name]

    # (strong[text()="Criar uma nova IA"])/..//button)[2]
    # (strong[text()="Criar uma nova IA"])/..//button)[@class="item-toggle"]