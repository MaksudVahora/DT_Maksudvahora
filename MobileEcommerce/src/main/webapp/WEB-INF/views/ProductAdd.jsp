<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<head>
<meta charset="UTF-8">
<title>Example of Bootstrap 3 Supported Form Controls</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<style type="text/css">
    h1{
        margin: 30px 0;
        padding: 0 200px 15px 0;
        border-bottom: 1px solid #E5E5E5;
    }
	.bs-example{
    	margin: 20px;
    }
</style>
</head>
<body>
	<div class="bs-example">
    	<h1>New Product Entry</h1>
    
		<form:form  method="POST" commandName="save_Product" action="saveProduct">
		<table>
			<tr>
        		<td><form:label path="PrdTitle">Product Title:</form:label></td>
        		<td><form:input path="PrdTitle" /></td>
    		</tr>
    		<tr>
        		<td><form:label path="PrdSubTitle">Product Title:</form:label></td>
        		<td><form:input path="PrdSubTitle"/></td>
    		</tr>
    		<tr>
        		<td><form:label path="PrdDec1">Product Desc1:</form:label></td>
        		<td><form:input path="PrdDec1" /></td>
    		</tr>
    		<tr>
        		<td><form:label path="PrdDesc2">Product Desc2:</form:label></td>
        		<td><form:input path="PrdDesc2" /></td>
    		</tr>
    		<tr>
        		<td><form:label path="PrdDesc3">Product Desc3:</form:label></td>
        		<td><form:input path="PrdDesc3" /></td>
    		</tr>
    		<tr>
        		<td><form:label path="PrdDesc4">Product Desc4:</form:label></td>
        		<td><form:input path="PrdDesc4" /></td>
    		</tr>
    		<tr>
        		<td><form:label path="PrdDesc5">Product Desc5:</form:label></td>
        		<td><form:input path="PrdDesc5" /></td>
    		</tr>
    		<tr>
        		<td><form:label path="PrdPrice">Product Price:</form:label></td>
        		<td><form:input path="PrdPrice" /></td>
    		</tr>	
    		<tr>
        		<td><form:label path="PrdImage">Product Image:</form:label></td>
        		<td><form:input path="PrdImage" /></td>
    		</tr>		
 			<tr>
        		<td colspan="2">
            	<input type="submit" value="Submit"/>
        		</td>
    		</tr>
	</table>  
</form:form>
</div>
</body>
</html>                                		