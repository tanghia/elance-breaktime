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
		<p class="text-center">
			Your total working time:
			${workingTime}
			hours
		</p>
		<p class="text-center">
			Your total rest time:
			${restTime}
			hours
		</p>
	</div>
	<div>
		<div id="create-breakTime"
			class="content scaffold-create col-lg-5 col-md-5 col-sm-5 col-xs-12"
			role="main">
			<div class="row">
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
				<g:form controller="day" url="[resource:dayInstance, action:'save']"
					role="form" class="row">
					<fieldset class="form">
						<legend>Create Day</legend>
						<g:render template="form_create_day" />
					</fieldset>
					<fieldset class="buttons">
						<div class="row">
							<div
								class="col-lg-10 col-md-10 col-sm-10 col-xs-12 col-lg-offset-2 col-md-offset-2 col-sm-offset-2">
								<g:submitButton name="create" class="save btn btn-info"
									params="[from:'breaktime']"
									value="${message(code: 'default.button.create.label', default: 'Create')}" />
							</div>
						</div>

					</fieldset>
				</g:form>
			</div>
			<div class="row">
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
						<legend>Create time to break</legend>
						<g:render template="form" />
					</fieldset>
					<fieldset class="buttons">
						<div class="row">
							<div
								class="col-lg-10 col-md-10 col-sm-10 col-xs-12 col-lg-offset-2 col-md-offset-2 col-sm-offset-2">
								<g:submitButton params="[from:'breaktime']" name="create"
									class="save btn btn-info"
									value="${message(code: 'default.button.create.label', default: 'Create')}" />
							</div>
						</div>
					</fieldset>
				</g:form>
			</div>
		</div>
		<div id="list-day" class="col-lg-7 col-md-7 col-sm-7 col-xs-12">
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
						<th><span>Details</span></th>

					</tr>
				</thead>
				<tbody>
					<g:each in="${dayInstanceList}" status="i" var="dayInstance">
						<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

							<td><g:formatDate format="yyyy-MM-dd"
									date="${dayInstance.day}" /></td>
							<td><g:link controller="breakTime" action="index"
									params="[dayId:dayInstance.id]">View (${dayInstance.breaktimes.size()})</g:link>
							</td>
							<td><g:formatDate format="HH:mm a"
									date="${dayInstance.startTime}" /></td>

							<td><g:formatDate format="hh:mm a"
									date="${dayInstance.finishTime}" /></td>

							<td><button class="btn btn-success"
									onclick="checkTime(${dayInstance.id})">Apply</button></td>
							<g:each in="${dayInstance.breaktimes}" status="k" var="breaktime">
								<input type="hidden" id="${dayInstance.id}_${k}"
									value='{"time":"${breaktime.time.toString()}","duration":"${breaktime.restTime}","url":"${HtmlUtils.htmlEscape(breaktime.song.url)}","title":"${breaktime.image.title }","image":"${breaktime.image.image.encodeBase64()}", "description":"${breaktime.image.description}" }' />
							</g:each>
							<td><g:link controller="day" action="show"
									params="[from:'breaktime']" id="${dayInstance.id}">Edit</g:link></td>
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
	var myVar
function timer(id){

	var videoId=""
    var flag=false
    $("input[id^='"+id+"']").each(function(){

	        var now=new Date();
			var data=JSON.parse(this.value)
			var referenceDate=Date.parse(data.time)
			var youtubeUrl=data.url
			var patt=/v=/g
			
			while(patt.test(youtubeUrl)==true){
		              videoId=youtubeUrl.substring(patt.lastIndex,youtubeUrl.length)
			}
			var embeddedCode="<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/"+videoId+"?enablejsapi=1&amp;rel=0&amp;autoplay=1\" frameborder=\"0\" allowfullscreen></iframe>"
			
			if(((referenceDate+(data.duration)*60*1000) - now) >0 && ((referenceDate - now) < 0)){
				 
					
			//alert(decodeURIComponent(data.url))
			//var string=$.parseHTML(data.url)[0]
			console.log(videoId)
			
			//console.log(string.data)
			//string=string.substring(1,string.length-2)
			//console.log(string)
			//$("#url").html(string.data)
			$("#url").html(embeddedCode)
			$("#breaktime_image").attr("src","data:image/png;base64,"+data.image)
			$("#title").text(data.title)
			$("#description").text(data.description)
			//$("#popup").css({"display":"block"})
			stopPlay()
			 $('#myModal').modal('show');
			 clearInterval(myVar) 
			 setTimeout(function(){ checkTime(id) }, (data.duration)*60*1000);
			 return
	     	 }     	 
	})
}

function checkTime(id){
 myVar = setInterval(function () {timer(id)}, 10000);
}

function stopPlay(state) {
    // if state == 'hide', hide. Else: show video
    var div = document.getElementById("url");
    var iframe = div.getElementsByTagName("iframe")[0].contentWindow;
    div.style.display = state == 'hide' ? 'none' : '';
    func = state == 'hide' ? 'pauseVideo' : 'playVideo';
    iframe.postMessage('{"event":"command","func":"' + func + '","args":""}', '*');
}

</script>
	<!-- Modal -->
	<div class="modal fade bs-example-modal-lg" id="myModal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog  modal-lg">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" onclick="stopPlay('hide')" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel"></h4>
				</div>
				<div class="modal-body">
					<div class="row">
						<div class="col-lg-6 col-xd-6 col-sm-6 col-xs-12"
							style="overflow: scroll;" id="url"></div>
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
					<button type="button" class="btn btn-default" onclick="stopPlay('hide')" data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
