<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<main>
	<h2 class="main title">회원가입</h2>
	
	<form id="form1" method="post">
		<fieldset>
			<legend class="hidden">회원정보</legend>
			<table class="table margin-top first">
				<tbody>
				
					<tr>
						<th><label>아이디</label></th>
						<td colspan="3" class="text-align-left indent"><input
							id="id-text" type="text" name="uid" class="width-half"
							required="required" value="" placeholder="영문이랑 숫자를 합쳐 20자이내로 입력하세요"
							pattern="^\w{6,20}$" /> 
					</tr>
					
					<tr>
						<th><label>비밀번호</label></th>
						<td colspan="3" class="text-align-left indent"><input
							type="password" name="pwd" class="pass" required
							placeholder="비밀번호 입력" /></td>
					</tr>
					
					<tr>
						<th><label>이름</label></th>
						<td colspan="3" class="text-align-left indent"><input
							class="width-half" name="name" type="text" value=""
							required="required" /></td>
					</tr>
					
					<tr>
						<th><label>성별</label></th>
						<td colspan="3" class="text-align-left indent"><select
							class="width-half" name="gender" required>
								<option value="">선택</option>
								<option value="남성">남성</option>
								<option value="여성">여성</option>
						</select></td>
					</tr>
					
					<tr>
						<th><label>생년월일</label></th>
						<td colspan="3" class="text-align-left indent"><input
							name="birthday" type="date" class="width-half" required
							placeholder="예) 2000-02-17" value="" />
							<input type="radio" name="isLunar" value="0"
							class="vertical-middle margin-hor" checked />양력 <input
							type="radio" name="isLunar" value="1"
							class="vertical-middle margin-hor" />음력</td>
					</tr>
					<tr>
						<th><label>핸드폰번호</label></th>
						<td colspan="3" class="text-align-left indent"><input
							name="phone" type="text" class="width-half"
							pattern="^01[016789]-\d{3,4}-\d{4}$"
							placeholder="예) 010-1111-2222" required value="" /></td>
					</tr>
					
					<tr>
						<th><label>이메일</label></th>
						<td colspan="3" class="text-align-left indent"><input
							name="email" type="email" class="width-half" required
							placeholder="예) user@naver.com" value="" /></td>
					</tr>
					
					<tr>
						<td colspan="4"><input type="hidden" name="" value="" /> <input
							id="submit-Button" type="submit" name="btn" value="확인"
							style="height: 20px; margin: 20px; margin-left:350px; border:2px solid black" class="btn-text btn-default" />
						</td>
					</tr>
					
				</tbody>
			</table>
		</fieldset>
	</form>
</main>
