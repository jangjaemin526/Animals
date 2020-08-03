<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<main>

	<div class="margin-top first">
		<h3 class="hidden">공지사항 내용</h3>
		<table border="1" class="table">
			<tbody>
				<tr>
					<th style="wdith: 123px; height: 60px;">제목</th>
					<td style="text-align: center;" class="text-align-title"
						colspan="3">${n.title}</td>
				</tr>

				<tr>
					<th style="width: 130px; height: 110px;">공지사항</th>
					<td style="text-align: center;" class="text-align-notice"
						colspan="3">${n.content}</td>
				</tr>

				<tr>
					<th>작성일</th>
					<td style="text-align: center;" class="text-align-left text-indent"
						colspan="3"><fmt:formatDate
							pattern="yyyy년-MM월-dd일 hh시:mm분:ss초" value="${n.regdate}" /></td>
				</tr>


				<tr>
					<th style="text-align: center;">작성자</th>
					<td style="text-align: center;" colspan="3">${n.uid}</td>
				</tr>

				<tr>
					<th>조회수</th>
					<td style="text-align: center;" colspan="3">${n.hit}</td>
				</tr>
			</tbody>
		</table>
	</div>

	<div class="margin-top text-align-center">
		<a class="btn-text btn-cancel" href="list">목록</a>
	</div>

</main>