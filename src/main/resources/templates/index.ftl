<#import "/spring.ftl" as spring/>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Welcome</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>

<body>
<h1>Autopark</h1>
<h3>Vehicles</h3>
<br>
<div id="content">
    <table class="datatable">
        <tr>
            <th>Name</th>
            <th>Engine power</th>
            <th>Production year</th>
            <th>Price</th>
        </tr>
        <#list model["vehicleList"] as vehicle>
            <tr>
                <td>${vehicle.name}</td>
                <td>${vehicle.enginePower}</td>
                <td>${vehicle.productionYear}</td>
                <td>${vehicle.price}</td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>