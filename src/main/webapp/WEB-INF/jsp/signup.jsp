<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<jsp:directive.include file = "includes/header.jsp" />
<s:url value="/leaveType" var="fetchLeaveType" />


<body onload=setDefaultValue("${fetchLeaveType}")>
<div class="panel panel-primary">
	<div class="panel-heading">Leave Application</div>
	<div class="panel-body">
		<form method="POST">
			<div class="form-group">
				<label for="leaveType"
					>Select Leave Type<font
					color="red">*</font></label>
			
					<select id="leaveType" name="leaveType" class="form-control input-sm select-control-width" >
										</select>
					<form:errors id="mtaTechnician_billing_country_errors"
						path="country" cssClass="label label-danger" />
			
			</div>
			<div class="form-group">
				<label for="exampleInputName1">Name</label> <input type="text"
					name="name" class="form-control" id="exampleInputName1"
					placeholder="Name" />
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input
					name="password" type="password" class="form-control"
					id="exampleInputPassword1" placeholder="Password" />
			</div>


			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</div>

</body>
<%@ include file="includes/footer.jsp"%>
