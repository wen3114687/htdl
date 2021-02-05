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
		<h1 style="position: absolute;"></h1>
	</div>


	</div>
	<div data-options="region:'west',title:' ',split:true"
		style="width: 250px; overflow-x: hidden;">
		<div id="sm"></div>
	</div>
	<div id="tt" data-options="region:'center'" style="background: #eee;"
		class="easyui-tabs">
		<div title="欢迎页" style="padding: 20px; height: 100%; display: none;">欢迎访问</div>
	</div>
	<div data-options="region:'south'" style="height: 3%;" class="topBG"></div>
</body>


<script type="text/javascript">
	var data1 = [ {
		text : '系统管理',
		iconCls : 'icon-sum',
		state : 'open',
		children : [ {
			'text' : '系统配置',
			'iconCls' : 'icon-sum',
			'url' : '/functionManage/list'
		}, {
			text : '用户管理',
			url : '/roleManage/list'
		}, {
			text : '角色管理',
			url : '/roleManage/list'
		}, {
			text : '组织模型导入',
			url : '/roleManage/list'
		}, {
			text : '系统统计',
			url : '/roleManage/list'
		}, {
			text : '日志监控',
			url : '/roleManage/list'
		}, {
			text : '数据字典',
			children : [ {
				text : 'Option31'
			}, {
				text : 'Option32'
			} ]
		} ]
	}, {
		text : '物资品管理',
		iconCls : 'icon-more',
		children : [ {
			text : '入库登记',
			url : '/roleManage/list'
		}, {
			text : '设备管理',
			url : '/roleManage/list'
		}, {
			text : '仓库管理',
			url : '/roleManage/list'
		}, {
			text : '进出库登记',
			url : '/roleManage/list'
		} ]
	} ];
	
	

	$(function() {
		var data=${functionTree};
		$('#sm').sidemenu({
			data : data,
			width : 220,
			border : false,
			onSelect : function(o) {
				addTab(o);
			}
		});

		$('#tt').tabs({
			border : false,
			onSelect : function(title) {
				//alert(title+' is selected');
			}
		});

		$(window).resize(function() {
			// $("span").text(x+=1);
		});

	});

	function toggle() {
		var opts = $('#sm').sidemenu('options');
		$('#sm').sidemenu(opts.collapsed ? 'expand' : 'collapse');
		opts = $('#sm').sidemenu('options');
		$('#sm').sidemenu('resize', {
			width : opts.collapsed ? 60 : 200
		})
	}

	function addTab(item) {
		if ($('#tt').tabs('exists', item.name)) {
			$('#tt').tabs('select', item.name);
		} else {
			var content = '<iframe scrolling="auto" frameborder="0"  src="/htdlgs'
					+ item.name
					+ '" style="width:'
					+ ($(window).width() - 260) + 'px;height:'
					+ $(window).height() * 0.8 + 'px;"></iframe>';
			$('#tt').tabs('add', {
				title : item.name,
				content : content,
				closable : true
			});
		}
	}
	

</script>
</html>