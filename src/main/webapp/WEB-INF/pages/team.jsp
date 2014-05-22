<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="includes.jsp" %>

<html>
<head>
    <title>Team Management</title>
</head>
<body>

<form:form action="team.do" method="post" commandName="team">

    <table>
        <tr>
            <td>Team Id</td>
            <td><form:input path="teamId"/></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Coach</td>
            <td><form:input path="coach"/></td>
        </tr>
        <tr>
            <td>Titles won</td>
            <td><form:input path="titlesWon"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" name="action" value="Add"/>
                <input type="submit" name="action" value="Edit"/>
                <input type="submit" name="action" value="Delete"/>
                <input type="submit" name="action" value="Search"/>
            </td>
        </tr>
    </table>
</form:form>
<br>

<table style="border:1px solid black;">
    <tr>
        <td>Team ID</td><td>Name</td><td>Coach</td><td>Titles</td>
    </tr>
    <c:forEach items="${teamList}" var="team">
        <tr>
            <td>${team.teamId}</td>
            <td>${team.name}</td>
            <td>${team.coach}</td>
            <td>${team.titlesWon}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>