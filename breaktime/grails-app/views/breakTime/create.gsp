<%@ page import="breaktime.Day"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'breakTime.label', default: 'BreakTime')}" />
<title><g:message code="default.create.label"
		args="[entityName]" /></title>

</head>
<body>

	<div class="row">
		<div id="create-breakTime"
			class="content scaffold-create col-lg-4 col-md-4 col-sm-4 col-xs-12"
			role="main">
			<div id="create-day" class="content scaffold-create row" role="main">
				<h1>
					<g:message code="default.create.label" args="[entityName]" />
				</h1>
				<g:if test="${flash.message}">
					<div class="message" role="status">
						${flash.message}
					</div>
				</g:if>
				<g:hasErrors bean="${dayInstance}">
					<ul class="errors" role="alert">
						<g:eachError bean="${dayInstance}" var="error">
							<li
								<g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message
									error="${error}" /></li>
						</g:eachError>
					</ul>
				</g:hasErrors>
				<g:form controller="day" url="[resource:dayInstance, action:'save']">
					<fieldset class="form">
						<g:render template="form_create_day" />
					</fieldset>
					<fieldset class="buttons">
						<g:submitButton name="create" class="save"
							value="${message(code: 'default.button.create.label', default: 'Create')}" />
					</fieldset>
				</g:form>
			</div>
			<div class="row">
				<h1>
					<g:message code="default.create.label" args="[entityName]" />
				</h1>
				<g:if test="${flash.message}">
					<div class="message" role="status">
						${flash.message}
					</div>
				</g:if>
				<g:hasErrors bean="${breakTimeInstance}">
					<ul class="errors" role="alert">
						<g:eachError bean="${breakTimeInstance}" var="error">
							<li
								<g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message
									error="${error}" /></li>
						</g:eachError>
					</ul>
				</g:hasErrors>
				<g:form url="[resource:breakTimeInstance, action:'save']">
					<fieldset class="form">
						<g:render template="form" />
					</fieldset>
					<fieldset class="buttons">
						<g:submitButton name="create" class="save"
							value="${message(code: 'default.button.create.label', default: 'Create')}" />
					</fieldset>
				</g:form>
			</div>
		</div>
		<div id="list-day" class="col-lg-8 col-md-8 col-sm-8 col-xs-12">
			<g:if test="${flash.message}">
				<div class="message" role="status">
					${flash.message}
				</div>
			</g:if>
			<table class="table">
				<thead>
					<tr>

						<g:sortableColumn property="day"
							title="${message(code: 'day.day.label', default: 'Day')}" />
						<th><span>Break Times</span></th>
						<g:sortableColumn property="startTime"
							title="${message(code: 'day.startTime.label', default: 'Start Time')}" />

						<g:sortableColumn property="finishTime"
							title="${message(code: 'day.finishTime.label', default: 'Finish Time')}" />

						<g:sortableColumn property="status"
							title="${message(code: 'day.status.label', default: 'Status')}" />

					</tr>
				</thead>
				<tbody>
					<g:each in="${dayInstanceList}" status="i" var="dayInstance">
						<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

							<td><g:formatDate format="yyyy-MM-dd"
									date="${dayInstance.day}" /></td>
							<td><div class="dropdown">
									<button class="btn btn-default dropdown-toggle" type="button"
										id="dropdownMenu1" data-toggle="dropdown" aria-expanded="true">
										List of Break Times <span class="caret"></span>
									</button>
									<ul class="dropdown-menu" role="menu"
										aria-labelledby="dropdownMenu1">
										<li role="presentation"><a role="menuitem" tabindex="-1"
											href="#">Action</a></li>
										<li role="presentation"><a role="menuitem" tabindex="-1"
											href="#">Another action</a></li>
										<li role="presentation"><a role="menuitem" tabindex="-1"
											href="#">Something else here</a></li>
										<li role="presentation"><a role="menuitem" tabindex="-1"
											href="#">Separated link</a></li>
									</ul>
								</div></td>
							<td><g:formatDate format="HH:mm"
									date="${dayInstance.startTime}" /></td>

							<td><g:formatDate format="hh:mm"
									date="${dayInstance.finishTime}" /></td>

							<td><button class="btn btn-success"
									onclick="checkTime(${dayInstance.id})">Apply</button></td>
							<g:each in="${dayInstance.breaktimes}" status="k" var="breaktime">
								<input type="hidden" id="${dayInstance.id}_${k}"
									value='{"time":"${breaktime.time.toString()}","duration":"${breaktime.restTime}","url":"${HtmlUtils.htmlEscape(breaktime.song.url)}","title":"${breaktime.image.title }","image":"${breaktime.image.image.encodeBase64()}", "description":"${breaktime.image.description}" }' />
							</g:each>
						</tr>
					</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${dayInstanceCount ?: 0}" />
			</div>
		</div>
	</div>

	<script type="text/javascript">
function timer(id){
	$("input[id^='"+id+"']").each(function(){
		
		    var now=new Date();
			var data=JSON.parse(this.value)
			var referenceDate=Date.parse(data.time)
			console.log(now)
			console.log(referenceDate)
			console.log(data.duration)
			console.log(Date.parse(data.time)+(data.duration)*60*1000)
			console.log((Date.parse(data.time)+(data.duration)*60*1000) - now)
			if((Date.parse(data.time)+(data.duration)*60*1000) - now >0 && referenceDate - now <0){
			$("#url").html(unescape(data.url))
			$("breaktime_image").attr("src","data:image/png;base64,"+data.image)
			$("#title").text(data.title)
			$("#description").text(data.description)
			//$("#popup").css({"display":"block"})
			
    $('#myInput').focus()})
			
		}

	)
}
function checkTime(id){
	var myVar = setInterval(function () {timer(id)}, 10000);
}

</script>
	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Modal title</h4>
				</div>
				<div class="modal-body">
					<div class="row">
						<div class="col-lg-6 col-xd-6 col-sm-6 col-xs-12" id="url"></div>
						<div class="col-lg-6 col-xd-6 col-sm-6 col-xs-12">
							<div class="row">
								<div class="thumbnail">
									<img id="breaktime_image" alt="...">
									<div class="caption">
										<h3 id="title"></h3>
										<p id="description"></p>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
