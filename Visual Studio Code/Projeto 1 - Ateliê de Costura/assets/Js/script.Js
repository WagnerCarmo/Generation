var nome = window.document.querySelector('#nome')
var email = document.querySelector('#email')
var assunto = document.querySelector('#assunto')
var mensagem = document.querySelector('#mensagem')

var nomeOk = false
var emailOk = false
var assuntoOk = false
var mensagemOk = false

function validarNome() {
    let txtNome = document.querySelector('#txtNome')
    
    if (nome.value.length <2) {
        txtNome.innerHTML = 'o campo "Nome" deve conter no mímino 2 carateres'
        txtNome.style.color = 'red'
    } 
    
    else {
       txtNome.innerHTML = 'Nome Válido'
       txtNome.style.color = 'green'
       nomeOk = true
    }
}

function validarEmail() {
    let txtEmail = document.querySelector('#txtEmail')
    
    if (email.value.indexOf ('@') == -1 || email.value.indexOf('.com') == -1) {
        txtEmail.innerHTML = 'O e-mail deve conter os argumentos "@" e ".com "'
        txtEmail.style.color = 'red'
    } 
    
    else {
       txtEmail.innerHTML = 'E-mail Válido'
       txtEmail.style.color = 'green'
       emailOk = true
    }
}

function validarAssunto() {
    let txtAssunto = document.querySelector('#txtAssunto')
    
    if (assunto.value.length < 3 || assunto.value.length > 50) {
        txtAssunto.innerHTML = 'O assunto deve conter entre 3 e 50 caracteres'
        txtAssunto.style.color = 'red'
    } 
    
    else {
       txtAssunto.innerHTML = 'Assunto Válido'
       txtAssunto.style.color = 'green'
       assuntoOk = true
    }
}

function validarMensagem() {
    let txtMensagem = document.querySelector('#txtMensagem')
    
    if (mensagem.value.length < 10 || mensagem.value.length > 250) {
        txtMensagem.innerHTML = 'A Mensagem deve conter 15 e 250 caracteres.'
        txtMensagem.style.color = 'red'
    } 
    
    else {
        txtMensagem.innerHTML = 'Mensagem Válida'
        txtMensagem.style.color = 'green'
        mensagemOk = true
    }
}

function enviar() {
    if (nomeOk == true && emailOk == true && assuntoOk == true && mensagemOk == true) { 
       alert ('Formulário enviado com sucesso!!!') 
    }

    else {
       alert ('Por favor, preencha todos os campos corretamente')
    }
}