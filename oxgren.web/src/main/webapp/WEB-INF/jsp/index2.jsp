<!DOCTYPE html>
<%@ page language="java" import="java.util.*" contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
	<title>bootstrap</title>
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<script src="/resources/js/jquery.min.js"></script>
	<script src="/resources/js/bootstrap.js"></script>
	<link href="/resources/css/bootstrap.min.css" rel="stylesheet" type="text/css" />

	<script type="text/javascript">

		function Test() {
			alert("hello");
			var data;
			var url = "/save?r=" + Math.random();
			$.ajax({
				url: url,
				dataType: "text",
				data: data,
				success: function (result) {
					alert(result);
				},
				error: function (XMLHttpRequest, textStatus, errorThrown) {
					//alert(errorThrown);
				}
			});
		}
	</script>

</head>
<body>

	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">客服
				</h3>

			</div>
			<div class="panel-body">
				<div class="input-group " style="width: 400px">
					<span class="input-group-addon">用户手机号:</span>
					<input type="text" name="SMobilePhone" class="form-control"  value="erwerwer">
					<input type="hidden" name="SearchPhone" value="werwr"/>
                        <span class="input-group-btn">
                            <button class="btn btn-default" name="btnLook" type="button" value="0" onclick="Test();">查询</button>
                        </span>

				</div>
			</div>
			<div class="panel-body">

				<h1 class="page-header"><small>查询结果：</small></h1>

			</div>
		</div>
	</div>



</body>
</html>
