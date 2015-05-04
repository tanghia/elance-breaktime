
<a class="brand" href="#">Student Attendance System</a>
	<ul class="nav nav-pills pull-right">
		<li class="active"><a href='/'>Home</a></li>
		<sec:ifLoggedIn>
			<sec:ifAllGranted roles="ROLE_ADMIN">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">PROGRAM<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><g:link controller="program">
								<span>Program</span>
							</g:link></li>
						<li><g:link controller="course">
								<span>Course</span>
							</g:link></li>
						<li><g:link controller="programCourse">
								<span>Program & Course</span>
							</g:link></li>
					</ul></li>
			</sec:ifAllGranted>
			<sec:ifAnyGranted
				roles="ROLE_ADMIN,ROLE_TUTOR,ROLE_COURSECOORDINATOR">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">USER<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<sec:ifAnyGranted roles="ROLE_COURSECOORDINATOR,ROLE_ADMIN">
							<li><g:link controller="student">
									<span>Student</span>
								</g:link></li>
							<li>
							<li><g:link controller="studentCourse">
									<span>Student & Course</span>
								</g:link></li>
							<li>
						</sec:ifAnyGranted>
						<sec:ifAnyGranted roles="ROLE_ADMIN,ROLE_TUTOR">
							<li><g:link controller="studentAttendant">
									<span>Student Attendant</span>
								</g:link></li>
						</sec:ifAnyGranted>

						<sec:ifAnyGranted roles="ROLE_ADMIN">
							<li><g:link controller="staff">
									<span>Staff</span>
								</g:link></li>
							<li><g:link controller="tutor">
									<span>Tutor</span>
								</g:link></li>
							<li><g:link controller="courseCoordinator">
									<span>Course Coordinator</span>
								</g:link></li>
						</sec:ifAnyGranted>
					</ul></li>
			</sec:ifAnyGranted>

			<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">REPORT<b class="caret"></b></a>
				<ul class="dropdown-menu">
					<sec:ifAnyGranted
						roles="ROLE_ADMIN,ROLE_TUTOR,ROLE_STAFF,ROLE_STUDENT">
						<li><g:link controller="teachingReport"
								action="tutorCheckAttendantReport">
								<span>Staff Attendant report</span>
							</g:link></li>
						<li><g:link controller="teachingReport"
								action="studentAttendantReport">
								<span>Student Attendant report</span>
							</g:link></li>
					</sec:ifAnyGranted>
				</ul></li>

			<sec:ifAllGranted roles="ROLE_ADMIN">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">SECURITY<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><g:link controller="role">
								<span>Role</span>
							</g:link></li>
						<li><g:link controller="requestmap">
								<span>Access Permission</span>
							</g:link></li>

					</ul></li>
			</sec:ifAllGranted>
			<sec:ifAnyGranted roles="ROLE_COURSECOORDINATOR,ROLE_ADMIN">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">CONTENT<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><g:link controller="teachingSession">
								<span>Teaching Session</span>
							</g:link></li>
						<li><g:link controller="place">
								<span>Infrastructure</span>
							</g:link></li>
						<li><g:link controller="sessionPlace">
								<span>Session & Place</span>
							</g:link></li>
					</ul></li>
			</sec:ifAnyGranted>
			<li><g:link controller="logout">
					<span>Welcome <sec:username /> (Logout)
					</span>
				</g:link></li>
		</sec:ifLoggedIn>
		<sec:ifNotLoggedIn>
			<li class="last login"><g:link controller="login">
					<span>Login</span>
				</g:link></li>
		</sec:ifNotLoggedIn>
	</ul>