<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="/resources/css/account/signup.css">
<title>회원가입</title>
</head>
<body>
    <div>
        <div class="text-center"> <h1>회원가입</h1></div>
        <form method="post" class="signup">
            <div class="form-group">
                <label for="id">Name:</label>
                <input type="text" class="form-control" name="id" id="id">
            </div>
            <div class="form-group">
                <label for="pw">Password:</label>
                <input type="password" class="form-control" name="pw" id="pw">
            </div>
            <div class="form-group">
                <label for="email">email:</label>
                <input type="email" class="form-control" name="email" id="email">
            </div>
            <div>
                <button class="btn btn-default col-md-12">등록</button>
            </div>
        </form>
    </div>

</body>
</html>