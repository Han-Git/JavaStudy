<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>폼 생성</title>
</head>
<body>

<form action="/viewParameter.jsp" method="post">
이름:<input type="text" name="name" size="10"><br>
주소:<input type="text" name="address" size="100"><br>
좋아하는동물:
	<input type="checkbox" name="pet" value="dog">강아지
	<input type="checkbox" name="pet" value="cat">고양이
	<input type="checkbox" name="pet" value="pig">돼지
<br>
<input type="submit" value="전송"><br>


<form action="viewParameter.jsp" method="get">
이름:<input type="text" name="name2"><br>
주소:<input type="text" name="address2"><br>
좋아하는동물:
	<input type="checkbox" name="pet2" value="dog">강아지
	<input type="checkbox" name="pet2" value="cat">고양이
	<input type="checkbox" name="pet2" value="pig">돼지
<br>
<input type="submit" value="전송"><br>
</form>
<a href="viewParameter.jsp?name=홍길동&address=아하하하">링크</a>
</body>
</html>