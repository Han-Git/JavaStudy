<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>1-10까지의합</title>
</head>
<body>
<%
	int sum = 0;
	for(int i=0; i<=10;i++){
		sum = sum +i;
	}
%>
1부터 10까지의 합은 <%=sum %>입니다.
<br/>
1부터 10까지의 합은 <%= 1+2+3+4+5+6+7+8+9+10 %>입니다.
</body>
</html>