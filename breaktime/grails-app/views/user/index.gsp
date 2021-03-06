
<%@ page import="breaktime.User"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'user.label', default: 'User')}" />
<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
<body>
	<div id="list-user" class="content scaffold-list" role="main">
		<g:if test="${flash.message}">
			<div class="message" role="status">
				${flash.message}
			</div>
		</g:if>
		<table class="table">
			<thead>
				<tr>

					<g:sortableColumn property="username"
						title="${message(code: 'user.username.label', default: 'Username')}" />

					<g:sortableColumn property="password"
						title="${message(code: 'user.password.label', default: 'Password')}" />

					<g:sortableColumn property="photo"
						title="${message(code: 'user.photo.label', default: 'Photo')}" />

					<g:sortableColumn property="description"
						title="${message(code: 'user.description.label', default: 'Description')}" />

					<g:sortableColumn property="phoneNumber"
						title="${message(code: 'user.phoneNumber.label', default: 'Phone Number')}" />

					<g:sortableColumn property="createdDate"
						title="${message(code: 'user.createdDate.label', default: 'Created Date')}" />

				</tr>
			</thead>
			<tbody>
				<g:each in="${userInstanceList}" status="i" var="userInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

						<td>
							${fieldValue(bean: userInstance, field: "username")}
						</td>

						<td>
							${fieldValue(bean: userInstance, field: "password")}
						</td>

						<td><g:if test="${userInstance.photo}">
								<img class="media-object img-circle"
									src="data:image/png;base64,${userInstance.photo?.encodeBase64()}"
									alt="...">
							</g:if> <g:else>
								<img class="media-object img-circle"
									src="${resource(dir: 'images', file: 'User_Circle.png')}"
									alt="..." width="100" height="100">
							</g:else></td>

						<td>
							${fieldValue(bean: userInstance, field: "description")}
						</td>

						<td>
							${fieldValue(bean: userInstance, field: "phoneNumber")}
						</td>

						<td><g:formatDate date="${userInstance.createdDate}" /></td>

					</tr>
				</g:each>
			</tbody>
		</table>
		<div class="pagination">
			<g:paginate total="${userInstanceCount ?: 0}" />
		</div>
	</div>
</body>
</html>
