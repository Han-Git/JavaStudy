<%@ page contentType="text/html; charset=utf-8"%>
<%
	String id = request.getParameter("memberId");
	if(id != null && id.equals("자바")){
		response.sendRedirect("/index.jsp");
	}else{
		%>
		<html>
		<head>
		<title>로그인에실패</title>
		</head>
		<body>
		잘못된 아이디입니다.
		</body>
		</html>		
		<%
	}
%>

