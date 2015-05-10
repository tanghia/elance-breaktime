<%@ page import="breaktime.Day"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'day.label', default: 'Day')}" />
<title><g:message code="default.edit.label" args="[entityName]" /></title>
</head>
<body>
	
	<g:link class="create btn btn-info" action="create ">
		<g:message code="Create BreakTime" args="[entityName]" />
	</g:link>
	<div id="edit-day" class="content scaffold-edit" role="main">
		<g:if test="${flash.message}">
			<div class="message" role="status">
				${flash.message}
			</div>
		</g:if>
		<g:hasErrors bean="${dayInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${dayInstance}" var="error">
					<li
						<g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message
							error="${error}" /></li>
				</g:eachError>
			</ul>
		</g:hasErrors>
		<g:form url="[resource:dayInstance, action:'update']" method="PUT">
			<g:hiddenField name="version" value="${dayInstance?.version}" />
			<fieldset class="form">
				<g:render template="form" />
			</fieldset>
			<fieldset class="buttons">
				<g:actionSubmit class="save btn btn-info" action="update"
					value="${message(code: 'default.button.update.label', default: 'Update')}" />
			</fieldset>
		</g:form>
	</div>
</body>
</html>
