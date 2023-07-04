<%@ include file="common/header.jspf" %>
	<%@ include file="common/navigation.jspf" %>
	<div class="container">
		<h1>New ToDos</h1>
		<form:form method="post" modelAttribute="todo">
Description:<form:input type="text" path="description"
				required="required" />
			<form:input type="hidden" path="id" />
			<form:input type="hidden" path="done" />
			<input type="Submit" class="btn btn-success">
		</form:form>
	</div>
</body>
</html>

