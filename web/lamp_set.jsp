<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/24
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">
    <title>路灯设置</title>
</head>
<script type="text/javascript" src="js/set.js"></script>
<body>
<div class="d-flex justify-content-center align-items-center" style="height: 100vh">
    <div class="d-inline-block">
        <h3 class="text-center">路灯设置</h3>
        <form action="./LampServlet.do" method="post">
            <div class="form-group row">
                <label class="col-12 col-md-4">路灯名字(1-5)</label>
                <input type="text" class="form-control col-12 col-md-8" name="roadName" id="lampId">
            </div>

            <div class="form-group row">
                <label class="col-12 col-md-4">红灯时长</label>
                <input type="text" class="form-control col-12 col-md-8" name="redTime">
            </div>

            <div class="form-group row">
                <label class="col-12 col-md-4">绿灯时长</label>
                <input type="text" class="form-control col-12 col-md-8" name="greenTime">
            </div>

            <div class="form-group row">
                <label class="col-12 col-md-4">黄灯时长</label>
                <input type="text" class="form-control col-12 col-md-8" name="yellowTime">
            </div>
            <div class="row">
                <button type="submit" id="bt1" class="btn btn-primary btn-block col-12 offset-md-3 col-md-9" >
                    设置
                </button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
