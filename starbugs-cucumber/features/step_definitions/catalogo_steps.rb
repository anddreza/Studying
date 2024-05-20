Quando('acesso a página principal da Starbugs') do
  @home.open
end

Então('eu devo ver uma lista de cafés disponíveis') do
    expect(@home.coffee_list.size).to be > 0
end

Dado('que estou na página principal da Starbugs') do
  @home.open
end

Dado('que desejo comprar o seguinte produto:') do |table|
   @product = table.rows_hash
end

# Dado('que desejo comprar o café{string}') do |product_name|
#   @product_name = product_name
# end

# Dado('que esse produto custa {string}') do |product_price|
#   @product_price = product_price
# end

# Dado('que o custo de entrega é de {string}') do |delivery_price|
#   @delivery_price = delivery_price
# end

Quando('inicio a compra desse item') do
  @home.buy(@product[:name])
end

Então('devo ver a página de Checkout com os detalhes do produto') do
  # product_title = find('.item-details h1')
  # expect(product_title).to eql @product[:name]

  # sub_price = find('.subtotal .sub_price')
  # expect(sub_price.text).to eql @product[:price]

  # delivery = find('.delivery-price')
  # expect(delivery.text).to eql @product[:delivery]
  @checkout.assert_product_details(@product)
end

Então('o valor total da compra deve ser de {string}') do |total_price|
  @checkout.assert_total_price(total_price)
end

Então('devo ver um popup informando que o produto está indisponível') do
  @popup.have_text('Produto indisponível')
end
