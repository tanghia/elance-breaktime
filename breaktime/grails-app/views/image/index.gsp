
<%@ page import="breaktime.Image" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'image.label', default: 'Image')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<div class="row">
				<a class="btn btn-info" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a>
				<g:link class="btn btn-info" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link>
		</div>
		<div id="list-image" class="content scaffold-list" role="main">
			
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table class="table">
			<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'image.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="image" title="${message(code: 'image.image.label', default: 'Image')}" />
					
						<g:sortableColumn property="title" title="${message(code: 'image.title.label', default: 'Title')}" />
					
						<g:sortableColumn property="description" title="${message(code: 'image.description.label', default: 'Description')}" />
					
						<g:sortableColumn property="status" title="${message(code: 'image.status.label', default: 'Status')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${imageInstanceList}" status="i" var="imageInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${imageInstance.id}">${fieldValue(bean: imageInstance, field: "name")}</g:link></td>
					
						<td>
						  <img height="150" width="200" alt="" src="data:image/png;base64,${imageInstance.image.encodeBase64()}">
						</td>
					
						<td>${fieldValue(bean: imageInstance, field: "title")}</td>
					
						<td>${fieldValue(bean: imageInstance, field: "description")}</td>
					
						<td><g:formatBoolean boolean="${imageInstance.status}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${imageInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
