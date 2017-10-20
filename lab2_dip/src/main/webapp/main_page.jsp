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
</head>
<body>
<body>
<table>
    <tr class="header">
        <td>Архипов Глеб</td>
        <td>P3102 Вариант: 500</td>
    </tr>
    <tr class="header">
        <td>Голованев Яков</td>
        <td>P3102 Вариант: 500</td>
    </tr>
    <tr>
        <td><form id="coordinates" action="/some_servlet" method="POST">Y: <input type="text" name="Y" value="0.0"></form></td>
        <td rowspan="4" id="imgCenter"><img  src="images\graph.PNG" alt="Тут должен быть график"></td>
    </tr>
    <tr>
        <td>
            <table>
                <tr>
                    <td id="X" colspan="3">X:</td>
                </tr>
                <tr>
                    <td><input type="radio" name="X" value="-2" form="coordinates">-2</td>
                    <td><input type="radio" name="X" value="-1.5" form="coordinates">-1.5</td>
                    <td><input type="radio" name="X" value="-1" form="coordinates">-1</td>
                </tr>
                <tr>
                    <td><input type="radio" name="X" value="-0.5" form="coordinates">-0.5</td>
                    <td><input type="radio" name="X" value="0" form="coordinates">0</td>
                    <td><input type="radio" name="X" value="0.5" form="coordinates">0.5</td>
                </tr>
                <tr>
                    <td><input type="radio" name="X" value="1" form="coordinates">1</td>
                    <td><input type="radio" name="X" value="1.5" form="coordinates">1.5</td>
                    <td><input type="radio" name="X" value="2" form="coordinates">2</td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td>R: <input type="text" name="R" value="0.0" form="coordinates"></td>
    </tr>
    <tr>
        <td><button form="coordinates" type="submit">Давайте проверим</button></td>
    </tr>
</table>
</body>
</html>
