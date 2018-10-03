<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<link rel="stylesheet" type="text/css" href="./css/tablestyle.css">
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<title>MyPage画面</title>

</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
	    <div id="top">
			<p>ItemList</p>
		</div>
	   <div>

			<h3>アイテムリストは以下になります。</h3>
		    <table border="1">
		    <tr>
		    	<th>id</th>
		    	<th>商品名</th>
		    	<th>値段</th>
		    	<th>在庫</th>
		    	<th>追加日</th>
		    	<th>商品詳細</th>
		    </tr>
		    <s:iterator value="#session.masterItemListDTOList" status="pageNo">
		    	<tr>
		    		<td><s:property value="itemId"/></td>
		    		<td><s:property value="itemName"/></td>
		    		<td><s:property value="itemPrice"/><span>円</span></td>
		    		<td><s:property value="itemStock"/><span>個</span></td>
		    		<td><s:property value="insert_date"/></td>
		    		<td><a href='<s:url action="MasterItemDetailsAction"><s:param name='itemId' value='%{itemId}'/></s:url>'>商品詳細</a></td>

		    	</tr>
		    </s:iterator>
		      </table>
		<div id="text-right">
		    <p>Masterへ戻る場合は<a href='<s:url action="GoMasterAction"/>' >こちら</a></p>
			<p>Homeへ戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
		</div>
	   </div>
	</div>
    <div id="footer">
     <div id="pr">
     </div>
    </div>
</body>
</html>