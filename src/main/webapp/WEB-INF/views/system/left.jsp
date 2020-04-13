<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../common/common_js.jsp"></jsp:include>
<title>left</title>
</head>

<body>
	<h2>Basic SideMenu</h2>
	<p>Collapse the side menu to display the main icon.</p>
	<div style="margin:20px 0;">
		<a href="javascript:;" class="easyui-linkbutton" onclick="toggle()">Toggle</a>
	</div>
	<div id="sm" class="easyui-sidemenu" data-options="data:data"></div>
	<script type="text/javascript">
		var data = [{
	        text: 'Item1',
	        iconCls: 'icon-sum',
	        state: 'open',
	        children: [{
	            text: 'Option1'
	        },{
	            text: 'Option2'
	        },{
	            text: 'Option3',
	            children: [{
	                text: 'Option31'
	            },{
	                text: 'Option32'
	            }]
	        }]
	    },{
	        text: 'Item2',
	        iconCls: 'icon-more',
	        children: [{
	            text: 'Option4'
	        },{
	            text: 'Option5'
	        },{
	            text: 'Option6'
	        }]
	    }];

		function toggle(){
			var opts = $('#sm').sidemenu('options');
			$('#sm').sidemenu(opts.collapsed ? 'expand' : 'collapse');
			opts = $('#sm').sidemenu('options');
			$('#sm').sidemenu('resize', {
				width: opts.collapsed ? 60 : 200
			})
		}
	</script>
</body>


<script type="text/javascript">

</script>
</html>