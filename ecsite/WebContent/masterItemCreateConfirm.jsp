<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<link rel="stylesheet" type="text/css" href="./css/style.css">
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<title>MasterItemCreateConfirm画面</title>
</head>

<body>

<div id="header">
	<div id="pr">
	</div>
</div>
	<div id="main">
		<div id="top">
			<p>MasterItemCreateConfirm</p>
		</div>
		<div>
			<h3>登録する内容は以下でよろしいですか。</h3>
		    <table>
		    	<s:form action="MasterItemCreateCompleteAction">
		    	<tr>
		    	 <td>
		    	 	<label>商品名:</label>
		    	 </td>
		    	 <td>
		    	 	<s:property value="itemName" escape="false"/>
		    	 </td>
		    	</tr>
		    	<tr>
		    	 <td>
		    	 	<label>値段:</label>
		    	 </td>
		    	 <td>
		    	 	<s:property value="itemPrice" escape="false"/>
		    	 </td>
		    	</tr>
		    	<tr>
		    	 <td>
		    	 	<label>個数:</label>
		    	 </td>
		    	 <td>
		    	 	<s:property value="itemStock" escape="false"/>
		    	 </td>
		    	</tr>
		    	<tr>
		    	 <td>
		    	   <s:submit class="btn" value="確定"/>
		    	 </td>
		    	</tr>
		    	</s:form>
		    </table>
		    <p>再設定は<a href='<s:url action="MasterAction"/>'>こちら</a></p>

		</div>
	</div>
    <div id="footer">
     <div id="pr">
     </div>
    </div>
</body>
</html>