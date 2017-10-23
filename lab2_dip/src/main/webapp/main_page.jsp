<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 18.10.2017
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>lab1_pip</title>
    <link href="css/style_lab1.css" type="text/css" rel="stylesheet">
    <script src="js/validation12.js" type="text/javascript"></script>
    <script src="js/onlyOneCheckbox.js" type="text/javascript"></script>
</head>
<body>
<table>
    <tr class="header">
        <td>Архипов Глеб</td>
        <td>P3102 Вариант: 593</td>
    </tr>
    <tr class="header">
        <td>Михаил Филатов</td>
        <td>P3102 Вариант: 593</td>
    </tr>
    <form id="coordinates"  action="/lab2_dip_war/control" method="GET">
    <tr>
        <td>Y: <input type="text" name="Y" value="0.0" style="width: 100px;"></td>
        <td rowspan="4" id="imgCenter"><img  src="images\graph_lab2.PNG" alt="Тут должен быть график"></td>
    </tr>
    <tr>
        <td>
            <table>
                <tr>
                    <td id="X"  colspan="3">X:</td>
                </tr>
                <tr>
                    <td><input type="radio" name="X" value="-3" form="coordinates">-3</td>
                    <td><input type="radio" name="X" value="-2" form="coordinates">-2</td>
                    <td><input type="radio" name="X" value="-1" form="coordinates">-1</td>
                </tr>
                <tr>
                    <td><input type="radio" name="X" value="0" form="coordinates">0</td>
                    <td><input type="radio" name="X" value="1" form="coordinates">1</td>
                    <td><input type="radio" name="X" value="2" form="coordinates">2</td>
                </tr>
                <tr>
                    <td><input type="radio" name="X" value="3" form="coordinates">3</td>
                    <td><input type="radio" name="X" value="4" form="coordinates">4</td>
                    <td><input type="radio" name="X" value="5" form="coordinates">5</td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td>
            <table>
                <tr>
                    <td id="R" colspan="3">R:</td>
                </tr>
                <tr>
                    <td><input id='1' type="checkbox" name="R" value="1" onclick="chbx(this)" form="coordinates">1</td>
                    <td><input id='2' type="checkbox" name="R" value="2" onclick="chbx(this)" form="coordinates">2</td>
                    <td><input id='3' type="checkbox" name="R" value="3" onclick="chbx(this)" form="coordinates">3</td>
                </tr>
                <tr>
                    <td><input id='4' type="checkbox" name="R" value="4" onclick="chbx(this)" form="coordinates">4</td>
                    <td><input id='5' type="checkbox" name="R" value="5" onclick="chbx(this)" form="coordinates">5</td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td><button form="coordinates" onclick="validate(this.form)" type="button">Давайте проверим</button></td>
    </tr>
    </form>
</table>
</body>
</html>
