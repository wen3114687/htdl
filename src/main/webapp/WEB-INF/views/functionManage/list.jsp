<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="../common/common_js.jsp"%>
<title>list</title>
</head>
<body>
		<form id="form_del" action="" method="post">
			<input type="hidden" name="_method" value="DELETE">
		</form>
		
		<form id="form_update" action="" method="post">
			<input type="hidden" name="_method" value="DELETE">
		</form>
	
		
		  <div id="toolbar">
		        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">新建角色</a>
		  </div>
		
		  <div id="dlg" class="easyui-dialog" style="width:400px" data-options="closed:true,modal:true,border:'thin',buttons:'#dlg-buttons'">
	        <form id="roleForm" method="POST" novalidate style="margin:0;padding:20px 50px" onsubmit="document.charset='utf-8'">
	            <h3>权限信息</h3>
	            <div style="margin-bottom:10px">
	            	<input id="id" type="hidden" name="id">
	            	<label for="rolename">Rolname:</label>
	                <input id="rolename" name="rolename" >
	            </div>
	            <div style="margin-bottom:10px">
	                <label for="auth">auth:</label>
	                <input id="emp" type="radio" name="auth" value="emp"/>职员
	                <input id="manager"  type="radio" name="auth" value="manager"/>管理员
	            </div>
	            <div style="margin-bottom:10px">
	                <!-- <input id="description" name="description" class="easyui-textbox" required="true" label="描述:" style="width:100%"> -->
	            	<label for="description">description:</label>
	            	<input id="description" name="description">
	            
	            </div>
	        </form>
	    </div>
	    <div id="dlg-buttons">
	        <button class="easyui-linkbutton c6 save" iconCls="icon-ok" style="width:90px" >Save</button>
	        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')" style="width:90px">Cancel</a>
	    </div>
		
		<script type="text/javascript">
		
		$(document).ready(function(){
				
				$(".edit").click(function(){
					var colId=$(this).attr("value");
					$('#dlg').dialog('open').dialog('setTitle','编辑');
					$('#roleForm').form('clear');
					$("#_method").val("PUT");
					$.ajax({
						type : "GET",
						contentType: "application/json;charset=UTF-8",
						url :"list/"+colId,
						success : function(result) {
							fillText(result);
			            },
			            //请求失败，包含具体的错误信息
			            error : function(e){
			                console.log(e.status);
			                console.log(e.responseText);
			            }
						
					});
					
			  });
				
				$(".delete").click(function(){
					if(confirm("真的要删除吗?")){
						var colId=$(this).attr("value");
						$("#form_del").attr("action","list/"+colId).submit();
					}
					return false;	  
				});
				
				
				$(".save").click(function(){
						var url="list";
						 if($("#id").val()!=""){
							$("#_method").val("PUT");
							url=url+"/"+$("#id").val();
						}
						$("#roleForm").attr("action",url).submit();
				});
				
		});
		
		function fillText(result){
			for(var key in result.roleEnitiy){
				if(key=="auth"){
					$('input:radio[name="auth"][value="'+result.roleEnitiy[key]+'"]').prop('checked', true);
				}else{
					$("input[name="+key+"]").val(result.roleEnitiy[key]);
				}
			}
		}
		
		
		function newUser(){
			$('#dlg').dialog('open').dialog('setTitle','新建');
			$('#roleForm').form('clear');
			$('input:radio[name="auth"][value="emp"]').prop('checked', true);
		}
		
		
		
		
		</script>
</body>
</html>