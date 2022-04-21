<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page  isELIgnored="false"%>
<%request.setAttribute("pn", pageContext.getServletContext().getContextPath());%>
<html>
<head>
  <title>Title</title>
  <h1>修改学生信息</h1>
</head>
<body>
<%--    <form action="/student/UpdateOne" method="post">--%>
<%--      ID:<input type="text" name="id"><br/>--%>
<%--      name:<input type="text" name="name"><br/>--%>
<%--      password:<input type="text" name="password"><br/>--%>
<%--      sex:<input type="text" name="sex"><br/>--%>
<%--      age:<input type="text" name="age"><br/>--%>
<%--      <input type="submit" value="提交">--%>
<%--    </form>--%>

    <h1>安全方式 update Person Index</h1>
    <form action="${pn }/student/UpdateOne?id=${ student1.id }" method="post">
      <table class="table table-hover">
        <tr>
          <td>学生姓名</td>
          <td><input type="text" name="name" value="${student1.name }"/></td>
        </tr>
        <tr>
          <td>密码</td>
          <td><input type="text" name="password" value="${student1.password }"/></td>
        </tr>
        <tr>
                  <td>性别</td>
                  <td><input type="text" name="sex" value="${student1.sex }"/></td>
                </tr>
        <tr>
        <tr>
                          <td>年龄</td>
                          <td><input type="text" name="age" value="${student1.age }"/></td>
                        </tr>
                <tr>
          <td colspan="4">
            <input type="submit" value="修改"/>
          </td>
        </tr>
      </table>
    </form>

</body>
</html>
