<%@ page import="breaktime.Slide"%>



<div
	class="fieldcontain ${hasErrors(bean: slideInstance, field: 'image', 'error')} required row">
	<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right">
		<label for="image"> <g:message code="slide.image.label"
				default="Image" /> <span class="required-indicator">*</span>
		</label>
	</div>
	<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
		<input type="file" id="image" name="image" />
	</div>
</div>

<div
	class="fieldcontain ${hasErrors(bean: slideInstance, field: 'title', 'error')} required row">
	<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right">
		<label for="title"> <g:message code="slide.title.label"
				default="Title" /> <span class="required-indicator">*</span>
		</label>
	</div>
	<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
		<g:textField name="title" required="" value="${slideInstance?.title}" />
	</div>
</div>

<div
	class="fieldcontain ${hasErrors(bean: slideInstance, field: 'content', 'error')} required row">
	<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right">
		<label for="content"> <g:message code="slide.content.label"
				default="Content" /> <span class="required-indicator">*</span>
		</label>
	</div>
	<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
		<g:textField name="content" required=""
			value="${slideInstance?.content}" />
	</div>
</div>

<%--<div
	class="fieldcontain ${hasErrors(bean: slideInstance, field: 'createdDate', 'error')} ">
	<label for="createdDate"> <g:message
			code="slide.createdDate.label" default="Created Date" />

	</label>
	<g:datePicker name="createdDate" precision="day"
		value="${slideInstance?.createdDate}" default="none"
		noSelection="['': '']" />

</div>

--%>
<div
	class="fieldcontain ${hasErrors(bean: slideInstance, field: 'status', 'error')} row">
	<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right">
		<label for="status"> <g:message code="slide.status.label"
				default="Status" />

		</label>
	</div>
	<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
		<g:checkBox name="status" value="${slideInstance?.status}" />
	</div>
</div>

