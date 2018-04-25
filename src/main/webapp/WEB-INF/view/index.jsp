<html>
<head>
<title>社員検索結果一覧</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>

<h1>AppGrop1社員一覧</h1>
  
<table border="1" >
  <thead>
    <tr>
      <th>社員名</th><th>入社日</th><th>役職名</th><th></th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="emp" varStatus="s" items="${empList}">
      <tr style="background-color: ${s.index % 2 == 0 ? 'white' : 'lightblue'};">
        <td>${emp.name}</td>
        <td><fmt:formatDate value="${emp.hireDate}" type="DATE" dateStyle="FULL"/></td>
        <td>${emp.position}</td>		
        <td>変更</td>
      </tr>
    </c:forEach>
  </tbody>
</table>

</body></html>
