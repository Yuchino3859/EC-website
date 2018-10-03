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
<meta name="description"content=""/>
<meta name="keywords" content=""/>

<title>MasterItemCreateComplete画面</title>


</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>MasterItemCreateComplete</p>
		</div>
		<div>
			<h3>商品登録が完了致しました。</h3>
			<div id="text-link">
			    <p>商品一覧は<a href='<s:url action="MasterItemListAction"/>' >こちら</a></p>
                <p>Masterへ戻る場合は<a href='<s:url action="GoMasterAction"/>' >こちら</a></p>
                <p>Homeは<a href='<s:url action="GoHomeAction"/>' >こちら</a></p>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>