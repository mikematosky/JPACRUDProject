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
<link rel="stylesheet" type="text/css" href="nav.css">
</head>
<body>

<nav class="navbar navbar-expand-sm navbar-dark primary-color">

  <!-- Navbar brand -->
  <a class="navbar-brand" href="#">Navbar</a>

  <!-- Collapse button -->
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#basicExampleNav"
    aria-controls="basicExampleNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <!-- Collapsible content -->
  <div class="collapse navbar-collapse" id="basicExampleNav">
  
  <ul>
  	<li class= "nav-item"><a class="nav-link" href="home.do">Home</a>
  	<li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink" data-toggle="dropdown"
          aria-haspopup="true" aria-expanded="false">Navigate</a>
        <div class="dropdown-menu dropdown-primary" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="allCharacters.do">All Characters</a>
          <a class="dropdown-item" href="good_guys.do">Good Guys</a>
          <a class="dropdown-item" href="bad_guys.do">Death Eaters</a>
          <a class="dropdown-item" href="gryff.do">Gryffindor</a>
          <a class="dropdown-item" href="slyth.do">Slytherin</a>
          <a class="dropdown-item" href="raven.do">Ravenclaw</a>
          <a class="dropdown-item" href="puff.do">Hufflepuff</a>
          <a class="dropdown-item" href="dead.do">RIP</a>
        </div>
      </li>	
  </ul>
  <form class="form-inline">
      <div class="md-form my-0">
        <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
      </div>
    </form>
    </div>
  </nav>














<!-- 
<nav class="navbar navbar-toggleable-md navbar-light bg-faded">
  <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <a class="navbar-brand" href="#">HP Characters</a>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-list nav-item active"><a class="link nav-link" href="">HOME</a></li>
        <li class="nav-list nav-item"><a class="link nav-link" href="allCharacters.do">All Characters</a></li>
        <li class="nav-list nav-item"><a class="link nav-link" href="good_guys.do">Good Guys</a></li>
        <li class="nav-list nav-item"><a class="link nav-link" href="bad_guys.do">Death Eaters</a></li>
        <li class="nav-list nav-item"><a class="link nav-link" href="gryff.do">Gryffindor</a></li>
        <li class="nav-list nav-item"><a class="link nav-link" href="slyth.do">Slytherin</a></li>
        <li class="nav-list nav-item"><a class="link nav-link" href="raven.do">Ravenclaw</a></li>
        <li class="nav-list nav-item"><a class="link nav-link" href="puff.do">Hufflepuff</a></li>
        <li class="link nav-item"> MORE </li>
        <li class="nav-item"><button id="tickets-btn">GET TICKETS</button></li>
    </ul>
  </div>
</nav>
-->
</body>
</html>