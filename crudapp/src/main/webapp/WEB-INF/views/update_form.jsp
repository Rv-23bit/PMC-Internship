<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
<style>
.card {
	width: 50%;
	margin-left: 25%;
	margin-top: 10%
}
body {
	margin: 0;
	background-color: #00FFFF;
}
/* Scroll to Top */
#scroll-to-top {
	cursor: pointer;
	position: fixed;
	bottom: 20px;
	right: 20px;
	display: none;
}
</style>
</head>
<body>
	<div class="card card-outline-secondary">
		<div class="card-header">
			<h3 class="mb-0">Register</h3>
		</div>
		<div class="card-body">
			<form autocomplete="off" class="form" role="form" action="${pageContext.request.contextPath}/handle-student" method="post">
			<input type="text" value="${student.id}" name="id" hidden>
				<div class="form-group">
					<label for="inputName">Name</label> <input class="form-control"
						id="name" name="name" placeholder="Full name" type="text" value="${student.name}">
				</div>
				<div class="form-group">
					<label for="inputEmail3">Stream</label> <input class="form-control"
						id="stream" name="stream" placeholder="Stream" required=""
						type="text" value="${student.stream}">
				</div>
				<div class="form-group">
					<label for="inputEmail3">City</label> <input class="form-control"
						id="city" name="city" placeholder="City" required="" type="text" value="${student.city}">
				</div>
				<div class="form-group"></div>
				<div class = "myclass" style="display:flex; justify-content: space-between; margin-left:60%;">
					<a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger btn-lg float-right">Back</a>
					<button class="btn btn-success btn-lg float-right" type="submit">Update Details</button>
				</div>
			</form>
		</div>
	</div>
	<!-- /form card register -->
</body>
</html>