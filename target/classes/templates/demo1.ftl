<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>$Title$</title>
</head>
<body>
$END$
<table border="1">
<tr>
    <th>id</th>
    <th>name</th>
    <th>password</th>
</tr>

   <#list list as user>
    <tr>
        <td>${user.id}</td>
        <td>${user.name}</td>
        <td>${user.password}</td>
    </tr>
    </#list>
</table>
</body>
</html>