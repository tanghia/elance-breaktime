<%@ page import="breaktime.Image" %>



<div class="fieldcontain ${hasErrors(bean: imageInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="image.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${imageInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: imageInstance, field: 'image', 'error')} required">
	<label for="image">
		<g:message code="image.image.label" default="Image" />
		<span class="required-indicator">*</span>
	</label>
	<input type="file" id="image" name="image" />

</div>

<div class="fieldcontain ${hasErrors(bean: imageInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="image.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" required="" value="${imageInstance?.title}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: imageInstance, field: 'description', 'error')} required">
	<label for="description">
		<g:message code="image.description.label" default="Description" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="description" required="" value="${imageInstance?.description}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: imageInstance, field: 'status', 'error')} ">
	<label for="status">
		<g:message code="image.status.label" default="Status" />
		
	</label>
	<g:checkBox name="status" value="${imageInstance?.status}" />

</div>

