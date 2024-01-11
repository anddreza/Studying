// forEach em Array de objetos
let produtos = [
    {
        nomeProduto: 'Celular',
        valorProduto: 1200.00,
        porcentagemDesconto: 0.20
    },
    {
        nomeProduto: 'Notebook',
        valorProduto: 2500.00,
        porcentagemDesconto: 0.20
    },
    {
        nomeProduto: 'Televisão',
        valorProduto: 3200.00,
        porcentagemDesconto: 0.10
    }
];

produtos.forEach((produtoAtual) => {
    let valorDoDesconto = produtoAtual.valorProduto * produtoAtual.porcentagemDesconto;
    let valorTotal = produtoAtual.valorProduto - valorDoDesconto;
    produtoAtual.valorTotalProduto = valorTotal;
    console.log(produtoAtual);
    console.log(valorDoDesconto);
})