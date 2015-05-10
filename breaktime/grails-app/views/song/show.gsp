
<%@ page import="breaktime.Song" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'song.label', default: 'Song')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<g:link class="list btn btn-info" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link>
		<g:link class="create btn btn-info" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link>
		<div id="show-song" class="content scaffold-show" role="main">
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list song">
			
				<g:if test="${songInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="song.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${songInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${songInstance?.description}">
				<li class="fieldcontain">
					<span id="description-label" class="property-label"><g:message code="song.description.label" default="Description" /></span>
					
						<span class="property-value" aria-labelledby="description-label"><g:fieldValue bean="${songInstance}" field="description"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${songInstance?.url}">
				<li class="fieldcontain">
					<span id="url-label" class="property-label"><g:message code="song.url.label" default="Url" /></span>
					
						<span class="property-value" aria-labelledby="url-label"><g:fieldValue bean="${songInstance}" field="url"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${songInstance?.status}">
				<li class="fieldcontain">
					<span id="status-label" class="property-label"><g:message code="song.status.label" default="Status" /></span>
					
						<span class="property-value" aria-labelledby="status-label"><g:formatBoolean boolean="${songInstance?.status}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:songInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${songInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete btn btn-info" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
