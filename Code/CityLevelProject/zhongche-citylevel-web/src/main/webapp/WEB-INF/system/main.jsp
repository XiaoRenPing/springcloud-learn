<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@	taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>

<head>
	<jsp:include page="/common/head.jsp"></jsp:include>
  	<!-- 新版样式 -->
	<jsp:include page="/common/mainheader.jsp"></jsp:include>
</head>

<body class="fixed-sidebar full-height-layout gray-bg">
    <div id="wrapper">
        <!--左侧导航开始-->
        <nav class="navbar-default navbar-static-side" role="navigation">
            <div class="nav-close"><i class="fa fa-times-circle"></i>
            </div>
            <div class="sidebar-collapse">
                <ul class="nav" id="side-menu">
                    <li class="nav-header">
                        <div class="dropdown profile-element">
                            <span><img alt="image" class="img-circle" src="style/img/default.jpg" /></span>
                            <a data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
                                <span class="clear">
	                               	<span class="block m-t-xs"><strong class="font-bold">${sessionScope.loginUser.fullName }</strong></span>
	                                <span class="text-muted text-xs block">${sessionScope.loginUser.department.departmentName }<b class="caret"></b></span>
                                </span>
                            </a>
                            <ul class="dropdown-menu animated fadeInRight m-t-xs">
                                <li><a class="J_menuItem" href="form_avatar.html">修改头像</a>
                                </li>
                                <li><a class="J_menuItem" href="user/viewUserInfo">个人资料</a>
                                </li>
                                <li><a class="J_menuItem" href="mailbox.html">信箱</a>
                                </li>
                                <li class="divider"></li>
                                <li><a href="${pageContext.request.contextPath }/users/quit?token=">安全退出</a>
                                </li>
                            </ul>
                        </div>
                        <div class="logo-element">Univweb</div>
                    </li>
                         
                   <!-- user menus -->
                   <c:forEach items="${menu}" var="menu">
                    	<li>
							<a href="#">
								<i class="fa fa-${menu.menuicon }"></i> 
								<span class="nav-label">${menu.displayname }</span>
								<span class="fa arrow"></span>
							</a>
							<ul class="nav nav-second-level">
								<li>
									<c:forEach items="${menu.items }" var="mc">
										<a class="J_menuItem" href="${pageContext.request.contextPath }${mc.menuurl}" target="dataContent">${mc.displayname }</a>
									</c:forEach>
								</li>
							</ul>
                 		  </li>
                    </c:forEach>
                			</ul>
            </div>
        </nav>
        <!--左侧导航结束-->
        
        
        <!--右侧部分开始-->
        <div id="page-wrapper" class="gray-bg dashbard-1">
           
            <div class="row content-tabs">
                <button class="roll-nav roll-left J_tabLeft"><i class="fa fa-backward"></i>
                </button>
                <nav class="page-tabs J_menuTabs">
                    <div class="page-tabs-content">
                        <a href="${pageContext.request.contextPath }/body.jsp" class="active J_menuTab" data-id="index_v1.html">首页</a>
                    </div>
                </nav>
                <button class="roll-nav roll-right J_tabRight"><i class="fa fa-forward"></i>
                </button>
                <div class="btn-group roll-nav roll-right">
                    <button class="dropdown J_tabClose" data-toggle="dropdown">关闭操作<span class="caret"></span>

                    </button>
                    <ul role="menu" class="dropdown-menu dropdown-menu-right">
                        <li class="J_tabShowActive"><a>定位当前选项卡</a>
                        </li>
                        <li class="divider"></li>
                        <li class="J_tabCloseAll"><a>关闭全部选项卡</a>
                        </li>
                        <li class="J_tabCloseOther"><a>关闭其他选项卡</a>
                        </li>
                    </ul>
                </div>
                <a href="${pageContext.request.contextPath }/users/quit?token=" class="roll-nav roll-right J_tabExit"><i class="fa fa fa-sign-out"></i> 退出</a>
            </div>
            <div class="row J_mainContent" id="content-main">
                <%-- <iframe class="J_iframe" name="dataContent" width="100%" height="100%" src="${pageContext.request.contextPath }/body.jsp" frameborder="0" data-id="index_v1.html" seamless></iframe> --%>
           		<!-- 数据显示区 -->	      
             	<script type="text/javascript">
             	function reinitIframe() {         
             		 var ifm= document.getElementById("urlIframe");
                     var subWeb = document.frames ? document.frames["urlIframe"].document:ifm.contentDocument;
                         if(ifm != null && subWeb != null) {
                         	ifm.height = subWeb.body.scrollHeight+subWeb.body.offsetHeight;
                         }                 
             	}
             	</script>
             	<iframe class="J_iframe" src="${pageContext.request.contextPath }/body.jsp" name="dataContent" marginwidth="0"  marginheight="0" height="100%" width="100%"  id="urlIframe" frameborder="0" scrolling="no" onload="reinitIframe()" >
		          		
		        </iframe>
             	
            </div>
            
           <%--  <div class="footer">
                ${site.description }
            </div> --%>
        </div>
       
   

    <!-- 全局js -->
    <script src="${pageContext.request.contextPath }/style/js/jquery-2.1.1.min.js"></script>
    <script src="${pageContext.request.contextPath }/style/js/bootstrap.min.js?v=3.4.0"></script>
    <script src="${pageContext.request.contextPath }/style/js/plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="${pageContext.request.contextPath }/style/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
    <script src="${pageContext.request.contextPath }/style/js/plugins/layer/layer.min.js"></script>

    <!-- 自定义js -->
    <script src="${pageContext.request.contextPath }/style/js/hplus.min.js?v=3.2.0"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/style/js/contabs.min.js"></script>

    <!-- 第三方插件 :左侧小菜单-->
    <script src="${pageContext.request.contextPath }/style/js/plugins/pace/pace.min.js"></script>

</body>

</html>