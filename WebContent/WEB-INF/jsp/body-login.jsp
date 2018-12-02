<div class="modal-header">

	<h4 class="modal-title">Login to Continue</h4>
</div>
<div class="modal-body" style="margin-left:35%;margin-right:35%">
	<div class="login-w3ls">
		<form id="signin" action="${pageContext.request.contextPath}/DoLogin" method="post">
			<label>User Id </label> <input type="text" name="userid"
				placeholder="User Id" required=""> <label>Password</label>
			<input type="password" name="password" placeholder="Password"
				required="">
			<div class="w3ls-loginr">
				
			</div>
			<div class="clearfix"></div>
			<input type="submit" name="submit" value="Login">
			<div class="clearfix"></div>
		</form>
	</div>
</div>