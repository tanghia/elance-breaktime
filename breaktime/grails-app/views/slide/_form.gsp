<%@ page import="breaktime.Slide" %>



<div class="fieldcontain ${hasErrors(bean: slideInstance, field: 'image', 'error')} required">
	<label for="image">
		<g:message code="slide.image.label" default="Image" />
		<span class="required-indicator">*</span>
	</label>
	<input type="file" id="image" name="image" />

</div>

<div class="fieldcontain ${hasErrors(bean: slideInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="slide.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" required="" value="${slideInstance?.title}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: slideInstance, field: 'content', 'error')} required">
	<label for="content">
		<g:message code="slide.content.label" default="Content" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="content" required="" value="${slideInstance?.content}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: slideInstance, field: 'createdDate', 'error')} ">
	<label for="createdDate">
		<g:message code="slide.createdDate.label" default="Created Date" />
		
	</label>
	<g:datePicker name="createdDate" precision="day"  value="${slideInstance?.createdDate}" default="none" noSelection="['': '']" />

</div>

<div class="fieldcontain ${hasErrors(bean: slideInstance, field: 'status', 'error')} ">
	<label for="status">
		<g:message code="slide.status.label" default="Status" />
		
	</label>
	<g:checkBox name="status" value="${slideInstance?.status}" />

</div>

