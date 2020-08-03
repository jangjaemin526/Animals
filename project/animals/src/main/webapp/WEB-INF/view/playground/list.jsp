<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style type="text/css">
a:link {
	color: black;
	text-decoration: none;
}

a:visited {
	color: black;
	text-decoration: none;
}

a:hover {
	color: blue;
	text-decoration: underline;
}
</style>
<div>
	<main class="main">

		<h2 class="main title">반려견 놀이터</h2>

		<div class="search-form">
			<h3 class="hidden">반려견 놀이터</h3>
			<form class="table-form">
				<fieldset>
					<legend class="hidden">반려견 놀이터 검색분류</legend>

					<label></label> <select name="f">
						<option value="playgroundname">놀이터이름</option>
						<option value="address">주소</option>
					</select> <label class="hidden">검색어</label> <input type="text" name="q"
						value="" /> <input type="submit" value="검색" />
				</fieldset>
			</form>
		</div>

		<div class="notice margin-top">
			<h3 class="hidden">반려견 놀이터 목록</h3>

			<table border="1" class="table">
				<thead>
					<tr>
						<th style="text-align: center;" class="w60">번호</th>
						<th style="text-align: center;" class="expand">이름</th>
						<th style="text-align: center;" class="w600">주소</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="p" items="${list}">
						<tr>
							<td style="text-align: center; width: 70px;">${p.id}</td>
							<td style="text-align: center; width: 300px"
								class="title ident text-align-left"><a
								href="detail?id=${p.id}">${p.playgroundname}</a></td>
							<td style="text-align: center; width: 625px;">${p.address}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

		<div class="paging">

			<ul class="-list- center">
				<c:set var="page" value="${(param.p == null)?1:param.p}" />
				<c:set var="startNum" value="${page-(page-1)%5}" />
				<c:set var="lastNum" value="10" />

				<c:if test="${startNum>1}">
					<a class="btn btn-prev" href="?p=${startNum-1}&t=&q=">이전</a>
				</c:if>

				<c:if test="${startNum<=1}">
					<span class="btn btn-prev" onclick="alert('이전 페이지가 없습니다.');">이전</span>
				</c:if>



				<c:forEach var="i" begin="0" end="1">
					<li><a class="-text- orange bold"
						href="?p=${startNum+i}&t=&q=">${startNum+i}</a></li>
				</c:forEach>



				<c:if test="${startNum+5<lastNum}">
					<a href="?p=${startNum+5}&t=&q=" class="btn btn-next">다음</a>
				</c:if>

				<c:if test="${startNum+5>=lastNum}">
					<span class="btn btn-next" onclick="alert('다음 페이지가 없습니다.');">다음</span>
				</c:if>

			</ul>
		</div>
	</main>
</div>
