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
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css"/>
<title>UserCreate画面</title>


</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>UserCreate</p>
		</div>
		<div>
			<s:if test="errorMassage!=''">
				<s:property value="errorMassage" escape="false"/>
			</s:if>
		    <table>
		    <s:form action="UserCreateConfirmAction">
		    	<tr>
		    		<td>
		    			<label>ログインID:</label>
		    		</td>
		    		<td>
		    			<input type="text" name="loginUserId" value=""/>
		    		</td>
		    	</tr>
		    	<tr>
		    		<td>
		    			<label>ログインPASS:</label>
		    		</td>
                    <td>
                    	<input type="text" name="loginPassword" value=""/>
                    </td>
		    	</tr>
		    	<tr>
		    		<td>
		    			<label>ユーザー名:</label>
		    		</td>
		    		<td>
		    			<input type="text" name="userName" value =""/>
		    		</td>
		    	</tr>
		    	<s:submit class="btn" value="登録"/>
		    </s:form>
		    </table>
		    <div class="btn-wrapper">
		      <a href='<s:url action="#"/>' class="twitter">
              <span class="fa fa-twitter"> </span>
              twitterで登録
              </a>

		      <a href='<s:url action="#"/>' class="facebook">
              <span class="fa fa-facebook"> </span>
              Facebookで登録
              </a>
		    </div>


		    <div>
		    	<span>前画面に戻る場合は</span>
		        <a href='<s:url action="HomeAction"/>'>こちら</a>
		    </div>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>