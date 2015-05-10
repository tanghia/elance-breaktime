<%@ page import="breaktime.Song"%>



<div
	class="fieldcontain ${hasErrors(bean: songInstance, field: 'name', 'error')} required row">
	<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right">
		<label for="name"> <g:message code="song.name.label"
				default="Name" /> <span class="required-indicator">*</span>
		</label>
	</div>
	<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
		<g:textField name="name" required="" value="${songInstance?.name}" />
	</div>
</div>

<div
	class="fieldcontain ${hasErrors(bean: songInstance, field: 'description', 'error')} required row">
	<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right">
		<label for="description"> <g:message
				code="song.description.label" default="Description" /> <span
			class="required-indicator">*</span>
		</label>
	</div>
	<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
		<g:textField name="description" required=""
			value="${songInstance?.description}" />
	</div>
</div>

<div
	class="fieldcontain ${hasErrors(bean: songInstance, field: 'url', 'error')} required row">
	<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right">
		<label for="url"> <span
				>Embedded Code</span><span class="required-indicator">*</span>
		</label>
	</div>
	<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
		<g:textField name="url" required="" value="${songInstance?.url}" />
	</div>
</div>

<div
	class="fieldcontain ${hasErrors(bean: songInstance, field: 'status', 'error')} row">
	<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right">
		<label for="status"> <g:message code="song.status.label"
				default="Status" />

		</label>
	</div>
	<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
		<g:checkBox name="status" value="${songInstance?.status}" />
	</div>
</div>

