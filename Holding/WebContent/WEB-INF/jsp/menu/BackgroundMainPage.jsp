<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="basePath" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>后台管理</title>
<link rel="stylesheet"
	href="${basePath }/js/plugins/layui/css/layui.css" media="all">
<script type="text/javascript"  src="${basePath }/js/jquery-3.3.1.js"></script>
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<div class="layui-header">
			<div class="layui-logo">管理员界面</div>
			<ul class="layui-nav layui-layout-right">
				<li class="layui-nav-item"><a href="javascript:;"> <img
						src="http://t.cn/RCzsdCq" class="layui-nav-img"> 贤心
				</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="">基本资料</a>
						</dd>
						<dd>
							<a href="">安全设置</a>
						</dd>
					</dl></li>
				<li class="layui-nav-item"><a href="">退了</a></li>
			</ul>
		</div>

		<div class="layui-side layui-bg-black">
			<div class="layui-side-scroll">
				<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
				<ul class="layui-nav layui-nav-tree " lay-shrink="all" lay-filter="test" >
					<c:forEach var="i" begin="0" end="${sessionScope.menuLength-1}">
						<li class="layui-nav-item" onclick="getOnClickItem(this.id)"
							id="${sessionScope.firstMenu[i].menuname}" lay-filter="secondemenu">
							<a class="" href="javascript:;"> ${sessionScope.firstMenu[i].menuname} 
								<span class="layui-nav-more"></span>
						    </a> 
							
								<dl class="layui-nav-child">
									<c:forEach var="j" begin="1" end="${sessionScope.secondMenuLength}">
									<c:if test="${sessionScope.firstMenu[i].menuid==sessionScope.allSecondMenu[i].menus}">
										<dd>
											<a href="javascript:;">${sessionScope.allSecondMenu[j-1].menuname}</a>
										</dd>
									</c:if>
									</c:forEach>
								</dl>
						</li>
					</c:forEach>
					</ul>
					</div>


		<div class="layui-body">
			<!-- 内容主体区域 -->
			<div id="test1"></div>
		</div>

		<div class="layui-footer">
			<!-- 底部固定区域 -->
			管理员界面 - 底部固定区域
		</div>
	</div>
	</div>
	
	<script src="${basePath }/js/plugins/layui/layui.all.js"></script>
	
              
	
	<script>
		//JavaScript代码区域
		;!function() {
			var element = layui.element;
			element.on('nav(test)', function(data){
				  console.log(this.id); //当前Tab标题所在的原始DOM元素
				  console.log(data.index); //得到当前Tab的所在下标
				  console.log(data.elem); //得到当前的Tab大容器
				});
		}();
		function getOnClickItem(menuname) {
			$.get("/Holding/menu/getsecondmenu.do?menuname=" + menuname);
		}
	</script>
</body>
</html>