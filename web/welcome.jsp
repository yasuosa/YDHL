<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/24
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">
    <title>欢迎来到509测试数据库</title>
</head>
<body>
<div class="d-flex justify-content-center align-items-center" style="height: 100vh">
    <div class="d-inline-block">
        <h3 class="text-center">欢迎来到509测试数据库</h3>
        <button type="submit" id="bt1" class="btn btn-primary btn-block col-12 offset-md-3 col-md-9"
                style="width: 800px"
                onclick="window.location='car.jsp'" >
            小车(查询设置)
        </button>
        <button type="submit" id="bt2"
                class="btn btn-primary btn-block col-12 offset-md-3 col-md-9"
                style="width: 800px"
                onclick="window.location='lamp_set.jsp'" >
            路灯设置
        </button>
        <button type="submit" id="bt3"
                class="btn btn-primary btn-block col-12 offset-md-3 col-md-9"
                style="width: 800px"
                onclick="window.location='lamp_select.jsp'" >
            路灯查询
        </button>
        <button type="submit" id="bt4"
                class="btn btn-primary btn-block col-12 offset-md-3 col-md-9"
                style="width: 800px"
                onclick="window.location='environment.jsp'" >
            环境指标
        </button>
    </div>
</div>
</body>
</html>
