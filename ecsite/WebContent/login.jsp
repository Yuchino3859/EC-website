<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<link rel="stylesheet" type="text/css" href="./css/style.css">
<meta http-equiv="Content-ScriptType" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<title>Login画面</title>


</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>Login</p>
		</div>
		<div>
			<h3>商品を購入する際はログインをお願いします。</h3>
			 <table>
			  <s:form action="LoginAction">
				<tr>
				 <td>
				  <label>ログインID:</label>
				 </td>
				 <td>
				  <input type="text" class="text" name="loginUserId"/>
			     </td>
			    </tr>
			    <tr>
			     <td>
			      <label>ログインPass:</label>
			     </td>
			     <td>
			      <input type="password" class="text" name="loginPassword"/>
			     </td>
			    </tr>
			    <s:submit class="btn" value="ログイン"/>
			   </s:form>
			 </table>
			<br/>
			<div id="text-link">
				<p>新規ユーザー登録は<a href='<s:url action="UserCreateAction"/>' >こちら</a></p>
                <p>Homeへ戻る場合は<a href='<s:url action="GoHomeAction"/>' >こちら</a></p>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>