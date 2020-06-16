<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Palindromo</title>
</head>
<body>

Totale parole: <b>${contaParole}</b>
Totale parole palindrome: <b>${contatoreParolePalindrome}</b>

<c:forEach items="${parolePalindrome}" var="pal">
        <c:out value="${pal}" />
</c:forEach>


</body>
</html>