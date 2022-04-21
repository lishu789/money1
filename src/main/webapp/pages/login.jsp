<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<html>

  <head>

    <title>studentList.jsp页面</title>

  </head>


  <body>



      <form action="/login1" method="post" name=form >

     <font size="5">学生信息管理系统</font><br>

     用户名：<input type="text" value=""name="userName"><br>

     密码：<input type="text"value="" name="password"><br>

     <input type="submit"value="登陆"name="submit">
     </form>

    <a href="/pages/index.jsp"><button>注册</button></a>
</html>

