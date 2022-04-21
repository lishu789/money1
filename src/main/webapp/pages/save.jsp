<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <h1>添加学生信息</h1>
</head>
<body>
    <form action="/student/InsertOne" method="post">
        学生id:<input type="text" name="id"><br>
        学生姓名:<input type="text" name="name"><br>
        密码:<input type="text" name="password"><br>
        学生性别<input type="text" name="sex"><br>
        学生年龄<input type="text" name="age"><br>
        <input type="submit" value="保存"><br>
    </form>
</body>
</html>
