<%--
  Created by IntelliJ IDEA.
  User: HitHellHound
  Date: 19.01.2022
  Time: 2:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Contact Request</title></head>
<body>
<form method="post">
  <label>Sender: </label>
  <input type="text" name="newSender" value="${contactRequest.sender}"/>
  <br/>
  <label>Message:</label>
  <textarea name="newMessage">${contactRequest.message}</textarea>
  <br/>
  <input type="submit" value="Send"/>
</form>
</body>
</html>
