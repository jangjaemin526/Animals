<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<main>

	<div class="margin-top first">
		<h3 class="hidden">직업소개 내용</h3>
		<table border="1" class="table">
			<tbody>


				<tr>
					<th>이름</th>
					<td colspan="3">${j.name}</td>
				</tr>

				<tr>
					<th>제목</th>
					<td class="text-align-left text-indent text-strong text-orange"
						colspan="3">${j.title}</td>
				</tr>

				<tr>
					<th style="width:100px;">직업설명</th>
					<td style="height: 230px;"
						class="text-align-left text-indent text-strong text-orange"
						colspan="3">${j.content}</td>
				</tr>

				<tr>
					<th>올린날짜</th>
					<td class="text-align-left text-indent" colspan="3">
						<fmt:formatDate pattern="yyyy년-MM월-dd일 hh시:mm분:ss초" value="${j.regdate}"/></td>
				</tr>


			</tbody>
		</table>
	</div>

	<div class="margin-top text-align-center">
		<a class="btn-text btn-cancel" href="list">목록</a>
	</div>

</main>