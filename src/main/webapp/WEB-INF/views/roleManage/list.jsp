<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../common/common_js.jsp"></jsp:include>
<script type="text/javascript">

$(function(){
	$(".delete").click(function(){
		if(confirm("真的要删除吗?")){
			var href=$(this).attr("href");
			$("#form_del").attr("action",href).submit();
		}
		return false;	  
	});
	
	
	$(".save").click(function(){
			var href=$(this).attr("href");
			$("#roleForm").attr("action",href).submit();
	});
	
	
	$(".edit").click(function(){
		var href=$(this).attr("href");
		$("#roleForm").attr("action",href).submit();
});
	
})
	

</script>
<title>list</title>
</head>
<body>
		<form id="form_del" action="" method="post">
			<input type="hidden" name="_method" value="DELETE">
		</form>
		
		
		
	
		<table id="rolelist" toolbar="#toolbar" class="easyui-datagrid" title="角色" style="width:700px" pagination="true"
            rownumbers="true" fitColumns="true" singleSelect="true">
			<thead>
				<tr>
					<th data-options="field:'id',width:80">ID</th>
					<th data-options="field:'rolename',width:100">ROLENAME</th>
					<th data-options="field:'auth'">AUTH </th>
					<th data-options="field:'description'">DESCRIPTION</th>
					<th data-options="field:'null'">操作</th>
					
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${rolelist}" var="role">
				<tr>
					<td>${role.id}</td>
					<td>${role.rolename}</td>
					<td>${role.auth}</td>
					<td>${role.description}</td>
					<td><a href="list/${role.id}" class="edit">编辑</a>&nbsp;<a class="delete" href="list/${role.id}">删除</a></td>
				</tr>
			
			</c:forEach>
			</tbody>
		</table>
		  <div id="toolbar">
		        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">New User</a>
		        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">Edit User</a>
		        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">Remove User</a>
		  </div>
		
		  <div id="dlg" class="easyui-dialog" style="width:400px" data-options="closed:true,modal:true,border:'thin',buttons:'#dlg-buttons'">
	        <form id="roleForm" method="post" novalidate style="margin:0;padding:20px 50px">
	            <h3>权限信息</h3>
	            <div style="margin-bottom:10px">
	                <input name="rolename" class="easyui-textbox" required="true" label="名称:" style="width:100%">
	            </div>
	            <div style="margin-bottom:10px">
	                <input class="easyui-radiobutton" name="auth" value="manager" label="类型:">管理员
	                <input class="easyui-radiobutton" name="auth" value="emp" >职员
	            </div>
	            <div style="margin-bottom:10px">
	                <input name="description" class="easyui-textbox" required="true" label="描述:" style="width:100%">
	            </div>
	        </form>
	    </div>
	    <div id="dlg-buttons">
	        <a href="list" class="easyui-linkbutton c6 save" iconCls="icon-ok"  style="width:90px">Save</a>
	        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')" style="width:90px">Cancel</a>
	    </div>
		
		<script type="text/javascript">
		function newUser(){
			$('#dlg').dialog('open').dialog('setTitle','新建');
			$('#fm').form('clear');
		}
		
		function editUser(){
			$('#dlg').dialog('open').dialog('setTitle','新建');
			$('#fm').form('clear');
		}
		
		
		</script>
</body>
</html>