<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>学生信息管理系统</h1>
    <table border="1">
        <tr>
            <th>学生id</th>
            <th>学生姓名</th>
            <th>密码</th>
            <th>学生性别</th>
            <th>学生年龄</th>
            <th class="width-40">操作</th>
        </tr>
        <c:forEach items="${ studentList }" var="student">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.password}</td>
                <td>${student.sex}</td>
                <td>${student.age}</td>
              <td><a
                href="${pageContext.request.contextPath }/student/DeleteOne?id=${student.id}"><button>删除</button></a>
              </td>
              <td><a
                href="${pageContext.request.contextPath }/student/SelectOne?id=${student.id}"><button>修改</button></a>

              </td>
        </c:forEach>
    </table>
    <a href="/pages/save.jsp"><button>增加学生信息</button></a>
</body>
</html>
