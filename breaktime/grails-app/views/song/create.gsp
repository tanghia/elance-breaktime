<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'song.label', default: 'Song')}" />
<title><g:message code="default.create.label"
		args="[entityName]" /></title>
</head>
<body>
	<a class="home btn btn-info" href="${createLink(uri: '/')}"><g:message
			code="default.home.label" /></a>
	<g:link class="list btn btn-info" action="index">
			<g:message code="default.list.label" args="[entityName]" />
		</g:link>

		<div id="create-song" class="content scaffold-create" role="main">
			<g:if test="${flash.message}">
				<div class="message" role="status">
					${flash.message}
				</div>
			</g:if>
			<g:hasErrors bean="${songInstance}">
				<ul class="errors" role="alert">
					<g:eachError bean="${songInstance}" var="error">
						<li
							<g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message
								error="${error}" /></li>
					</g:eachError>
				</ul>
			</g:hasErrors>
			<g:form url="[resource:songInstance, action:'save']">
				<fieldset class="form">
					<g:render template="form" />
				</fieldset>
				<fieldset class="buttons ">
					<g:submitButton name="create" class="save btn btn-info"
						value="${message(code: 'default.button.create.label', default: 'Create')}" />
				</fieldset>
			</g:form>
		</div>
</body>
</html>
