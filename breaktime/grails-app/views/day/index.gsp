
<%@ page import="breaktime.Day" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'day.label', default: 'Day')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-day" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-day" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="day" title="${message(code: 'day.day.label', default: 'Day')}" />
					
						<g:sortableColumn property="startTime" title="${message(code: 'day.startTime.label', default: 'Start Time')}" />
					
						<g:sortableColumn property="finishTime" title="${message(code: 'day.finishTime.label', default: 'Finish Time')}" />
					
						<g:sortableColumn property="status" title="${message(code: 'day.status.label', default: 'Status')}" />
					
						<th><g:message code="day.user.label" default="User" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${dayInstanceList}" status="i" var="dayInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${dayInstance.id}">${fieldValue(bean: dayInstance, field: "day")}</g:link></td>
					
						<td><g:formatDate date="${dayInstance.startTime}" /></td>
					
						<td><g:formatDate date="${dayInstance.finishTime}" /></td>
					
						<td><g:formatBoolean boolean="${dayInstance.status}" /></td>
					
						<td>${fieldValue(bean: dayInstance, field: "user")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${dayInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
