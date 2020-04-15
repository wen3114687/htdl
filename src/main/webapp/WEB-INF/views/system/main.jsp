<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../common/common_js.jsp"></jsp:include>
<style type="text/css">
.topBG {
	background: #7F7FD5; /* fallback for old browsers */
	background: -webkit-linear-gradient(to right, #86A8E7, #7F7FD5);
	/* Chrome 10-25, Safari 5.1-6 */
	background: linear-gradient(to right, #86A8E7, #7F7FD5);
	/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
}
</style>
<title>main</title>
</head>

<body class="easyui-layout">
	<div data-options="region:'north'" style="height: 60px;" class="topBG">

		<h1 style="position: absolute;">xxxxx系统</h1>

	</div>


	</div>
	<div data-options="region:'west',title:' ',split:true"
		style="width: 210px;">
		<div id="sm" class="easyui-sidemenu" data-options="data:data"></div>

	</div>
	<div data-options="region:'center'" style="background: #eee;"
		class="easyui-tabs">
		<div title="欢迎页" style="padding: 20px; display: none;">欢迎访问</div>
		<div title="Tab2" data-options="closable:true"
			style="overflow: auto; padding: 20px; display: none;">tab2</div>
		<div title="Tab3" data-options="iconCls:'icon-reload',closable:true"
			style="padding: 20px; display: none;">tab3</div>


	</div>

	<div data-options="region:'south'" style="height: 3%;" class="topBG"></div>
</body>


<script type="text/javascript">
	$(function(){
		$('#sm').sidemenu({
			border:false
		});
		
	});

		var data = [{
	        text: '系统管理',
	        iconCls: 'icon-sum',
	        state: 'open',
	        children: [{
	            text: '系统配置',
	            iconCls: 'icon-sum'
	        },{
	            text: '用户管理'
	        },{
	            text: '组织模型导入'
	        },{
	            text: '系统统计'
	        },{
	            text: '日志监控'
	        },{
	            text: '数据字典',
	            children: [{
	                text: 'Option31'
	            },{
	                text: 'Option32'
	            }]
	        }]
	    },{
	        text: '物资品管理',
	        iconCls: 'icon-more',
	        children: [{
	            text: '入库登记'
	        },{
	            text: '设备管理'
	        },{
	            text: '仓库管理'
	        },{
	            text: '进出库登记'
	        }]
	    },{
	        text: '员工考勤',
	        iconCls: 'icon-more',
	        children: [{
	            text: '扫码考勤'
	        },{
	            text: '考勤汇总'
	        },{
	            text: '权限管理'
	        },{
	            text: '导出数据'
	        }]
	    },{
	        text: '员工工卡',
	        iconCls: 'icon-more',
	        children: [{
	            text: '员工信息管理'
	        },{
	            text: '员工成绩'
	        },{
	            text: '员工工作经历'
	        },{
	            text: '员工类型'
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
</html>