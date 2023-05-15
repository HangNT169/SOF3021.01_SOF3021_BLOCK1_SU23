<%--
  Created by IntelliJ IDEA.
  User: hangnt
  Date: 22/01/2023
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="" method="post">
    MSSV: <input type="text" name="mssv" value="${sv.ma}" />
    <br/>
    Tên: <input type="text" name="ten" value="${sv.ten}"/>
    <br/>
    Tuổi: <input type="text" name="tuoi" value="${sv.tuoi}"/>
    <br/>
    Địa chỉ: <input type="text" name="diaChi" value="${sv.diaChi}"/>
    <br/>
    Giới tính:
    <input type="radio" name="gioiTinh" value="true" ${sv.gioiTinh?'checked':''}/>Nam
    <input type="radio" name="gioiTinh" value="false" ${!sv.gioiTinh?'checked':''}/>Nữ
    <br/>
    <button>Update</button>
</form>

</body>
</html>
