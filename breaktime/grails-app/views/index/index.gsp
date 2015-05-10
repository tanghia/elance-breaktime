<%@ page import="breaktime.User"%>
<%@ page import="breaktime.Slide"%>

<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main" />
</head>
<body>
	<div class="container-fluid">

		<div class=" col-lg-9 col-md-9 col-sm-12 col-xs-12 hidden-xs ">
			<div id="introduce" class="carousel slide" data-ride="carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<g:each var="i" in="${(0..< slideInstanceCount) }">
					<g:if test="${i==0 }">
						<li data-target="#carousel-example-generic" data-slide-to="${i}"
							class="active"></li>
					</g:if>
					<g:else>
						<li data-target="#carousel-example-generic" data-slide-to="${i}"></li>
					</g:else>
					</g:each>
				</ol>

				<!-- Wrapper for slides -->
				<div class="carousel-inner" role="listbox">
					<g:each in="${slideInstanceList}" var="slide" status="i">
						<g:if test="${i==0}">
							<div class="item active">
								<img src="data:image/png;base64,${slide.image?.encodeBase64()}"
									class="img-rounded" alt="${slide.title}">

								<div class="carousel-caption">
									<h3>
										${slide.title}
									</h3>

									<p>
										${slide.content}
									</p>
								</div>
							</div>
						</g:if>
						<g:else>
							<div class="item">
								<img src="data:image/png;base64,${slide.image?.encodeBase64()}"
									class="img-rounded" alt="${slide.title}">

								<div class="carousel-caption">
									<h3>
										${slide.title}
									</h3>

									<p>
										${slide.content}
									</p>
								</div>
							</div>
						</g:else>
					</g:each>
				</div>

				<!-- Controls -->
				<a class="left carousel-control" href="#introduce" role="button"
					data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a> <a class="right carousel-control" href="#introduce" role="button"
					data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
			</div>
		</div>
		<div class="list-group col-lg-3 col-md-3 col-xs-12 col-sm-12">
			<a href="#" class="list-group-item active">
				<h4 class="list-group-item-heading">Welcome New Members!</h4>
			</a>

			<g:each in="${userInstanceList}" status="i" var="user">

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
						${user.days.size() }
						points
					</div>

				</div>

			</g:each>
		</div>
	</div>
</body>
</html>
