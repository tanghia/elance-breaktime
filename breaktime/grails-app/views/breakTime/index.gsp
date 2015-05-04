
<%@ page import="breaktime.BreakTime" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'breakTime.label', default: 'BreakTime')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-breakTime" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-breakTime" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="time" title="${message(code: 'breakTime.time.label', default: 'Time')}" />
					
						<g:sortableColumn property="restTime" title="${message(code: 'breakTime.restTime.label', default: 'Rest Time')}" />
					
						<th><g:message code="breakTime.day.label" default="Day" /></th>
					
						<th><g:message code="breakTime.image.label" default="Image" /></th>
					
						<th><g:message code="breakTime.song.label" default="Song" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${breakTimeInstanceList}" status="i" var="breakTimeInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${breakTimeInstance.id}">${fieldValue(bean: breakTimeInstance, field: "time")}</g:link></td>
					
						<td>${fieldValue(bean: breakTimeInstance, field: "restTime")}</td>
					
						<td>${fieldValue(bean: breakTimeInstance, field: "day")}</td>
					
						<td>${fieldValue(bean: breakTimeInstance, field: "image")}</td>
					
						<td>${fieldValue(bean: breakTimeInstance, field: "song")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${breakTimeInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
