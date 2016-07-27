<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="../global/top.jsp" />
<jsp:include page="../global/header.jsp" />
<jsp:include page="../global/nav.jsp" />


<div style="text-align: center">

	<table id="member_detail">
		<tr>
			<td rowspan="6" style="width: 30%"><img
				src="${img }/${user.profileImg}" alt="W3Schools.com" width="200"
				height="200"></td>
			<td style="width: 20%" class="font_bold bg_color_yellow">ID</td>
			<td style="width: 40%">${user.id}</td>
		</tr>
		<tr>
			<td class="font_bold bg_color_yellow">비밀번호</td>
			<td>*******</td>
		</tr>
		<tr>
			<td class="font_bold bg_color_yellow">이 름</td>
			<td>${user.name}</td>
		</tr>

		<tr>
			<td class="font_bold bg_color_yellow">성 별</td>
			<td>남</td>
		</tr>
		<tr>
			<td class="font_bold bg_color_yellow">이메일</td>

			<td>${user.email}</td>

		</tr>
		<tr>
			<td class="font_bold bg_color_yellow">전화번호</td>

			<td>${user.phone}</td>

		</tr>
		<tr>
			<td class="font_bold bg_color_yellow">생년월일</td>
			<td colspan="2">19700814</td>

		</tr>

		<tr>
			<td class="font_bold bg_color_yellow">등록일</td>
			<td colspan="2">${user.reg}</td>
		</tr>
		<tr>
			<td class="font_bold bg_color_yellow">전공</td>
			<td colspan="2">${user.major}</td>
		</tr>
		<tr>
			<td class="font_bold bg_color_yellow">전공과목</td>
			<td colspan="2">${user.subject}</td>
		</tr>
	</table>
	<br /> <a href="${context }/member.do"><img
		src="${img }/member.png" alt="member" style="width: 30px" /></a> <a
		href="${context }/global.do"><img src="${img }/home.png"
		alt="home" style="width: 30px" /></a>
</div>
<jsp:include page="../global/footer.jsp" />
<jsp:include page="../global/end.jsp" />
