<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mi
  Date: 2019/1/9
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <table align="center">
      <th>用户名</th>
      <th>密码</th>
      <c:forEach items="${users}" var="user">
        <tr>
          <td>${user.getName()}</td>
          <td>${user.getPassword()}</td>
        </tr>
      </c:forEach>
    </table>
  </body>
</html>
