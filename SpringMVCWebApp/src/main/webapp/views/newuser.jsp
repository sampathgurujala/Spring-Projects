<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>

<div class="form-container">
    <h2>User Registration Form</h2>

    <form:form modelAttribute="user" action="addUser" method="post">
        <label for="uid">User ID:</label>
        <form:input path="uid" id="uid" required="true"/>

        <label for="name">Name:</label>
        <form:input path="name" id="name" required="true"/>

        <label for="email">Email:</label>
        <form:input path="email" id="email" required="true"/>

        <button type="submit">Submit</button>
    </form:form>
</div>

</body>
</html>