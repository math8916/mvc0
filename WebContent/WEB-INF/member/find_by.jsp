<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page= "../global/top.jsp" />
<jsp:include page= "../global/header.jsp" />
<jsp:include page= "../global/nav.jsp" />
<style>
	span.meta{width: 200px; background-color:yellow; float: center}
</style>
	<div style="text-align: center">
	<form action="${context }/member.do" method="get">
	<span class="meta">검색할 ID를 입력해주세요</span><input type="text" name="keyword" placeholder="검색할 ID"> <br/><br/>
	<input type = "hidden" name="action" value="find_by_id">
	<input type = "hidden" name="page" value="find_by_id">
	<input type="submit" value="ID검색">
	<input type="reset" value="취소">
	
	</form>
	<form action="${context }/member.do" method="get">
	<span class="meta">검색할 이름를 입력해주세요</span><input type="text" name="keyword" placeholder="검색할 name"> <br/><br/>
	<input type = "hidden" name="action" value="find_by_name">
	<input type = "hidden" name="page" value="list">
	<input type="submit" value="ID검색">
	<input type="reset" value="취소">
	</form>
	<a href="${context }/member/main.jsp"><img src="${img }/member.png" alt="member" style="width:30px" /></a>
	<a href="${context }/global/main.jsp"><img src="${img }/home.png" alt="home" style="width:30px" /></a>
	</div>
<jsp:include page= "../global/footer.jsp" />
<jsp:include page= "../global/end.jsp" />
