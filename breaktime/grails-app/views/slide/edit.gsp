<%@ page import="breaktime.Slide" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'slide.label', default: 'Slide')}" />
		<title><g:message code="default.edit.label" args="[entityName]" /></title>
	</head>
	<body>

				<g:link class="list  btn btn-info" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link>
				<g:link class="create  btn btn-info" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link>
			
		<div id="edit-slide" class="content scaffold-edit" role="main">

			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="${slideInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${slideInstance}" var="error">
				<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
				</g:eachError>
			</ul>
			</g:hasErrors>
			<g:form url="[resource:slideInstance, action:'update']" method="PUT"  enctype="multipart/form-data">
				<g:hiddenField name="version" value="${slideInstance?.version}" />
				<fieldset class="form">
					<g:render template="form"/>
				</fieldset>
				<fieldset class="buttons">
					<g:actionSubmit class="save  btn btn-info" action="update" value="${message(code: 'default.button.update.label', default: 'Update')}" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
