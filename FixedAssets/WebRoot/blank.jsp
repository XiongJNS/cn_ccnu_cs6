<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>我的消息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="shortcut icon" href="img/favicon.html">
	<link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-reset.css" rel="stylesheet">
    <!--external css-->
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <!-- Custom styles for this template -->
    <link href="css/style.css" rel="stylesheet">
    <link href="css/style-responsive.css" rel="stylesheet" />
    
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
    <!--[if lt IE 9]-->
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
    <!-- [endif] -->



  </head>
  
  <body>
    <section id="container" class="">
    <!--header start-->
      <header class="header white-bg">
          <div class="sidebar-toggle-box">
              <div data-original-title="Toggle Navigation" data-placement="right" class="icon-reorder tooltips"></div>
          </div>
          <!--logo start-->
          <a href="#" class="logo" >Flat<span>lab</span></a>
          <!--logo end-->
          <div class="nav notify-row" id="top_menu">
            <!--  notification start -->
            <ul class="nav top-menu">
              <!-- inbox dropdown start-->
              <li id="header_inbox_bar" class="dropdown">
                  <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                      <i class="icon-envelope-alt"></i>
                      <span class="badge bg-important">8</span>
                  </a>
                  <ul class="dropdown-menu extended inbox">
                      <div class="notify-arrow notify-arrow-red"></div>
                      <li>
                          <p class="red">您有8条申请消息</p>
                      </li>
                      <li>
                          <a href="#">
                              
                                    <span class="subject">
                                    <span class="from">王晴</span>
                                    <span class="time">Just now</span>
                                    </span>
                                    <span class="message">
                                                                                物流部门      租借申请
                                    </span>
                          </a>
                      </li>
                      <li>
                          <a href="#">
                              
                                    <span class="subject">
                                    <span class="from">李然</span>
                                    <span class="time">10 mins</span>
                                    </span>
                                    <span class="message">
                                                                                 生产技术部       资产更新申请
                                    </span>
                          </a>
                      </li>
                      <li>
                          <a href="#">
                              
                                    <span class="subject">
                                    <span class="from">欧阳逍</span>
                                    <span class="time">3 hrs</span>
                                    </span>
                                    <span class="message">
                                                                               技术部         租借申请
                                    </span>
                          </a>
                      </li>
                      <li>
                          <a href="#">查看所有消息</a>
                      </li>
                  </ul>
              </li>
              <!-- inbox dropdown end -->
              
              <!-- notification dropdown start-->
              <li id="header_notification_bar" class="dropdown">
                  <a data-toggle="dropdown" class="dropdown-toggle" href="#">

                      <i class="icon-bell-alt"></i>
                      <span class="badge bg-warning">4</span>
                  </a>
                  <ul class="dropdown-menu extended notification">
                      <div class="notify-arrow notify-arrow-yellow"></div>
                      <li>
                          <p class="yellow">您有4条系统消息</p>
                      </li>
                      <li>
                          <a href="general.jsp">
                              <span class="label label-danger"><i class="icon-bolt"></i></span>
                                                                    您的申请没有提交成功
                              <span class="small italic">34 mins</span>
                          </a>
                      </li>
                      <li>
                          <a href="general.jsp">
                              <span class="label label-warning"><i class="icon-bell"></i></span>
                                                                     您的账户有风险
                              <span class="small italic">1 Hours</span>
                          </a>
                      </li>
                      <li>
                          <a href="general.jsp">
                              <span class="label label-danger"><i class="icon-bolt"></i></span>
                                                                      您未处理的消息过多
                              <span class="small italic">4 hrs</span>
                          </a>
                      </li>
                      <li>
                          <a href="general.jsp">
                              <span class="label label-success"><i class="icon-plus"></i></span>
                                                                    您的版本将在7月16日更新
                              <span class="small italic">Just now</span>
                          </a>
                      </li>
                
                      <li>
                          <a href="general.jsp">查看所有消息</a>
                      </li>
                  </ul>
              </li>
              <!-- notification dropdown end -->
          </ul>
          </div>
          <div class="top-nav ">
              <ul class="nav pull-right top-menu">
                  <li>
                      <input type="text" class="form-control search" placeholder="Search">
                  </li>
                 <!-- user login dropdown start-->
                  <li class="dropdown">
                      <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                          <span class="username">赵莉</span>
                          <b class="caret"></b>
                      </a>
                      <ul class="dropdown-menu extended logout">
                          <div class="log-arrow-up"></div>
                          <li><a href="form_validation.jsp"><i class=" icon-suitcase"></i>我的申请</a></li>
                          <li><a href="blank.jsp"><i class="icon-cog"></i> 设置</a></li>
                          <li><a href="general.jsp"><i class="icon-bell-alt"></i> 消息</a></li>
                          <li><a href="login.jsp"><i class="icon-key"></i> 退出登录</a></li>
                      </ul>
                  </li>
                  <!-- user login dropdown end -->
              </ul>
          </div>
      </header>
      <!--header end-->
      
      
      <!--sidebar start-->
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu">
                  <li class="">
                      <a class="" href="index.jsp">
                          <i class="icon-dashboard"></i>
                          <span>我的主页</span>
                      </a>
                  </li>
                  <li class="sub-menu active">
                      <a href="javascript:;" class="">
                          <i class="icon-book"></i>
                          <span>我的消息</span>
                          <span class="arrow"></span>
                      </a>
                      <ul class="sub">
                          <li class="active"><a class="" href="general.jsp">系统消息</a></li>
                          <li><a class="" href="buttons.jsp">申请消息</a></li>
                      </ul>
                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon-cogs"></i>
                          <span>我的日程</span>
                          <span class="arrow"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="calendar.jsp">我的日程</a></li>
                      </ul>
                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon-tasks"></i>
                          <span>我的申请</span>
                          <span class="arrow"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="form_component.jsp">报修申请</a></li>
                          <li><a class="" href="form_wizard.jsp">采购申请</a></li>
                          <li><a class="" href="form_validation.jsp">借用申请</a></li>
                      </ul>
                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon-th"></i>
                          <span>资产查询</span>
                          <span class="arrow"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="dynamic_table.jsp">资产查询</a></li>
                      </ul>
                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon-user"></i>
                          <span>资产更新</span>
                          <span class="arrow"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="basic_table.jsp">资产更新</a></li>   <!--  我的资产-->
                      </ul>
                  </li>
                  <li>
                      <a class="" href="inbox.jsp">
                          <i class="icon-envelope"></i>
                          <span>Mail </span>
                          <span class="label label-danger pull-right mail-info">2</span>
                      </a>
                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon-glass"></i>
                          <span>Extra</span>
                          <span class="arrow"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="blank.jsp">Blank Page</a></li>
                          <li><a class="" href="profile.jsp">Profile</a></li>
                          <li><a class="" href="invoice.jsp">Invoice</a></li>
                          <li><a class="" href="404.jsp">404 Error</a></li>
                          <li><a class="" href="500.jsp">500 Error</a></li>
                      </ul>
                  </li>

              </ul>
              <!-- sidebar menu end-->
          </div>
      </aside>
      <!--sidebar end-->     
  </section>

    <!-- js placed at the end of the document so the pages load faster -->
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.scrollTo.min.js"></script>
    <script src="js/jquery.nicescroll.js" type="text/javascript"></script>

    <!--common script for all pages-->
    <script src="js/common-scripts.js"></script>


  </body>
</html>
