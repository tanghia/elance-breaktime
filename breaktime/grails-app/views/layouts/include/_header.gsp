<nav class="navbar  navar-default navbar-inverse">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a href="index.html"> <img alt="Brand" class="navbar-brand"
				src="${resource(dir: 'images', file: 'BreakTime_logo.png')}" /></a>

		</div>
		<div class="navbar-collapse collapse navbar-right">
			<ul class="nav navbar-nav">
				<sec:ifLoggedIn>
					<li><a href="#"><span
							class="glyphicon glyphicon-user"></span> <sec:username /> </a></li>
					<li><a href="#"><span
							class="glyphicon  glyphicon-calendar"></span> My Room</a></li>
					<li><g:link controller="logout">
							<span class="glyphicon  glyphicon-log-out"></span>
							Logout</g:link></li>
				</sec:ifLoggedIn>
				<sec:ifNotLoggedIn>
				    <li><g:link controller="user" action="create"><span
							class="glyphicon glyphicon-registration-mark"></span> Register</g:link></li>
						<li><g:link controller="login"><span
							class="glyphicon glyphicon-log-in"></span>Login</g:link></li>	
				</sec:ifNotLoggedIn>
			</ul>
		</div>
	</div>
</nav>
