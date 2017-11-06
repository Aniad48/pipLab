function chbx(obj)
{
    var that = obj;
    if(document.getElementById(that.id).checked == true) {
        document.getElementById('1').checked = false;
        document.getElementById('2').checked = false;
        document.getElementById('3').checked = false;
        document.getElementById('4').checked = false;
        document.getElementById('5').checked = false;
        document.getElementById(that.id).checked = true;
    }

    var R = document.getElementsByClassName('R');
    for (i = 0; i < 5; i++) {
        if (R[i].checked === true) {
            var num = i+1;
            var path;
            if (num < 1){
                path = "images/graph_lab2r"+num+".PNG";
            }else{
                path = "images/graph_lab2r"+num+".png";
        }
            $("#image").attr("src", path);
        }
    }
}