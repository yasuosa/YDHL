<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/26
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">
    <title>环境指标</title>
</head>
<body>
<div class="d-flex justify-content-center align-items-center" style="height: 100vh">
    <div class="d-inline-block">
        <h3 class="text-center">环境指标</h3>
        <button type="submit" class="btn btn-primary btn-block col-12 offset-md-3 col-md-9"
                onclick="window.location='./Environment.do'"
                style="width: 500px"
                formmethod="get">
            环境指标
        </button>
        <button type="submit" class="btn btn-primary btn-block col-12 offset-md-3 col-md-9"
                style="width: 500px"
                onclick="window.location=''" >
            道路状态
        </button>
    </div>
</div>
</body>
</html>
