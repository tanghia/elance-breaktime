
<%@ page import="breaktime.Image" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'image.label', default: 'Image')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>

				<g:link class="list btn btn-info" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link>
				<g:link class="create btn btn-info" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link>

		<div id="show-image" class="content scaffold-show" role="main">
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list image">
			
				<g:if test="${imageInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="image.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${imageInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${imageInstance?.image}">
				<li class="fieldcontain">
					<span id="image-label" class="property-label"><g:message code="image.image.label" default="Image" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${imageInstance?.title}">
				<li class="fieldcontain">
					<span id="title-label" class="property-label"><g:message code="image.title.label" default="Title" /></span>
					
						<span class="property-value" aria-labelledby="title-label"><g:fieldValue bean="${imageInstance}" field="title"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${imageInstance?.description}">
				<li class="fieldcontain">
					<span id="description-label" class="property-label"><g:message code="image.description.label" default="Description" /></span>
					
						<span class="property-value" aria-labelledby="description-label"><g:fieldValue bean="${imageInstance}" field="description"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${imageInstance?.status}">
				<li class="fieldcontain">
					<span id="status-label" class="property-label"><g:message code="image.status.label" default="Status" /></span>
					
						<span class="property-value" aria-labelledby="status-label"><g:formatBoolean boolean="${imageInstance?.status}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:imageInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${imageInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete btn btn-info" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
