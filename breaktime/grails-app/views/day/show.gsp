
<%@ page import="breaktime.Day" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'day.label', default: 'Day')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-day" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-day" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list day">
			
				<g:if test="${dayInstance?.day}">
				<li class="fieldcontain">
					<span id="day-label" class="property-label"><g:message code="day.day.label" default="Day" /></span>
					
						<span class="property-value" aria-labelledby="day-label"><g:formatDate date="${dayInstance?.day}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${dayInstance?.startTime}">
				<li class="fieldcontain">
					<span id="startTime-label" class="property-label"><g:message code="day.startTime.label" default="Start Time" /></span>
					
						<span class="property-value" aria-labelledby="startTime-label"><g:formatDate date="${dayInstance?.startTime}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${dayInstance?.finishTime}">
				<li class="fieldcontain">
					<span id="finishTime-label" class="property-label"><g:message code="day.finishTime.label" default="Finish Time" /></span>
					
						<span class="property-value" aria-labelledby="finishTime-label"><g:formatDate date="${dayInstance?.finishTime}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${dayInstance?.status}">
				<li class="fieldcontain">
					<span id="status-label" class="property-label"><g:message code="day.status.label" default="Status" /></span>
					
						<span class="property-value" aria-labelledby="status-label"><g:formatBoolean boolean="${dayInstance?.status}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${dayInstance?.user}">
				<li class="fieldcontain">
					<span id="user-label" class="property-label"><g:message code="day.user.label" default="User" /></span>
					
						<span class="property-value" aria-labelledby="user-label"><g:link controller="user" action="show" id="${dayInstance?.user?.id}">${dayInstance?.user?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:dayInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${dayInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
