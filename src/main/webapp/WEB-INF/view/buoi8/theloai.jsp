<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <tr>
        <th>STT</th>
        <th>Ma</th>
        <th>Name</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${danhSach}" var="cate" varStatus="stt">
        <tr>
            <td>${stt.index+1}</td>
            <td>${cate.categoryCode}</td>
            <td>${cate.categoryName}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
