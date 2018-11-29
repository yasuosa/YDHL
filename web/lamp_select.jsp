<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/24
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">
    <title>路灯查询</title>
</head>
<script type="text/javascript"></script>
<body>
<div class="d-flex justify-content-center align-items-center" style="height: 100vh">
    <div class="d-inline-block">
        <h3 class="text-center">路灯查询</h3>
        <form action="./LampServlet.do" method="get">
            <div class="row">
                <button type="submit" class="btn btn-primary btn-block col-12 offset-md-3 col-md-9" >
                    查询
                </button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
