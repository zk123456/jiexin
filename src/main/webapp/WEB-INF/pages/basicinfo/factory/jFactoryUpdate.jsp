<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../base.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
</head>
<body>
<form method="post">

<hr>
	<font color="blue"><b>隐藏区域</b></font>
<hr>

	<input type="hidden" name="id" value="${obj.id}"/>


<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
    <div id="navMenubar">
<ul>
<li id="save"><a href="#" onclick="formSubmit('update.action','_self');">确定</a></li>
<li id="back"><a href="list.action">返回</a></li>
</ul>
    </div>
</div>
</div>
</div>
     
<div class="textbox" id="centerTextbox">
    
    <div class="textbox-header">
    <div class="textbox-inner-header">
    <div class="textbox-title">
		修改XXX信息
    </div> 
    </div>
    </div>
<div>
 
<hr>
	<font color="blue"><b>内容区域，表格布局</b></font>
<hr>
 
    <div>
		<table class="commonTable" cellspacing="1">
	        <tr>
	            <td class="columnTitle_mustbe">厂家名称：</td>
	            <td class="columnTitle_mustbe">联系人：</td>
	            <td class="tableContent"><input type="text" name="contractor" value="${obj.contractor}"/></td>
	        </tr>
		</table>
	</div>
</div>
 
 
</form>
</body>
</html>

