<html>
<head>
<%@include file="./base.jsp"%>
<style>
body{
background-color:#F0F8FF;
}
</style>
</head>
<body>
	<div clas="container mt-3">

		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center md-3">Student Management System</h1>
				<div class="col-md-12">
					<table class="table">
						<thead class="thead" style="background-color:blue;color:white;">
							<tr>
								<th scope="col">Student Id</th>
								<th scope="col">Full Name</th>
								<th scope="col">Stream</th>
								<th scope="col">City</th>
								<th scope="col">Action</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${students}" var="s">
							<tr>
								<th scope="row">Student#${s.id}</th>
								<td>${s.name}</td>
								<td>${s.stream}</td>
								<td>${s.city}</td>
								<td>
									<a href="delete/${s.id}"><i class="fa-sharp fa-solid fa-trash"></i></i></a>
									<a href="update/${s.id}"><i class="fa-solid fa-pen-to-square" style="margin-left:20px"></i></i></i></a>
								</td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
					<div class="container text-center">
						<a href="add-student" class="btn btn-outline-success">Add Student</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
