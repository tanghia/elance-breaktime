
<%@ page import="breaktime.BreakTime" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'breakTime.label', default: 'BreakTime')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-breakTime" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-breakTime" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list breakTime">
			
				<g:if test="${breakTimeInstance?.time}">
				<li class="fieldcontain">
					<span id="time-label" class="property-label"><g:message code="breakTime.time.label" default="Time" /></span>
					
						<span class="property-value" aria-labelledby="time-label"><g:formatDate date="${breakTimeInstance?.time}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${breakTimeInstance?.restTime}">
				<li class="fieldcontain">
					<span id="restTime-label" class="property-label"><g:message code="breakTime.restTime.label" default="Rest Time" /></span>
					
						<span class="property-value" aria-labelledby="restTime-label"><g:fieldValue bean="${breakTimeInstance}" field="restTime"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${breakTimeInstance?.day}">
				<li class="fieldcontain">
					<span id="day-label" class="property-label"><g:message code="breakTime.day.label" default="Day" /></span>
					
						<span class="property-value" aria-labelledby="day-label"><g:link controller="day" action="show" id="${breakTimeInstance?.day?.id}">${breakTimeInstance?.day?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${breakTimeInstance?.image}">
				<li class="fieldcontain">
					<span id="image-label" class="property-label"><g:message code="breakTime.image.label" default="Image" /></span>
					
						<span class="property-value" aria-labelledby="image-label"><g:link controller="image" action="show" id="${breakTimeInstance?.image?.id}">${breakTimeInstance?.image?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${breakTimeInstance?.song}">
				<li class="fieldcontain">
					<span id="song-label" class="property-label"><g:message code="breakTime.song.label" default="Song" /></span>
					
						<span class="property-value" aria-labelledby="song-label"><g:link controller="song" action="show" id="${breakTimeInstance?.song?.id}">${breakTimeInstance?.song?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:breakTimeInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${breakTimeInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
