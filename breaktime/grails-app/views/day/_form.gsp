<%@ page import="breaktime.Day" %>



<div class="fieldcontain ${hasErrors(bean: dayInstance, field: 'day', 'error')} required">
	<label for="day">
		<g:message code="day.day.label" default="Day" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="day" precision="day"  value="${dayInstance?.day}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: dayInstance, field: 'startTime', 'error')} required">
	<label for="startTime">
		<g:message code="day.startTime.label" default="Start Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="startTime" precision="day"  value="${dayInstance?.startTime}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: dayInstance, field: 'finishTime', 'error')} required">
	<label for="finishTime">
		<g:message code="day.finishTime.label" default="Finish Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="finishTime" precision="day"  value="${dayInstance?.finishTime}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: dayInstance, field: 'status', 'error')} ">
	<label for="status">
		<g:message code="day.status.label" default="Status" />
		
	</label>
	<g:checkBox name="status" value="${dayInstance?.status}" />

</div>

<div class="fieldcontain ${hasErrors(bean: dayInstance, field: 'user', 'error')} required">
	<label for="user">
		<g:message code="day.user.label" default="User" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="user" name="user.id" from="${breaktime.User.list()}" optionKey="id" required="" value="${dayInstance?.user?.id}" class="many-to-one"/>

</div>

