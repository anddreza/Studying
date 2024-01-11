let listaDePessoas = [
    'ada@gmail.com', 
    'fulano@gmail.com',
    'andreza@gmail.com'
];

const enviarEmail = (email) => {
    console.log('Enviado email');
}

listaDePessoas.forEach((item, posicao) => {
    enviarEmail(item);
    console.log(`Sua posição é de: ${posicao}`);
    console.log(`A quantidade de pessoas no processo seletivo é ${array.length}`);
})