function newButton(text, callback) {
    const $body = document.querySelector("body");
    const $button = document.createElement("button");
   
    $button.textContent = text;

    callback($button);
    $body.insertAdjacentElement('beforeend', $button);

    return $button;
}

//estou passando para dentro da função newButton outra função por parametro
newButton("Login", (button) => {
    button.style.cssText = `
        font-size: 30px;
    `;
});
newButton("Signup", (button) => {
    button.style.cssText = `
    font-size: 40px;
`;
});
