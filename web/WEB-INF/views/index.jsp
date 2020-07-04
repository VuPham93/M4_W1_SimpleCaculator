<%--
  Created by IntelliJ IDEA.
  User: hurah
  Date: 7/4/2020
  Time: 3:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple Calculator</title>
  </head>
  <body>
  <h1>Simple Calculator</h1>

  <form action="calculate">
    <div>
      <input type="number" name="firstOperator">
      <input type="number" name="secondOperator">
    </div>
    <input type="submit" name="operator" value="Addition(+)">
    <input type="submit" name="operator" value="Subtraction(-)">
    <input type="submit" name="operator" value="Multiplication(x)">
    <input type="submit" name="operator" value="Division(/)">
  </form>

  <h4>Result ${operator}: ${result}</h4>
  </body>
</html>
