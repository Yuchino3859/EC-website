<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<link rel="stylesheet" type="text/css" href="./css/style.css">
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>


<title>Home画面</title>



</head>
<body>
	<div id="header">
			<div id="pr">
			</div>
	</div>
	<div id="main">
			<div id="top">
				<p>Home</p>
			</div>
			<div class="text-center">
			    <s:form action="HomeAction">
			     <s:submit class="btn" value="ログインへ"/>
			    </s:form>
			</div>
	</div>
	<div id="footer">
		<div id="pr">
	    </div>
	</div>

</body>
</html>