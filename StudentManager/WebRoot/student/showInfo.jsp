<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!--jstl核心标签  -->
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showInfo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    学生信息展示 <br>
    <table>
    <tr><td>学生编号</td><td>学生姓名</td><td>学生生日</td><td>学生电话</td><td>操作</td></tr>
    <c:forEach items="${stus}" var="stu"><!-- for(Student stu : stus) -->
     <tr><td>${stu.stuId}</td><td>${stu.stuName}</td><td>${stu.brithday}</td><td>${stu.phone}</td>
     <td><a href="<%=request.getContextPath()%>/stu?action=toEdit&stuId=${stu.stuId}">修改</a></td></tr>
     <!-- 修改提交的路径 依然是studnet的servlet  但是需要通过一个参数来区分动作  action -->
    </c:forEach>
    </table>
  </body>
</html>
