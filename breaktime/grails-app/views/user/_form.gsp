<%@ page import="breaktime.User"%>


<div
	class="fieldcontain ${hasErrors(bean: userInstance, field: 'fullName', 'error')} form-group">
	<label for="fullName"> <span>Full Name</span>

	</label>
	<g:field type="text" id="fullName" class="form-control" name="fullName"
		required="" value="${userInstance?.fullName}" />

</div>
<div
	class="fieldcontain ${hasErrors(bean: userInstance, field: 'username', 'error')} required form-group">
	<label for="username"> <span>Email</span> <span
		class="required-indicator">*</span>
	</label>
	<g:field type="email" class="form-control" name="username" required=""
		value="${userInstance?.username}" />
</div>

<div
	class="fieldcontain ${hasErrors(bean: userInstance, field: 'password', 'error')} required form-group">
	<label for="password"> <g:message code="user.password.label"
			default="Password" /> <span class="required-indicator">*</span>
	</label>
	<g:passwordField name="password" type="password" class="form-control"
		required="" value="${userInstance?.password}" />

</div>

<%--<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'fullName', 'error')} form-group">
	<label for="fullName">
		<span>Full Name</span>
		
	</label>
	<g:field type="text" id="fullName" class="form-control" name="fullName" required="" value="${userInstance?.fullName}" />

</div>

--%>
<%--<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="user.description.label" default="Description" />
		
	</label>
	<g:textField name="description" value="${userInstance?.description}"/>

</div>

--%>
<div
	class="fieldcontain ${hasErrors(bean: userInstance, field: 'phoneNumber', 'error')} form-group">
	<label for="phoneNumber"> <g:message
			code="user.phoneNumber.label" default="Phone Number" />

	</label>
	<g:textField name="phoneNumber" class="form-control"
		value="${userInstance?.phoneNumber}" />

</div>

<%--<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'createdDate', 'error')} ">
	<label for="createdDate">
		<g:message code="user.createdDate.label" default="Created Date" />
		
	</label>
	<g:datePicker name="createdDate" precision="day"  value="${userInstance?.createdDate}" default="none" noSelection="['': '']" />

</div>

--%>
<%--<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'accountExpired', 'error')} ">
	<label for="accountExpired">
		<g:message code="user.accountExpired.label" default="Account Expired" />
		
	</label>
	<g:checkBox name="accountExpired" value="${userInstance?.accountExpired}" />

</div>

--%>
<%--<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'accountLocked', 'error')} ">
	<label for="accountLocked">
		<g:message code="user.accountLocked.label" default="Account Locked" />
		
	</label>
	<g:checkBox name="accountLocked" value="${userInstance?.accountLocked}" />

</div>

--%>
<div
	class="fieldcontain ${hasErrors(bean: userInstance, field: 'address', 'error')} required form-group">
	<label for="address"> <g:message code="user.address.label"
			default="Address" /> <span class="required-indicator">*</span>
	</label>
	<g:textField name="address" class="form-control" required=""
		value="${userInstance?.address}" />

</div>
<%--<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'enabled', 'error')} ">
	<label for="enabled">
		<g:message code="user.enabled.label" default="Enabled" />
		
	</label>
	<g:checkBox name="enabled" value="${userInstance?.enabled}" />

</div>

--%>
<%--<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'passwordExpired', 'error')} ">
	<label for="passwordExpired">
		<g:message code="user.passwordExpired.label" default="Password Expired" />
		
	</label>
	<g:checkBox name="passwordExpired" value="${userInstance?.passwordExpired}" />

</div>

--%>