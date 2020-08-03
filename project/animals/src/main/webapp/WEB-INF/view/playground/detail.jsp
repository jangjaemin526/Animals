<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<main>

	<div class="margin-top first">
		<h3 class="hidden">반려견 놀이터 내용</h3>
		<table border="1" class="table">
			<tbody>

				<tr>
					<th style="width: 120px;">반려견 놀이터 이미지</th>
					<td class="text-align-left text-indent text-strong text-orange"
						colspan="3"><img src="${p.playgroundimg}"></td>
				</tr>

				<tr>
					<th>놀이터이름</th>
					<td style="text-align: center;"
						class="text-align-left text-indent text-strong text-orange"
						colspan="3">${p.playgroundname}</td>
				</tr>

				<tr>
					<th>주소</th>
					<td style="text-align: center;" class="text-align-left text-indent"
						colspan="3">${p.address}</td>
				</tr>


				<tr>
					<th>이용시간</th>
					<td style="text-align: center;" colspan="3">${p.opninghour}</td>
				</tr>

				<tr>
					<th>놀이터 설명</th>
					<td style="text-align: center;" colspan="3">${p.explanation}</td>
				</tr>

				<tr>
					<th>등록날짜</th>
					<td style="text-align: center" colspan="3"><fmt:formatDate
							pattern="yyyy년-MM월-dd일 hh시:mm분:ss초" value="${p.regdate}" /></td>
				</tr>

			</tbody>
		</table>
	</div>

	<div class="margin-top text-align-center">
		<a class="prevlist" href="list">목록</a>
	</div>

</main>