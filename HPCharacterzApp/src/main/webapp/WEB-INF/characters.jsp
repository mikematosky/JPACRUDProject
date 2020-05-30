
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="chars.css">
<title>Characters</title>
</head>
<body>
<div class="navbar"><jsp:include page="navbar.jsp"/></div>

	<div class="character-list">
		<table class="table table-dark table-hover">
			<thead>
				<tr>
					<h2>
						<th scope="col" class="text-centered">Characters</th>
					</h2>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="character" items= "${List}">
					<tr>
						<table class="table table-border">
							<!-- |Image| fName lName-->
							<tr>
								<td><img src="${character.imageLink }" alt="${character.firstName}" height=150px width=150px></td>
								<td><h3>${character.firstName }
									<!-- All this fuss because I split name into two fields and one is possibly null -->
									<c:if test="${not empty character.lastName}">
										${character.lastName }
									</c:if>
								</h3></td>
							</tr>
							 <!--  -->
							 <tr>
							 	<td><p>${character.description }</p></td>
							 </tr>
						</table>
					</tr>
				</c:forEach>
			</tbody>
		</table>	
	</div>

</body>
</html>