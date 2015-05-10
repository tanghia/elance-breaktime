<%@ page import="breaktime.Image"%>



<div
	class="fieldcontain ${hasErrors(bean: imageInstance, field: 'name', 'error')} required row">
	<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right">
		<label for="name"> <g:message code="image.name.label"
				default="Name" /> <span class="required-indicator">*</span>
		</label>
	</div>
	<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
		<g:textField name="name" required="" value="${imageInstance?.name}" />
	</div>
</div>

<div
	class="fieldcontain ${hasErrors(bean: imageInstance, field: 'image', 'error')} required row">
	<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right">
		<label for="image"> <g:message code="image.image.label"
				default="Image" /> <span class="required-indicator">*</span>
		</label>
	</div>
	<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
		<input type="file" id="image" name="image" />
	</div>
</div>

<div
	class="fieldcontain ${hasErrors(bean: imageInstance, field: 'title', 'error')} required row">
	<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right">
		<label for="title"> <g:message code="image.title.label"
				default="Title" /> <span class="required-indicator">*</span>
		</label>
	</div>
	<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
		<g:textField name="title" required="" value="${imageInstance?.title}" />
	</div>
</div>

<div
	class="fieldcontain ${hasErrors(bean: imageInstance, field: 'description', 'error')} required row">
	<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right">
		<label for="description"> <g:message
				code="image.description.label" default="Description" /> <span
			class="required-indicator">*</span>
		</label>
	</div>
	<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
		<g:textField name="description" required=""
			value="${imageInstance?.description}" />
	</div>
</div>

<div
	class="fieldcontain ${hasErrors(bean: imageInstance, field: 'status', 'error')} row">
	<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right">
		<label for="status"> <g:message code="image.status.label"
				default="Status" />

		</label>
	</div>
	<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
		<g:checkBox name="status" value="${imageInstance?.status}" />
	</div>
</div>

