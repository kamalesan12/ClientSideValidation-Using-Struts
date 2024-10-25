<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
<head>
<style>
		.error-message{
			color:red;
			font-weight:bold;
		}

</style>
</head>

<body>

<h1>EMPLOYEE REGISTERATION</h1>

<html:form action="reg">
<pre>

ID			:<html:text property="id_f"/><div class="error-message"><html:errors property="id_f"/></div> 
NAME			:<html:text property="name_f"/><div class="error-message"><html:errors property="name_f"/></div>

EMAIL			:<html:text property="email_f"/><div class="error-message"><html:errors property="email_f"/></div>

SALARY			:<html:text property="salary_f"/><div class="error-message"><html:errors property="salary_f"/></div>

CREDIT CARD NUMBER	:<html:text property="credit_f"/><div class="error-message"><html:errors property="credit_f"/></div>

PHONE NUMBER		:<html:text property="phone_f"/><div class="error-message"><html:errors property="phone_f"/></div>

		<html:submit value="Register"></html:submit>


</pre>
</html:form>

</body>
</html>