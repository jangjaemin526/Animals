<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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

		<h2 class="main title">공지사항</h2>

		<div class="search-form">
			<h3 class="hidden">공지사항 검색폼</h3>
			<form class="table-form">
				<fieldset>
					<legend class="hidden">공지사항 검색분류</legend>

					<label></label> <select name="f">
						<option value="title">제목</option>
						<option value="uid">작성자</option>
					</select> <label class="hidden">검색어</label> <input type="text" name="q"
						value="" /> <input type="submit" value="검색" />
				</fieldset>
			</form>
		</div>

		<div class="notice margin-top">
			<h3 class="hidden">공지사항 목록</h3>

			<table border="1" class="table">
				<thead>
					<tr>
						<th style="width: 60px;" class="w60">번호</th>
						<th style="width: 400px; height: 10px;" class="expand">제목</th>
						<th style="wdith: 300px; height: 10px;" class="w100">작성자</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="n" items="${list}">
						<tr>
							<td style="text-align: center;">${n.id}</td>
							<td style="text-align: center;"
								class="title ident text-align-left"><a
								href="detail?id=${n.id}">${n.title}</a></td>
							<td style="text-align: center; width: 100px;">${n.uid}</td>
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