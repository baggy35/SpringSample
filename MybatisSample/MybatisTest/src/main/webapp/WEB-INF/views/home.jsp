<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="/resources/css/home.css">
	<title>Home</title>
</head>
<body>
	<div>${id}</div>
	<div class="col-md-12 col-sm-12 col-xs-12 col-lg-12">
        <a href="/account/signup">
            <button class="btn btn-default col-md-12 signup"> 회원가입</button>
        </a>
    </div>
    <div class="col-md-12 col-sm-12 col-xs-12 col-lg-12">
        <a href="/account/signin" >
            <button class="btn btn-default col-md-12"> 로그인</button>
        </a>
    </div>
    <div class="col-md-12 col-sm-12 col-xs-12 col-lg-12">
        <a href="/board/list" >
            <button class="btn btn-default col-md-12"> 게시판</button>
        </a>
    </div>
</body>
</html>
