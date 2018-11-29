<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/24
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

  <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">
  <title>小车查询</title>
</head>
<script type="text/javascript" src="./js/set.js"></script>
<body>
<div class="d-flex justify-content-center align-items-center" style="height: 100vh">
  <div class="d-inline-block">
    <h3 class="text-center">小车查询</h3>
    <form action="./carAccount.do" method="post">
      <div class="form-group row">
        <label class="col-12 col-md-4" >小车ID(1-5)</label>
        <input type="text" class="form-control col-12 col-md-8" name="carId" id="carId">
      </div>

      <div class="form-group row">
        <label class="col-12 col-md-4">充值金额(查询不填)</label>
        <input type="text" class="form-control col-12 col-md-8" name="money">
      </div>
      <div class="row">
        <button type="submit"  id="bt2" class="btn btn-primary btn-block col-12 offset-md-3 col-md-9" >
          查询
        </button>
      </div>
    </form>
  </div>
</div>
</body>
</html>
