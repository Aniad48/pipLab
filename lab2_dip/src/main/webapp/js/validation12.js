function validate(form) {
    var elems = form.elements;

    resetError(document.getElementById("R").parentNode);
    resetError(document.getElementById("X").parentNode);
    resetError(elems.Y.parentNode);
    if (!elems.Y.value) {
        showError(elems.Y.parentNode, ' Заполните поле', 1, 'span');
    } else if (elems.Y.value<=-3 || elems.Y.value>=3 ) {
        showError(elems.Y.parentNode, ' Выходит за границы', 1, 'span');
    } else if (elems.X.value==''){
        document.getElementById("X").colSpan = "1";
        showError(document.getElementById("X").parentNode, ' Выбирите!', 2, 'td');
    } else if (elems.R.value==''){
        document.getElementById("R").colSpan = "1";
        showError(document.getElementById("R").parentNode, ' Выбирите!', 2, 'td');
    }
    else form.submit();
}
function showError(container, errorMessage, colSpan, type) {
    container.className = 'error';
    var msgElem = document.createElement(type);
    msgElem.className = "error-message";
    msgElem.innerHTML = errorMessage;
    msgElem.colSpan=colSpan;
    container.appendChild(msgElem);
}
function resetError(container) {
    container.className = '';
    if (container.lastChild.className == "error-message") {
        container.removeChild(container.lastChild);
    }
}