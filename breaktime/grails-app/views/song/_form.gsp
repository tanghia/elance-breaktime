<%@ page import="breaktime.Song" %>



<div class="fieldcontain ${hasErrors(bean: songInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="song.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${songInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: songInstance, field: 'description', 'error')} required">
	<label for="description">
		<g:message code="song.description.label" default="Description" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="description" required="" value="${songInstance?.description}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: songInstance, field: 'url', 'error')} required">
	<label for="url">
		<g:message code="song.url.label" default="Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="url" required="" value="${songInstance?.url}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: songInstance, field: 'status', 'error')} ">
	<label for="status">
		<g:message code="song.status.label" default="Status" />
		
	</label>
	<g:checkBox name="status" value="${songInstance?.status}" />

</div>

