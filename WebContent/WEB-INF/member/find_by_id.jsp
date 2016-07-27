<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:include page= "../global/top.jsp" />
<jsp:include page= "../global/header.jsp" />
<jsp:include page= "../global/nav.jsp" />


	<div style="text-align: center">
			
		<table id="member_detail">
			<tr>
				<td rowspan="6" style="width:30%">
				<img src="${img }/${member.profileImg}" alt="W3Schools.com" width="200"
			height="200"></td>
				<td style="width:20%" class="font_bold bg_color_yellow">ID</td>
				<td style="width:40%">${member.id}</td>
			</tr>
				<tr>
				<td class="font_bold bg_color_yellow">비밀번호</td>
				<td>*******</td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">이 름</td>
				<td>${member.name}</td>
			</tr>
			
			<tr>
				<td class="font_bold bg_color_yellow">성 별</td>
				<td>${member.gender}</td>
			</tr>
				<tr>
				<td class="font_bold bg_color_yellow">이메일</td>
				
				<td>${member.email}</td>
				
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">전화번호</td>
				
				<td>${member.phone}</td>
				
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">생년월일</td>
				<td colspan="2">${member.birth}</td>
				
			</tr>
		
			<tr>
				<td class="font_bold bg_color_yellow">등록일</td>
				<td colspan="2">${member.regDate}</td>
						</tr>
		</table>
		<br/> 
	<a href="${context }/member.do"><img src="${img }/member.png" alt="member" style="width:30px" /></a>
	<a href="${context }/global.do"><img src="${img }/home.png" alt="home" style="width:30px" /></a>
	</div>
<jsp:include page= "../global/footer.jsp" />
<jsp:include page= "../global/end.jsp" />
