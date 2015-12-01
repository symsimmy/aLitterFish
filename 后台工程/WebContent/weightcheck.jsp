<!DOCTYPE html>
<html lang="en">
<head>
<title>Matrix Admin</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="css/fullcalendar.css" />
<link rel="stylesheet" href="css/matrix-style.css" />
<link rel="stylesheet" href="css/matrix-media.css" />
<link href="font-awesome/css/font-awesome.css" rel="stylesheet" />
<link href='http://fonts.useso.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
</head>
<body>

<!--Header-part-->
<div id="header">
		<h1>åè½è¡¨</h1>
</div>
<!--close-Header-part--> 

<!--top-Header-menu-->
<div id="user-nav" class="navbar navbar-inverse">
  <ul class="nav">
    <li  class="dropdown" id="profile-messages" ><a title="" href="#" data-toggle="dropdown" data-target="#profile-messages" class="dropdown-toggle"><i class="icon icon-user"></i>  <span class="text">检测员   XX</span><b class="caret"></b></a>
      <ul class="dropdown-menu">
        <li><a href="#"><i class="icon-key"></i> 修改密码</a></li>
        <li class="divider"></li>
     
        <li><a href="login.html"><i class="icon icon-share-alt"></i> 注销</a></li>
      </ul>
    </li>
   
    <li class=""><a title="" href="login.html"><i class="icon icon-share-alt"></i> <span class="text">注销</span></a></li>
  </ul>
</div>
<!--close-top-Header-menu-->

<!--sidebar-menu-->

<div id="sidebar"><a href="#" class="visible-phone"><i class="icon icon-home"></i>主页</a>
  <ul>
    <li ><a href="index.html"><i class="icon icon-home"></i> <span>主页</span></a> </li>
    <li class="submenu active"> <a href="#"><i class="icon icon-file"></i> <span>检测</span> <span class="label label-important">3</span></a>
      <ul>
        <li><a href="temp.jsp">温度</a></li>
        <li><a href="weight.jsp">质量</a></li>
        <li><a href="calendar.html">血压</a></li>
      </ul>
    </li>
    <li class="submenu"> <a href="#"><i class="icon icon-info-sign"></i> <span>查询</span> <span class="label label-important">4</span></a>
      <ul>
        <li><a href="error403.html">1</a></li>
        <li><a href="error404.html">2</a></li>
        <li><a href="error405.html">3</a></li>
        <li><a href="error500.html">4</a></li>
      </ul>
    </li>
    
  </ul>
</div>
<!--sidebar-menu-->

<!--main-container-part-->
<div id="content">
  <div id="content-header">
    <div id="breadcrumb"><a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> 主页</a> <a href="#" class="current">检测</a><a href="#" class="current">质量检测</a></div>
    <h1>质量检测</h1>
  </div>
  <div class="widget-content">
            
           <center> <div class="btn-group">
              <button data-toggle="dropdown" class="btn dropdown-toggle">选择检测仪器 <span class="caret"></span></button>
              <ul class="dropdown-menu">
                <li><a href="#">Action</a></li>
                <li><a href="#">Another action</a></li>
                <li><a href="#">Something else here</a></li>
                <li class="divider"></li>
                <li><a href="#">Separated link</a></li>
              </ul>
            </div>
            </center><br>
            
            
            <center><button class="btn btn-primary">开始检测</button> </center>
             <div class="widget-box">
          <div class="widget-title"><span class="icon"><i class="icon-bookmark"></i></span>
            <h5>抓取图片显示</h5>
          </div>
          </div>
             <div class="widget-box">
          <div class="widget-title"><span class="icon"><i class="icon-bookmark"></i></span>
            <h5>检测结果显示</h5>
          </div>
          </div>
          <center><button class="btn btn-success btn-mini">确认结果</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
           <button class="btn btn-warning btn-mini">重新检查</button></center>
            
<!--Footer-part-->
<!--Footer-part-->
<div class="row-fluid">
  <div id="footer" class="span12"> 软件项目管理_智能实验室平台_第一小组 </div>
</div>
<!--end-Footer-part-->
<!--end-Footer-part-->

<script src="js/jquery.min.js"></script> 
<script src="js/jquery.ui.custom.js"></script> 
<script src="js/bootstrap.min.js"></script> 
<script src="js/matrix.js"></script>
</body>
</html>
