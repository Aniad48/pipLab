function validate(form) {
    var elems = form.elements;

    var t=0;
    for(i=1; i<6; i++){
        if(document.getElementById(""+i).checked){
            t++;
        }
    }

    resetError(document.getElementById("R").parentNode);
    resetError(document.getElementById("X").parentNode);
    resetError(elems.Y.parentNode);
    if (!elems.Y.value.match(/^-?\d+(\.\d+)?$/)) {
        showError(elems.Y.parentNode, 'Только числа!', 1, 'span');
    } else if (!elems.Y.value) {
        showError(elems.Y.parentNode, ' Заполните поле', 1, 'span');
    } else if (elems.Y.value<-3 || elems.Y.value>3 ) {
        showError(elems.Y.parentNode, ' Выходит за границы', 1, 'span');
    } else if (elems.X.value=='') {
        document.getElementById("X").colSpan = "1";
        showError(document.getElementById("X").parentNode, ' Выбирите!', 2, 'td');
    }else if (t==0){
        document.getElementById("R").colSpan = "1";
        showError(document.getElementById("R").parentNode, ' Выбирите!', 2, 'td');
    }
    else {
        for (i = 0; i < 5; i++) {
            if (form.R[i].checked == true) {
                console.log(form.X.value + " " + form.Y.value + " " + form.R[i].value);
                $.ajax({
                    url: "/lab2_dip_war/control",
                    type: "get",
                    data: {X: form.X.value, Y: form.Y.value, R: form.R[i].value},
                    success: function (data) {
                        drawPoints(data);
                    }
                }, "json");
                // form.submit(); // заменить на аякс}
            }
        }
    }
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