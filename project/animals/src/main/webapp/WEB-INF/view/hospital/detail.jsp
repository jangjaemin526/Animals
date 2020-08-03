<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<main>

	<div class="margin-top first">
		<h3 class="hidden">동물병원 내용</h3>
		<table border="1" class="table">
			<tbody>

				<tr>
					<th>병원 이미지</th>
					<td class="text-align-left text-indent text-strong text-orange"
						colspan="3"><img src="${h.hospitalimg}"></td>
				</tr>

				<tr>
					<th>이름</th>
					<td style="text-align: center;"
						class="text-align-left text-indent text-strong text-orange"
						colspan="3">${h.name}</td>
				</tr>

				<tr>
					<th>주소</th>
					<td style="text-align: center;" class="text-align-left text-indent"
						colspan="3">${h.address}</td>
				</tr>


				<tr>
					<th>전화번호</th>
					<td style="text-align: center;" colspan="3">${h.tel}</td>
				</tr>
				
				<tr>
					<th>등록날짜</th>
					<td style="text-align: center;" colspan="3"><fmt:formatDate pattern="yyyy년 MM월 dd일 hh시:mm분:ss초" value="${h.regdate}"/></td>
				</tr>
				
				
			</tbody>
		</table>
	</div>

	<div class="margin-top text-align-center">
		<a class="btn-text btn-cancel" href="list">목록</a>
	</div>

</main>