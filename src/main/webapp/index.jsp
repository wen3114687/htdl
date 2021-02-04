<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/views/common/common_js.jsp"></jsp:include>
<meta charset="utf-8">
<title>测试页面</title>
</head>
<body>

<!-- 	<form action="system/login" method="post">
	<label accesskey="loginname">登录名：</label>
		<input type="text" name="loginname"><br>
		
		<label accesskey="password">密码：</label>
		<input type="text" name="password"><br>
		<input type="submit" value="提交">
	</form>	 -->


	<a href="userManage/saveUser?name=admin">saveUser</a>
	<a href="roleManage/list">roleManage</a>
	
	<h2>标题</h2>
  
    <div style="margin:20px 0;"></div>
    <div class="easyui-panel" title="New Topic" style="width:100%;max-width:400px;padding:30px 60px;">
        <form id="ff" action="system/login" method="post">
            <div style="margin-bottom:20px">
                <input class="easyui-textbox"  name="loginname" style="width:100%" data-options="label:'用户名:'">
            </div>
        
            <div style="margin-bottom:20px">
            	<input class="easyui-passwordbox" name="password"  iconWidth="28" style="width:100%;" data-options="label:'密码:'">
        	</div>
           <input  class="easyui-linkbutton" type="submit" style="width:80px;height: 30px;" value="提交">
        </form>
        <!-- <div style="text-align:center;padding:5px 0">
        	
            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">提交</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()" style="width:80px">清除</a>
        </div> -->
    </div>
    <script>
        function submitForm(){
            $('#ff').form('submit');
        }
        function clearForm(){
            $('#ff').form('clear');
        }
    </script>
	
</body>
</html>