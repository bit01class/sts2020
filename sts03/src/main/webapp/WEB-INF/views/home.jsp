<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Home</title>
	<link rel="stylesheet" type="text/css" 
		href="${pageContext.request.contextPath }/resources/css/bootstrap.css"/>
	<style type="text/css">
		.item > img {
			margin: 0px auto;
		}
	</style>
	<script type="text/javascript" 
	src="${pageContext.request.contextPath }/resources/js/jquery-1.12.4.min.js"></script>
	<script type="text/javascript" 
	src="${pageContext.request.contextPath }/resources/js/bootstrap.js"></script>
	<script type="text/javascript">
	
	</script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#droplist" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">비트교육센터</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="droplist">
      <ul class="nav navbar-nav">
        <li class="active"><a href="${pageContext.request.contextPath }/">HOME <span class="sr-only">(current)</span></a></li>
        <li><a href="${pageContext.request.contextPath }/login">LOGIN</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">TABLE <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="${pageContext.request.contextPath }/dept/">DEPT LIST</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="${pageContext.request.contextPath }/emp/">EMP LIST</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<div class="container">
	<div class="row" id="header">
		<div class="col-md-12"></div>
	</div>
	<div class="row" id="content">
		<div class="col-md-12">
			<!-- content start -->
			<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
			  <!-- Indicators -->
			  <ol class="carousel-indicators">
			    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
			    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
			    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
			  </ol>
			
			  <!-- Wrapper for slides -->
			  <div class="carousel-inner" role="listbox">
			    <div class="item active">
			      <img src="resources/imgs/big01.jpg" alt="...">
			      <div class="carousel-caption">
			        <h3>물 많이 마시자</h3>
			        <p>살려면 마시자</p>
			      </div>
			    </div>
			    <div class="item">
			      <img src="resources/imgs/big02.jpg" alt="...">
			      <div class="carousel-caption">
			        <h3>오늘 한끼 맛있는 소고기</h3>
			        <p>돼지고기값이나 소고기 값이나...</p>
			      </div>
			    </div>
			    <div class="item">
			      <img src="resources/imgs/big03.jpg" alt="...">
			      <div class="carousel-caption">
			        <h3>먹고 사람되자</h3>
			        <p>많이 먹어야 겠죠</p>
			      </div>
			    </div>
			    <div class="item">
			      <img src="resources/imgs/big04.jpg" alt="...">
			      <div class="carousel-caption">
			        <h3>자연방목</h3>
			        <p>먹으면 살찜</p>
			      </div>
			    </div>
			  </div>
			
			  <!-- Controls -->
			  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
			    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
			    <span class="sr-only">Previous</span>
			  </a>
			  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
			    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			    <span class="sr-only">Next</span>
			  </a>
			</div>
			<!-- content end -->
		</div>
	</div>
	<div class="row" id="footer">
		<div class="col-md-12">
			<address>비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)</address>
					Copyright (c) 비트캠프 All rights reserved.
		</div>
	</div>
</div>
</body>
</html>
