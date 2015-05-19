<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
  <meta charset="UTF-8">
  <title>Login</title>
    <link rel="stylesheet" href="/BankSample/css/main.css" media="screen" type="text/css" />
	<meta charset="utf-8">
	<title>z</title>
</head>
<%
	String msg = MiscUtil.trimUtil((String)request.getAttribute(MiscUtil.sessionScreenMessage));
	if (msg.length() == 0)
	{
		msg = "";
	}
	
%>
<body OnLoad="document.loginForm.Login.focus();">
	<div align="center" class="content">
		<%@ include file="includeHeader.jsp" %>
		<div class="search_field">
			<h3><%= msg %></h3>
		</div>
		<div class="subheader">
			<div class="left">
				<b>&nbsp; </b> 
			</div>
			<div  class="right">&nbsp;
			</div>
		</div>
		<br/>
		<div class="center">
			<div class="center_login">
				<form name="loginForm" action="/BankSample/Controller" method="post">
			         <p><div class="label">Debit Amount</div>
			         <input type="text" class="login"  required name="Amount"></p>
			         <p align="right"><input type="submit" class="button_quiz" value="Get Balance"></p>
				</form>
			</div>
		</div>	
		<div class="left_box">
			<p> </p>			
		</div>
	<%@ include file="includeFooter.jsp" %>	
	</div>	
</body>
</html>