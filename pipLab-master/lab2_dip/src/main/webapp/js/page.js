function usePicture(form, x, y) {

    x = x/233*13 - 6.5;
    y = 6.5 - y/232*13;

    var R = document.getElementsByClassName('R');
    for (i = 0; i < 5; i++) {
        if (R[i].checked === true) {
            console.log(x + " " + y + " " + R[i].value);
            $.ajax({
                url: "/lab2_dip_war/control",
                type: "get",
                data: {X: x, Y: y, R: R[i].value},
                success: function (data) {
                    drawPoints(data);
                }
            }, "json");
        }
    }

}



function drawPoints(data) {
   // alert(data.toString());

    // версия для html
    var elem = document.getElementById('aBody');
    elem.innerHTML += data.toString();
    var re = /-?\d+(\.\d+)?/g;
    var str = data;
    var arrayOfNumbers = str.match(re);
    var top = (6.5 - arrayOfNumbers[1])*232/13 - 5;
    var left = (6.5 + parseFloat(arrayOfNumbers[0]))*233/13 - 5;
    var d = document.createElement('div');
   // alert(left);

   // alert(position.left);
    d.className='div_one';
    $(d).css({top: top, left: left});

    document.getElementsByClassName("img-wrapper")[0].appendChild(d);

}

