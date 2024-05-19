Dado('que iniciei a compra do item {string}') do |product_name|
    @home.buy(@product_name)
end
  
Quando('faço a busca do seguinte CEP: {string}') do |zipcode|
        find('input[name=cep]').set(zipcode)
        click_on 'Buscar CEP'
end

Quando('informo os demais dados do endereço:') do |table|
    
end

Quando('escolho a forma de pagamento {string}') do |string|
pending # Write code here that turns the phrase above into concrete actions
end

Quando('por fim finalizo a compra') do
pending # Write code here that turns the phrase above into concrete actions
end

Então('sou redicionado para a página de confirmação de Pedidos') do
pending # Write code here that turns the phrase above into concrete actions
end

Então('deve ser informando o seguinte prazo e entrega: {string}') do |string|
pending # Write code here that turns the phrase above into concrete actions
end