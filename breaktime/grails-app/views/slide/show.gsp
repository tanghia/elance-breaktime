
<%@ page import="breaktime.Slide" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'slide.label', default: 'Slide')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-slide" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-slide" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list slide">
			
				<g:if test="${slideInstance?.image}">
				<li class="fieldcontain">
					<span id="image-label" class="property-label"><g:message code="slide.image.label" default="Image" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${slideInstance?.title}">
				<li class="fieldcontain">
					<span id="title-label" class="property-label"><g:message code="slide.title.label" default="Title" /></span>
					
						<span class="property-value" aria-labelledby="title-label"><g:fieldValue bean="${slideInstance}" field="title"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${slideInstance?.content}">
				<li class="fieldcontain">
					<span id="content-label" class="property-label"><g:message code="slide.content.label" default="Content" /></span>
					
						<span class="property-value" aria-labelledby="content-label"><g:fieldValue bean="${slideInstance}" field="content"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${slideInstance?.createdDate}">
				<li class="fieldcontain">
					<span id="createdDate-label" class="property-label"><g:message code="slide.createdDate.label" default="Created Date" /></span>
					
						<span class="property-value" aria-labelledby="createdDate-label"><g:formatDate date="${slideInstance?.createdDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${slideInstance?.status}">
				<li class="fieldcontain">
					<span id="status-label" class="property-label"><g:message code="slide.status.label" default="Status" /></span>
					
						<span class="property-value" aria-labelledby="status-label"><g:formatBoolean boolean="${slideInstance?.status}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:slideInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${slideInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
