
    
<%
	String contextPath=request.getContextPath();
	//替代 ${pageContext.request.contextPath }写法；
	//js和css是不能放在WEB-INFX下的。否则会访问不到
%>
<link rel="stylesheet" type="text/css" href="<%=contextPath %>/easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="<%=contextPath %>/easyui/themes/icon.css" />

<script type="text/javascript" src="<%=contextPath %>/easyui/jquery.min.js"></script>
<script type="text/javascript" src="<%=contextPath %>/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=contextPath %>/easyui/easyui-lang-zh_CN.js"></script>
<%-- <script type="text/javascript" src="<%=contextPath %>/js/common.js"></script> --%>
