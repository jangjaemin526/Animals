<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<main>

	<div class="margin-top first">
		<h3 class="hidden">금기음식 내용</h3>
		<table border="1" class="table">
			<tbody>
				<tr>
					<th style="wdith: 123px; height: 60px;">음식이름</th>
					<td style="text-align: center;" class="text-align-title"
						colspan="3">${t.foodname}</td>
				</tr>
				
				<tr>
					<th style="wdith: 123px; height: 60px;">음식이미지</th>
					<td style="text-align: center;" class="text-align-title"
						colspan="3"><img src="${t.taboofoodimg}"></td>
				</tr>

				<tr>
					<th style="width: 150px; height: 120px;">증상</th>
					<td style="text-align: center;" class="text-align-notice"
						colspan="3">${t.symptom}</td>
				</tr>

				<tr>
					<th>작성일</th>
					<td style="text-align: center;" class="text-align-left text-indent"
						colspan="3"><fmt:formatDate
							pattern="yyyy년-MM월-dd일 hh시:mm분:ss초" value="${t.regdate}" /></td>
				</tr>
			</tbody>
		</table>
	</div>

	<div class="margin-top text-align-center">
		<a class="btn-text btn-cancel" href="list">목록</a>
	</div>

</main>