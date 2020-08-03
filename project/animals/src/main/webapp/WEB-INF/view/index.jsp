<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title>Animals</title>
<main>

		<header class="head">
			<div>
				<a href="index">HOME</a>
				<c:if test="${sessionScope.uid == null}">
				<a href="/member/login">로그인</a>
				</c:if>
				<c:if test="${sessionScope.uid != null}">
				<a href="/member/logout">로그아웃</a>
				</c:if>			
				<a href="/member/join">회원가입</a>
			</div>
		</header>
	
		<h1><img class="logo" src="images/logo.jpg"></h1>
		
		<nav role="navigation">
			<div class="hello">
	
				<ul id="main-menu">
					<li><a href="#">반려동물 추천 및 소개</a>
						<ul id="sub-menu">
							<li><a href="dogrecommend/list" aria-label="subemnu">반려견추천 및 소개</a></li>
							<li><a href="catrecommend/list" aria-label="subemnu">반려묘추천 및 소개</a></li>
							<li><a href="hamsterrecommend/list" aria-label="subemnu">햄스터추천 및 소개</a></li>
							<li><a href="gosumdochirecommend/list" aria-label="subemnu">고슴도치추천 및 소개</a></li>
						</ul></li>                                       
	
					<li><a href="#">반려동물에 대한 알찬정보</a>
						<ul id="sub-menu">
							<li><a href="behaviorintention/list" aria-label="subemnu">강아지 행동별 숨겨진의미</a></li>
							<li><a href="actintention/list" aria-label="submenu">고양이 행동별 의미</a>
							<li><a href="taboofood/list" aria-label="subemnu">반려견 금기음식</a></li>
							<li><a href="hospital/list" aria-label="submenu">동물병원</a>
						</ul></li>
	
					<li><a href="#">반려동물 직업</a>
						<ul id="sub-menu">
							<li><a href="jobintroduction/list" aria-label="subemnu">직업소개</a></li>
						</ul></li>
						
					<li><a href="#">반려동물 놀이터</a>
						<ul id="sub-menu">
							<li><a href="playground/list" aria-label="subemnu">놀이터</a></li>
						</ul></li>
	
					<li><a href="notice/list">공지사항</a></li>
				</ul>
	
			</div>
		</nav>
	
	<div class="enter"></div>

	<div id="slider">
		<input type="radio" name="slider" id="slide1" checked> 
		<input type="radio" name="slider" id="slide2"> 
		<input type="radio" name="slider" id="slide3"> 
		<input type="radio" name="slider" id="slide4">
		
		<div id="slides">
			<div id="overflow">
				<div class="inner">
				
					<div class="slide slide_1">
						<div class="slide-content">
							<img src="images/dog.jpg">
						</div>
					</div>
					
					<div class="slide slide_2">
						<div class="slide-content">
							<img src="images/cat.jpg">
						</div>
					</div>
					
					<div class="slide slide_3">
						<div class="slide-content">
							<img src="images/hamster.jpg">
						</div>
					</div>
					
					<div class="slide slide_4">
						<div class="slide-content">
							<img src="images/gosumdochi.jpg">
						</div>
					</div>
					
				</div>
			</div>
		</div>
		
		<div id="controls">
			<label for="slide1"></label> <label for="slide2"></label>
			<label for="slide3"></label> <label for="slide4"></label>
		</div>
		
		<div id="bullets">
			<label for="slide1"></label> <label for="slide2"></label> 
			<label for="slide3"></label> <label for="slide4"></label>
		</div>
	</div>

	<footer>
		<h4>Copyright(c)2020 by 장재민. All pictures cannot be copied without permission.</h4>
	</footer>

</main>