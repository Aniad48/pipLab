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
}