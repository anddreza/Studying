function newButton(text, callback) {
    const $body = document.querySelector("body");
    const $button = document.createElement("button");
   
    $button.textContent = text;

    callback();
    $body.insertAdjacentElement('beforeend', $button);

    return $button;
}

//estou passando para dentro da função newButton outra função por parametro
newButton("Login", () => {
    console.log("funcionou!");
});
newButton("Signup", () => {
    console.log("funcionou 2");
});
