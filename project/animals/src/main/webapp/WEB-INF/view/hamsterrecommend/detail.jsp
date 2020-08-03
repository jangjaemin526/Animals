<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<main>

	<div class="margin-top first">
		<h3 class="hidden">햄스터 추천내용 내용</h3>
		<table border="1" class="table">
			<tbody>

				<tr>
					<th style="width: 110px;">햄스터 이미지</th>
					<td colspan="3"><img src="${hs.hamsterimg}"></td>
				</tr>

				<tr>
					<th>햄스터품종</th>
					<td style="text-align: center;" colspan="3">${hs.hamsterbreed}</td>
				</tr>

				<tr>
					<th>추천이유</th>
					<td style="text-align: center;" colspan="3">
						${hs.recommendreason}</td>
				</tr>


				<tr>
					<th>수명</th>
					<td style="text-align: center;" colspan="3">${hs.lifespan}</td>
				</tr>


				<tr>
					<th>등록날짜</th>
					<td style="text-align: center;" colspan="3"><fmt:formatDate
							pattern="yyyy년-MM월-dd일  hh시:mm분:ss초" value="${hs.regdate}" /></td>
				</tr>


			</tbody>
		</table>
	</div>

	<div class="margin-top text-align-center">
		<a class="btn-text btn-cancel" href="list">목록</a>
	</div>

</main>