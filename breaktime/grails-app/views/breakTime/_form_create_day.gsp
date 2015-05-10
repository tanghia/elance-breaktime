<%@ page import="breaktime.Day"%>

<div
	class="fieldcontain ${hasErrors(bean: dayInstance, field: 'day', 'error')} required row">
	<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right">
		<label for="day"> <g:message code="day.day.label"
				default="Day" /> <span class="required-indicator">*</span>
		</label>
	</div>

	<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
		<g:datePicker name="day" precision="day"
			value="${dayInstance?.day}" />
	</div>
</div>

<div
	class="fieldcontain ${hasErrors(bean: dayInstance, field: 'startTime', 'error')} required  row">
	<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right">
	<label for="startTime"
		> <g:message
			code="day.startTime.label" default="Start Time" /> <span
		class="required-indicator">*</span>
	</label>
	</div>
	<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
		<g:datePicker name="startTime" precision="minute"
			value="${dayInstance?.startTime}"  />
	</div>
</div>

<div
	class="fieldcontain ${hasErrors(bean: dayInstance, field: 'finishTime', 'error')} required  row">
	<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right">
	<label for="finishTime"
		> <g:message
			code="day.finishTime.label" default="Finish Time" /> <span
		class="required-indicator">*</span>
	</label>
	</div>
	<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
		<g:datePicker name="finishTime" precision="minute"
			value="${dayInstance?.finishTime}" />
	</div>
</div>

<div
	class="fieldcontain ${hasErrors(bean: dayInstance, field: 'status', 'error')} row">
	<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right">
	<label for="status"> <g:message
			code="day.status.label" default="Status" />

	</label>
	</div>
	<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
		<g:checkBox name="status" value="${dayInstance?.status}" />
	</div>
</div>
<div class="fieldcontain ${hasErrors(bean: dayInstance, field: 'user', 'error')} required" hidden="hidden">
	<label for="user">
		<g:message code="day.user.label" default="User" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="user" name="user.id" from="${breaktime.User.list()}" optionKey="id" required="" value="${dayInstance?.user?.id}" class="many-to-one"/>

</div>


<script type="text/javascript">
	$("#startTime_day").attr("hidden","hidden")
	$("#startTime_month").attr("hidden", "hidden")
	$("#startTime_year").attr("hidden", "hidden")
	$("#finishTime_day").attr("hidden","hidden")
	$("#finishTime_month").attr("hidden", "hidden")
	$("#finishTime_year").attr("hidden", "hidden")
</script>