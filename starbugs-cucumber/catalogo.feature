#language: pt 

Funcionalidade: Catalogo de cafes
    Como um usuario de site, eu quero ver o catalogo de cafes na pagina principal
    Para que eu possa escolher e saber mais sobre os produtos disponiveis

Cenario: Acessar o catalogo de cafés na página principal   
    Quando acesso a pagina principal da Startbugs
    Então eu devo ver uma lista de cafés disponíveis

@temp
Cenario: Iniciar a compra de um cafe
  Dado que estou na página principal da Startbugs
    E que desejo comprar o café "Expresso Gelado"
    E que esse produto custa R$ 9.99
    E que o custo de entrega é R$ 10.00
  Quando inicio a compra desse item 
  Então devo ver a página de checkout com os detalhes do produto    
    E o valor total da compra deve ser de R$ 19.99

@temp
Cenário: Café indisponível
    Dado que estou na página principal da Startbugs 
        E que desejo comprar o café "Expresso Cremoso"
    Quando inicio a compra desse item
    Então devo ver um popup informando que o produto está indisponível
