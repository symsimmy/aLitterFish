<!DOCTYPE html>
<html lang="en">
<head>
<title>智能实验室平台</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="css/uniform.css" />
<link rel="stylesheet" href="css/select2.css" />
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
<div id="content">
  <div id="content-header">
    <div id="breadcrumb"> <a href="index.jsp" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a><a href="#" class="current">检测</a> <a href="#" class="current">质量</a> </div>
    <h1>质量检测</h1>
  </div>
  <div class="container-fluid">
    <hr>
    <div class="row-fluid">
      <div class="span12">
		<div class="widget-box">
          <div class="widget-title"> <span class="icon"><i class="icon-th"></i></span>
            <h5>样品列表</h5>
          </div>
          <div class="widget-content nopadding">
            <table class="table table-bordered data-table">
              <thead>
                <tr>
                  <th>样品编号</th>
                  <th>样品名称</th>
                  <th>开始检测</th>
                </tr>
              </thead>
              <tbody>
                <tr >
                  <td><center>000</center></td>
                  <td><center>针管</center></td>
                  <td><center><a href="weightcheck.jsp">开始检测</a></center></td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<!--Footer-part-->
<div class="row-fluid">
  <div id="footer" class="span12"> 软件项目管理_智能实验室平台_第一小组 </div>
</div>
<!--end-Footer-part-->
<script src="js/jquery.min.js"></script> 
<script src="js/jquery.ui.custom.js"></script> 
<script src="js/bootstrap.min.js"></script> 
<script src="js/jquery.uniform.js"></script> 
<script src="js/select2.min.js"></script> 
<script src="js/jquery.dataTables.min.js"></script> 
<script src="js/matrix.js"></script> 
<script src="js/matrix.tables.js"></script>
</body>
</html>
