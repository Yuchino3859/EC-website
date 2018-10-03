<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<link rel="stylesheet" type="text/css" href="./css/style.css">
<meta http-equiv="Content-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<title>UserCreateConfirm画面</title>


</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
    <div id="main">
    	<div id="top">
    		<p>UserCreateConfirm</p>
    	</div>
    	<div>
    		<h3>登録する内容は以下でよろしいですか。</h3>
    		<table>
    		<s:form action="UserCreateCompleteAction">
    		<tr id="box">
    			<td>
    				<label>ログインID:</label>
    			</td>
    			<td>
    				<s:property value="loginUserId" escape="false"/>
    			</td>
    		</tr>
    		<tr id="box">
    			<td>
    				<label>ログインPASS:</label>
    			</td>
    			<td>
    				<s:property value="loginPassword" escape="false"/>
    			</td>
    		</tr>
    		<tr id="box">
    			<td>
    				<label>ユーザー名:</label>
    			</td>
    			<td>
    				<s:property value="userName" escape="false"/>
    			</td>
    		</tr>
    		<tr>
    			<td>
    				<s:submit class="btn" value="完了"/>
    			</td>
    		</tr>
    		</s:form>
    		</table>

    		<p>再設定は<a href='<s:url action="UserCreateAction"/>'>こちら</a></p>

    	</div>
    </div>
    <div id="footer">
    	<div id="pr">
    	</div>
    </div>
</body>
</html>