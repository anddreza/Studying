Quando('acesso a pagina principal da Startbugs') do
    visit 'https://starbugs.vercel.app/'   
  end
  
  Então('eu devo ver uma lista de cafés disponíveis') do
    products = all('.coffee-item')
    expect(products.size).to be > 0
  end

Dado('que estou na página principal da Starbugs') do
  visit 'https://starbugs.vercel.app/' 
end

Dado('que desejo comprar o café{string}') do |product_name|
  puts product_name
end 

Dado('que esse produto custa R${float}') do |product_price|
  puts product_price
end 

Dado('que o custo de entrega é de R${float}') do |delivery_price|
  puts delivery_price
end 

Dado('')