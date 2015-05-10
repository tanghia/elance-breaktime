
<%@ page import="breaktime.Slide" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'slide.label', default: 'Slide')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<div class="nav" role="navigation">
				<a class="btn btn-info" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<g:link class="btn btn-info" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link>
		</div>
		<div id="list-slide" class="content scaffold-list" role="main">
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table class="table">
			<thead>
					<tr>
					
						<g:sortableColumn property="image" title="${message(code: 'slide.image.label', default: 'Image')}" />
					
						<g:sortableColumn property="title" title="${message(code: 'slide.title.label', default: 'Title')}" />
					
						<g:sortableColumn property="content" title="${message(code: 'slide.content.label', default: 'Content')}" />
					
						<g:sortableColumn property="createdDate" title="${message(code: 'slide.createdDate.label', default: 'Created Date')}" />
					
						<g:sortableColumn property="status" title="${message(code: 'slide.status.label', default: 'Status')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${slideInstanceList}" status="i" var="slideInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${slideInstance.id}"><img src="data:image/png;base64,${slideInstance.image.encodeBase64() }" height="150" width="200" /></g:link></td>
					
						<td>${fieldValue(bean: slideInstance, field: "title")}</td>
					
						<td>${fieldValue(bean: slideInstance, field: "content")}</td>
					
						<td><g:formatDate date="${slideInstance.createdDate}" /></td>
					
						<td><g:formatBoolean boolean="${slideInstance.status}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${slideInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
