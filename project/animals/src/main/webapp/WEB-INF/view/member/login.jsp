<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<main>
		<form id="form2" method="post">
		<fieldset>
			<legend class="hidden">로그인</legend>
			<table class="table margin-top first">
				<tbody>
				
					<tr>
						<th><label>아이디</label></th>
						<td colspan="3" class="text-align-left indent">
						<input type="text" name="uid" class="id" value=""/>
					</tr>
					
					<tr>
						<th><label>비밀번호</label></th>
						<td colspan="3" class="text-align-left indent">
						<input type="password" name="pwd" class="password" value=""/></td>
					</tr>
					
					
				</tbody>
			</table>
			
			<div>
				<input type="submit" class="jang" value="로그인">
			</div>
					
		</fieldset>
	</form>
</main>