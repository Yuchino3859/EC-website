<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>宛先情報入力</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<div id="contents">
<h1>宛先情報入力画面</h1>
<s:if test="!#session.familyNameErrorMessageList.isEmpty()">
 <div class="error">
  <div class="error-message">
   <s:iterator value="#session.familyNameErrorMessageList"><s:property /><br></s:iterator>
  </div>
 </div>
</s:if>
<s:if test="!#session.firstNameErrorMessageList.isEmpty()">
<div class="errror">
 <div class="error-message">
  <s:iterator value="#session.firstNameErrorMessageList"><s:property /><br></s:iterator>
 </div>
</div>
</s:if>
<s:if test="!#session.familyNameKanaErrorMessageList.isEmpty()">
 <div class="error">
  <div class="error-message">
   <s:iterator value="#session.familyNameKanaErrorMessageList"><s:property /><br></s:iterator>
  </div>
 </div>
</s:if>
<s:if test="!#session.firstNameKanaErrorMessageList.isEmpty()">
 <div class="error">
  <div class="error-message">
   <s:iterator value="#session.firstNameKanaErrorMessageList"><s:property /><br></s:iterator>
  </div>
 </div>
</s:if>
<s:if test="!#session.emailErrorMessageList.isEmpty()">
 <div class="error">
  <div class="error-message">
   <s:iterator value="#session.emailErrorMessageList"><s:property /><br></s:iterator>>
  </div>
 </div>
</s:if>
<s:if test="!#session.telNumberErrorMessageList.isEmpty()">
 <div class="error">
  <div class="error-messsage">
   <s:iterator value="#session.teNumberErrorMessageList"><s:property /><br></s:iterator>
  </div>
 </div>
</s:if>
<s:if test="!#session.userAddressErrorMessageList.isEmpty()">
 <div class="error">
  <div class="error-message">
   <s:iterator value="#session.userAddressErrorMessageList"><s:property /><br></s:iterator>
  </div>
 </div>
</s:if>
<s:form action="CreateDestinationConfirmAction">
 <table>
  <tr>
   <th scope="row"><s:label value="姓"/></th>
   <td><s:textfield name="familyName" class="txt" /></td>
  </tr>
  <tr>
   <th scope="row"><s:label value="名"/></th>
   <td><s:textfield name="firstName" class="txt" /></td>
  </tr>
  <tr>
   <th scope="row"><s:label value="姓ふりがな"/></th>
   <td><s:textfield name="familyNamekana" class="txt" /></td>
  </tr>
  <tr>
   <th scope="row"><s:label value="名ふりがな"/></th>
   <td><s:textfield name="firstNameKana" class="txt" /></td>
  </tr>
  <tr>
   <th scope="row"><s:label value="性別"/></th>
   <td><s:radio name="sex" list="sexList" value="defaultSexValue" label="性別" placeholder="性別" /></td>
  </tr>
  <tr>
   <th scope="row"><s:label value="住所"/></th>
   <td><s:textfield name="userAddress" class="txt" /></td>
  </tr>
  <tr>
   <th scope="row"><s:label value="電話番号"/></th>
   <td><s:textfield name="telNumber" class="txt" /></td>
  </tr>
  <tr>
   <th scope="row"><s:label velue="メールアドレス"/></th>
   <td><s:textfield name="email" class="txt" /></td>
  </tr>
 </table>
 <div class="submit_btn_box">
  <div id=".contents-btn-set">
   <s:submit value="宛先情報確認" class="submit_btn" />
  </div>
 </div>
</s:form>
</div>
<s:include value="footer.jsp"/>
</body>
</html>