*** Settings ***
Documentation    Ações e elementos da página de cadastro de tarefas

Library    Browser

*** Keywords ***
Submit task form

    [Arguments]    ${task}

    Fill Text    css=input[placeholder$=tarefa]    ${task}[name]

    ${tags_element}    Set Variable    css=input[name=tags]
    
    FOR    ${tag}    IN    @{task}[tags]
        Fill Text    css=inout[name=tags]    ${tag}
        Press Keys    css=input[name=tags]    Enter
    END

    Click    css=button >> text=Cadastrar

