<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../common_js.jsp"></jsp:include>
<script type="text/javascript">

$(function(){
	$(".delete").click(function(){
		if(confirm("真的要删除吗?")){
			var href=$(this).attr("href");
			$("#form_del").attr("action",href).submit();
		}
		return false;	  
	});
	
})
	

</script>
<title>list</title>
</head>
<body>
		<form id="form_del" action="" method="post">
			<input type="hidden" name="_method" value="DELETE">
		</form>
		
	
		<table id="rolelist" class="easyui-datagrid" title="角色" style="width:700px;height:250px">
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
					<td><a href="">编辑</a>&nbsp;<a class="delete" href="list/${role.id}">删除</a></td>
				</tr>
			
			</c:forEach>
			</tbody>
		</table>
		
		
		
</body>
</html>