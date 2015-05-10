<%@ page import="breaktime.BreakTime"%>



<div
	class="fieldcontain ${hasErrors(bean: breakTimeInstance, field: 'time', 'error')} required row">
	<div  class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right">
		<label for="time"> <g:message code="breakTime.time.label"
				default="Time" /> <span class="required-indicator">*</span>
		</label>
	</div>
	<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
		<g:datePicker name="time" precision="minute"
			value="${breakTimeInstance?.time}" />
	</div>
</div>

<div
	class="fieldcontain ${hasErrors(bean: breakTimeInstance, field: 'restTime', 'error')} required row">
	<div  class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right">
		<label for="restTime"> <g:message
				code="breakTime.restTime.label" default="Rest Time" /> <span
			class="required-indicator">*</span>
		</label>
	</div>
	<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
		<g:field name="restTime" type="number" min="1" max="30"
			value="${breakTimeInstance.restTime}" required="" /> <span> (Minute)</span>
	</div>
</div>

<div
	class="fieldcontain ${hasErrors(bean: breakTimeInstance, field: 'day', 'error')} required row">
	<div  class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right">
		<label for="day"> <g:message code="breakTime.day.label"
				default="Day" /> <span class="required-indicator">*</span>
		</label>
	</div>
	<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
		<g:select id="day" name="day.id" from="${breaktime.Day.list()}"
			optionKey="id" required="" value="${breakTimeInstance?.day?.id}"
			class="many-to-one" />
	</div>
</div>

<div
	class="fieldcontain ${hasErrors(bean: breakTimeInstance, field: 'image', 'error')} required row">
	<div  class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right">
		<label for="image"> <g:message code="breakTime.image.label"
				default="Image" /> <span class="required-indicator">*</span>
		</label>
	</div>
	<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
		<g:select id="image" name="image.id" from="${breaktime.Image.list()}"
			optionKey="id" required="" value="${breakTimeInstance?.image?.id}"
			class="many-to-one" />
	</div>
</div>

<div
	class="fieldcontain ${hasErrors(bean: breakTimeInstance, field: 'song', 'error')} required row">
	<div  class="col-lg-3 col-md-3 col-sm-3 col-xs-3 text-right">
		<label for="song"> <g:message code="breakTime.song.label"
				default="Song" /> <span class="required-indicator">*</span>
		</label>
	</div>
	<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
		<g:select id="song" name="song.id" from="${breaktime.Song.list()}"
			optionKey="id" required="" value="${breakTimeInstance?.song?.id}"
			class="many-to-one" />
	</div>
</div>
<script type="text/javascript">
	$("#time_day").attr("hidden","hidden")
	$("#time_month").attr("hidden", "hidden")
	$("#time_year").attr("hidden", "hidden")
</script>
