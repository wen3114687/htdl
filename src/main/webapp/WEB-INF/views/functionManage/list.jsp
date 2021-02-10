<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="../common/common_js.jsp"%>
<link rel="stylesheet" type="text/css" href="<%=contextPath %>/ztree/zTreeStyle/zTreeStyle.css" />
<script type="text/javascript" src="<%=contextPath %>/js/jquery.ztree.all.min.js"></script>
<title>ztree</title>

	<SCRIPT type="text/javascript">
	
		function zTreeOnClick(event, treeId, treeNode) {
			if(!treeNode.isParent){
				alert(treeNode.isParent);
			}
		};
		var setting = {
			callback: {
				onClick: zTreeOnClick
			}
		};
		var data=${functionTree};

		$(document).ready(function(){
			$.fn.zTree.init($("#treeDemo"), setting, data);
		});
		//
	</SCRIPT>
</HEAD>

<BODY>

<div class="content_wrap">

	<div class="easyui-layout" style="width:1200px;height:600px;">
		<div data-options="region:'west',split:true,iconCls:'icon-tip'" title=" " style="width:250px;">
			<div class="zTreeDemoBackground left">
				<ul id="treeDemo" class="ztree"></ul>
			</div>
		</div>
		<div data-options="region:'center',title:'Main Title',iconCls:'icon-ok'">
			<form id="functionForm" method="POST" novalidate style="margin:0;padding:20px 50px" onsubmit="document.charset='utf-8'">
				<h3>功能信息</h3>
				<div style="margin-bottom:10px">
					<input id="id" type="hidden" name="id">
					<label for="name">name:</label>
					<input id="name" name="name" >
				</div>

				<div style="margin-bottom:10px">
					<label for="parentid">parentid:</label>
					<input id="parentid" name="parentid">
				</div>
				<div style="margin-bottom:10px">
					<label for="weight">weight:</label>
					<input id="weight" name="weight">
				</div>
				<div style="margin-bottom:10px">
					<label for="icon">icon:</label>
					<input id="icon" name="icon">
				</div>
				<div style="margin-bottom:10px">
					<label for="path">path:</label>
					<input id="path" name="path">
				</div>
			</form>

			<div id="dlg-buttons">
				<button class="easyui-linkbutton c6 save" iconCls="icon-ok" style="width:90px" >保存</button>
			</div>
		</div>
	</div>
</div>

<script type="text/javascript">

	$(document).ready(function(){


		$(".save").click(function(){
			alert(1);
			var url="list";

			$("#functionForm").attr("action",url).submit();
		});

	});
</script>
</BODY>
</html>