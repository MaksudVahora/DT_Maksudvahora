<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>View All Products</h1>
<c:if test="${!empty prdList}">
 	
	<table border="1" bgcolor="black" width="100%">  
    	<tr style="background-color: teal; color: white;" height="40px">  
    		<td>Product ID</td>
    		<td>Product Title</td>
    		<td>Sub Title</td>
    		<td>Product Description</td>
    		<td>Prodict Price</td>
    		<td>Image</td>
    		<td	 colspan="2">Operation</td>   
	    </tr>   
    	<c:forEach items="${prdList}" var="prd">  
     	<tr  style="background-color: white; color: black;"  height="30px">  
	   		<td><c:out value="${prd.getPrdID()}" /></td>  
      		<td><c:out value="${prd.getPrdTitle()}" /></td>  
      		<td><c:out value="${prd.getPrdSubTitle()}" /></td>  
      		<td>
      			<ol>
   		   			<li><c:out value="${prd.getPrdDec1()}" /></li>
      				<li><c:out value="${prd.getPrdDesc2()}" /></li>
      				<li><c:out value="${prd.getPrdDesc3()}" /></li>
      				<li><c:out value="${prd.getPrdDesc4()}" /></li>
      				<li><c:out value="${prd.getPrdDesc5()}" /></li>
      			</ol>
      		</td>
     	 	<td><c:out value="${prd.getPrdPrice()}" /></td> 
    	  	<td><c:out value="${prd.getPrdImage()}" /></td> 
    	  	<td><a href="editProduct?id=${prd.getPrdID()}">Edit</a></td>  
    	  	<td><a href="delProduct?id=${prd.getPrdID()}">Delete</a></td>  
  	   </tr>  
  	  </c:forEach>  
   </table>  
</c:if>
</body>
</html>