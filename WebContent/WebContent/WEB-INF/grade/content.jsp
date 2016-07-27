<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<div style="text-align: center">
		<div style="width: 300px; margin: 0 auto; text-align: left;">
		<h1>성적관리</h1>
			<ol>
				<li><a href="${context }/grade.do?action=regist">등록</a></li>
				<li><a href="${context }/grade.do?action=update">수정</a></li>
				<li><a href="${context }/grade.do?action=de.dolete">삭제</a></li>
				<li><a href="${context }/grade.do?action=list">목록</a></li>
				<li><a href="${context }/grade.do?action=count">카운트</a></li>
				<li><a href="${context }/grade.do?action=search">검색</a></li>
			</ol>
		</div>
	<a href="${context }/global/main.jsp"><img src="${img }/home.png" alt="home" style="width:30px" /></a>
</div>