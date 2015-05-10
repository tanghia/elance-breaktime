
<%@ page import="breaktime.GroovySearchObject" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<title>search</title>
	</head>
	<body>
		<div class="list-group col-lg-4 col-md-4 col-sm-4 col-xs-12 col-lg-offset-4 col-md-offset-4 col-sm-offset-4">
			<a href="#" class="list-group-item active">
				<h4 class="list-group-item-heading">Found Users...</h4>
			</a>

			<g:each in="${searchInstanceList}" status="i" var="user">

				<div class="media">

					<div class="media-left">
						<a href="#"> <g:if test="${user.photo}">
								<img class="media-object img-circle"
									src="data:image/png;base64,${user.photo?.encodeBase64()}"
									alt="...">
							</g:if> <g:else>
								<img class="media-object img-circle"
									src="${resource(dir: 'images', file: 'User_Circle.png')}"
									alt="..." width="100" height="100">
							</g:else>

						</a>
					</div>
					<div class="media-body">
						<h4 class="media-heading">
							${user.fullName}
						</h4>
						<span>Rest Time: </span><span>${user.restTime } hours</span><br/>
						<span>Working Time: </span><span>${user.workingTime } hours</span>
					</div>

				</div>

			</g:each>
		</div>
	</body>
</html>
