
<%@ page import="breaktime.Song"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'song.label', default: 'Song')}" />
<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
<body>
	<div class="row">
		<a class="btn btn-info" href="${createLink(uri: '/')}"><g:message
				code="default.home.label" /></a>
		<g:link class="btn btn-info" action="create">
			<g:message code="default.new.label" args="[entityName]" />
		</g:link>

	</div>
	<div id="list-song" class="content scaffold-list" role="main">
		<g:if test="${flash.message}">
			<div class="message" role="status">
				${flash.message}
			</div>
		</g:if>
		<table class="table">
			<thead>
				<tr>

					<g:sortableColumn property="name"
						title="${message(code: 'song.name.label', default: 'Name')}" />

					<g:sortableColumn property="description"
						title="${message(code: 'song.description.label', default: 'Description')}" />

					<g:sortableColumn property="url"
						title="${message(code: 'song.url.label', default: 'Url')}" />

					<g:sortableColumn property="status"
						title="${message(code: 'song.status.label', default: 'Status')}" />

				</tr>
			</thead>
			<tbody>
				<g:each in="${songInstanceList}" status="i" var="songInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

						<td><g:link action="show" id="${songInstance.id}">
								${fieldValue(bean: songInstance, field: "name")}
							</g:link></td>

						<td>
							${fieldValue(bean: songInstance, field: "description")}
						</td>

						<td>
							${fieldValue(bean: songInstance, field: "url")}
						</td>

						<td><g:formatBoolean boolean="${songInstance.status}" /></td>

					</tr>
				</g:each>
			</tbody>
		</table>
		<div class="pagination">
			<g:paginate total="${songInstanceCount ?: 0}" />
		</div>
	</div>
</body>
</html>
