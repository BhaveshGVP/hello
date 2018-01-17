<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="includes/header.jsp"%>
<div class="panel panel-primary">
	<div class="panel-heading">Please Sign UP</div>
	<div class="panel-body">
		<form>
			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label> <input
					type="email" class="form-control" id="exampleInputEmail1"
					placeholder="Email">
			</div>
			<div class="form-group">
				<label for="exampleInputName1">Name</label> <input type="text"
					class="form-control" id="exampleInputName1" placeholder="Name">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input
					type="password" class="form-control" id="exampleInputPassword1"
					placeholder="Password">
			</div>


			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</div>


<%@ include file="includes/footer.jsp"%>
