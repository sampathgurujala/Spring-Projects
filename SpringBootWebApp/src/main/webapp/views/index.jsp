<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Number Input Form</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>

<div class="form-container">
    <h2>Enter Two Numbers</h2>

    <form action="add" method="get">
        <label for="num1">Number 1:</label>
        <input type="text" id="num1" name="num1" required>

        <label for="num2">Number 2:</label>
        <input type="text" id="num2" name="num2" required>

        <button type="submit">Submit</button>
    </form>

    <form action="register" method="get">
        <button type="submit" class="learn-button">Want to learn more about Spring MVC? Click here</button>
    </form>
</div>

</body>
</html>