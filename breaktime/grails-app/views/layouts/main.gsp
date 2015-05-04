<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title><g:layoutTitle default="Grails" /></title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${resource(dir: 'css', file: 'bootstrap.min.css')}"
	type="text/css">
<link href="${resource(dir: 'css', file: 'bootstrap-theme.min.css')}"
	rel="stylesheet">
<script type="text/javascript"
	src="${resource(dir: 'js', file: 'jquery-1.11.2.js')}"></script>
<script type="text/javascript"
	src="${resource(dir: 'js', file: 'bootstrap.min.js')}"></script>
<link
	href='http://fonts.googleapis.com/css?family=Lato&subset=latin,latin-ext'
	rel='stylesheet' type='text/css'>
<style type="text/css">
body {
	font-family: 'Lato', serif;
}
</style>

<g:layoutHead />
</head>
<body>
	<g:render template="/layouts/include/header" />
	<g:layoutBody />
	<g:render template="/layouts/include/footer" />
</body>
</html>
