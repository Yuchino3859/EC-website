<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<link rel="stylesheet" type="text/css" href="./css/style.css">
<meta http-equiv="Content-Script-Type" content="text/script"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<title>MasterItemCreate画面</title>

</head>
<body>

<div id="header">
	<div id="pr">
	</div>
</div>
	<div id="main">
		<div id="top">
			<p>ItemCreate</p>
		</div>
		    <s:if test="errorMessage!=''">
				<s:property value="errorMessage" escape="false"/>
		    </s:if>
			<table>
			  <s:form action="MasterItemCreateConfirmAction">
				<tr>
					<td>
					  <label>商品名:</label>
					</td>
					<td>
					  <input type="text" name="itemName"/>
					</td>
				</tr>
				<tr>
					<td>
					  <label>値段:</label>
					</td>
					<td>
					 <input type="text" name="itemPrice"/>
					</td>
				</tr>
				  <tr>
					<td>
					  <label>個数:</label>
					</td>
					<td>
					 <input type="text" name="itemStock"/>
					</td>
				</tr>
				<s:submit class="btn" value="登録"/>
              </s:form>
			</table>
			 <div id="text-link">
                <p>Masterへ戻る場合は<a href='<s:url action="GoMasterAction"/>' >こちら</a></p>
			</div>
	</div>
  <div id="footer">
  	<div id="pr">
  	</div>
  </div>
</body>
</html>