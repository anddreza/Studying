function newButton(text) {
    const $body = document.querySelector("body");
    const $button = document.createElement("button");
    $button.textContent = text;
    $body.insertAdjacentElement('beforeend', $button);

    return $button;
}

const login = newButton('Login');
const signup = newButton('Signup');

login.style.cssText = `
    font-size: 10px;
`;