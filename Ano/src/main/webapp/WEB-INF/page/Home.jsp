<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>浆果</title>

    <!-- Bootstrap core CSS -->
    <link href="bootstrap/bootstrap-4.3.1-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet"/>
    <link rel="stylesheet" type="text/css" href="assets/css/zabuto_calendar.css">
    <link rel="stylesheet" type="text/css" href="assets/js/gritter/css/jquery.gritter.css"/>
    <link rel="stylesheet" type="text/css" href="assets/lineicons/style.css">
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">
    <script src="assets/js/chart-master/Chart.js"></script>
    <script src="jquery/jquery-3.4.1.min.js"></script>
</head>

<body>
<section id="container">
    <!--顶布局-->
    <header class="header black-bg">
        <!-- 顶部 -->
        <div class="sidebar-toggle-box">
            <div class="fa fa-bars tooltips" data-placement="right" data-original-title="菜单选项"></div>
        </div>
        <div class="nav notify-row" id="top_menu">
            <!--  notification start -->
            <ul class="nav top-menu">
                <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
                        <i class="fa fa-tasks"></i>
                    </a>
                </li>
                <li id="header_inbox_bar" class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
                        <i class="fa fa-envelope-o"></i>
                    </a>
                </li>
            </ul>
        </div>
    </header>
    <!--侧边栏-->
    <aside>
        <div id="sidebar" class="nav-collapse ">
            <!-- 侧边栏开始-->
            <ul class="sidebar-menu" id="nav-accordion">

                <p class="centered"><a href=""><img src="img/ng-header.jpg" class="img-circle" width="60"></a></p>
                <h5 class="centered">${sessionScope.AlwaysuserEntity['username']}</h5>

                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-desktop"></i>
                        <span>功能列表</span>
                    </a>
                    <ul class="sub">
                        <li><a href="HouseinfoAction_list">密码查询</a></li>
<%--                        <li><a href="${pageContext.request.contextPath}/PasswordController">密码管理</a></li>--%>
                        <li><a href="Password.jsp">密码管理</a></li>
                    </ul>
                </li>

                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-cogs"></i>
                        <span>个人中心</span>
                    </a>
                    <ul class="sub">
                        <li><a href="calendar.html">我的消息</a></li>
                        <li><a href="HouseinfoAction_mylist?username=${sessionScope.user['username'] }">个人信息</a></li>
                        <li><a href="UserinfoAction_userinfo?id=${sessionScope.user['id'] }">其他》》》</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-book"></i>
                        <span>帮助中心</span>
                    </a>
                    <ul class="sub">
                        <li><a href="">我的账户</a></li>
                        <!--  <li><a  href="">最新动态</a></li> -->
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class=" fa fa-bar-chart-o"></i>
                        <span>浆果</span>
                    </a>
                    <ul class="sub">
                        <li><a href="BaseDictAction_chart?id=1">浆果</a></li>
                    </ul>
                </li>

            </ul>
            <!-- 侧边栏-->
        </div>
    </aside>
    <!--侧边栏-->
    <!--主界面-->
    <section id="main-content">
        <section class="wrapper site-min-height">
            <h3><i class="fa fa-angle-right"></i> 欢迎使用！</h3>
            <div class="row mt">
                <div class="col-lg-12">
                    <p>Place your content here.</p>
                </div>
            </div>

        </section>
    </section>
<%--    <!--底端-->--%>
<%--    <footer class="site-footer">--%>
<%--        <div class="text-center">--%>
<%--            <a>欢迎继续访问！</a>--%>
<%--            <a href="first.jsp#" class="go-top">--%>
<%--                <i class="fa fa-angle-up"></i>--%>
<%--            </a>--%>
<%--        </div>--%>
<%--    </footer>--%>
    <!--底端-->
</section>


<script src="assets/js/jquery.js"></script>
<script src="assets/js/jquery-1.8.3.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script src="assets/js/jquery.dcjqaccordion.2.7.js" class="include" type="text/javascript" ></script>
<script src="assets/js/jquery.scrollTo.min.js"></script>
<script src="assets/js/jquery.nicescroll.js" type="text/javascript"></script>
<script src="assets/js/jquery.sparkline.js"></script>


<script src="assets/js/common-scripts.js"></script>
<script src="assets/js/gritter/js/jquery.gritter.js" type="text/javascript"></script>
<script src="assets/js/gritter-conf.js" type="text/javascript"></script>

<script src="assets/js/sparkline-chart.js"></script>
<script src="assets/js/zabuto_calendar.js"></script>
</body>
</html>
