let audios = [
    { caminho: 'audios/pare.mp3', legenda: 'GRITO' },
    { caminho: 'audios/projeto_ratinho_audios_nao-e-o-pai.mp3', legenda: 'Não e o pai' },
    { caminho: 'audios/uepa.mp3', legenda: 'UEPA' }
];


let botoes = document.querySelectorAll('.botao');
let legendas = document.querySelectorAll('p');

for (let i = 0; i < 5; i++){
    legendas[i].textContent = audios[i].legenda;
    botoes[i].setAttribute('data-item', i);
}

let audioTag = document.querySelector('audio');

botoes.forEach(botao => {
    botao.addEventListener('click', () => {
       let som = audios[botao.getAttribute('data-item')];
        audioTag.setAttribute('src', som.caminho);
        audioTag.addEventListener('loadeddata', () => {
            audioTag.play();
        });
    });
});