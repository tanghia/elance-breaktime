<nav class="navbar  navar-default navbar-inverse">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<g:link controller="index" action="index">
				<img alt="Brand" class="navbar-brand"
					src="${resource(dir: 'images', file: 'BreakTime_logo.png')}" />
			</g:link>

		</div>
		<div class="navbar-collapse collapse navbar-right">
			<ul class="nav navbar-nav">
				<sec:ifLoggedIn>
					<li><a href="#"><span class="glyphicon glyphicon-user"></span>
							<sec:username /> </a></li>

					<sec:ifAllGranted roles="ROLE_ADMIN">
						<li><g:link controller="slide" action="index">
								<span class="glyphicon  glyphicon-play"></span> Slide</g:link></li>
						<li><g:link controller="song" action="index">
								<span class="glyphicon  glyphicon-music"></span> Songs</g:link></li>
						<li><g:link controller="image" action="index">
								<span class="glyphicon  glyphicon-picture"></span> Pictures</g:link></li>
						<li><g:link controller="user" action="index">
								<span class="glyphicon  glyphicon-record"></span> Users</g:link></li>
					</sec:ifAllGranted>
					<li><g:link controller="breakTime" action="create">
							<span class="glyphicon  glyphicon-calendar"></span> My BreakTime</g:link></li>
					<li><g:link controller="logout">
							<span class="glyphicon  glyphicon-log-out"></span>
							Logout</g:link></li>
				</sec:ifLoggedIn>

				<sec:ifNotLoggedIn>
					<li><g:link controller="user" action="create">
							<span class="glyphicon glyphicon-registration-mark"></span> Register</g:link></li>
					<li><g:link controller="login">
							<span class="glyphicon glyphicon-log-in"></span>Login</g:link></li>
				</sec:ifNotLoggedIn>
				<li>
				<g:form class="form-group" style="width:200px" method="GET" controller="search">
				     <div class="input-group input-group-xs">
						<input type="text" name="q" class="form-control"
							placeholder="search member" aria-describedby="search-addon-01" />
						<span class="input-group-addon glyphicon glyphicon-search"
							id="search-addon-01"></span>
					</div>
				</g:form>
				</li>
			</ul>
		</div>
	</div>
</nav>
