package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import global.DispatcherServlet;
import global.ParamMap;
import global.Separator;
import subject.SubjectBean;
import subject.SubjectMemberbean;
import subject.SubjectService;
import subject.SubjectServiceImpl;
import subject.SubjectService;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("member 컨트롤러 진입 접근함");
		HttpSession session = request.getSession(); 
		System.out.println("커맨드 방식----" + request.getParameter("action"));
		Separator.init(request, response);
		SubjectMemberbean sm = new SubjectMemberbean();
		MemberBean member = new MemberBean();
		SubjectBean subject = new SubjectBean();
		MemberService service = MemberServiceImpl.getInstanceImpl();
		SubjectService subjService = SubjectServiceImpl.getInstance();
		switch (Separator.command.getAction()) {

		case "move":
			DispatcherServlet.send(request, response, Separator.command);
			System.out.println("view : " + Separator.command.getDirectory() + "/" + Separator.command.getAction());
			break;
		case "login":
			member.setId(request.getParameter("id"));
			member.setPw(request.getParameter("pw"));
			sm = service.login(member);

			System.out.println("name :::"+sm);
			if (member.getId().equals("fail")) {
				Separator.command.setPage("login");
				Separator.command.setView();
			} else {
				System.out.println("컨트롤러 : 로그인성공");
				
				
				request.setAttribute("user", sm);
				session.setAttribute("user", sm);
			
				Separator.command.setDirectory("global");
				Separator.command.setView();
			}
			DispatcherServlet.send(request, response, Separator.command);
			break;
		case "regist":
			member.setId(request.getParameter("id"));
			member.setPw(request.getParameter("pw"));
			member.setName(request.getParameter("name"));
			member.setEmail(request.getParameter("email"));
			member.setSsn(request.getParameter("ssn"));
			member.setPhone(request.getParameter("phone"));
			member.setRegDate();
			
			System.out.println("전공::::"+request.getParameter("major"));
			request.getParameter("major");
			ParamMap.getValues(request, "subject").toString();
			String msg1 = service.regist(member);
			System.out.println("결과 :::"+msg1);
			if (msg1.equals("")) {
				Separator.command.setPage("regist");
				Separator.command.setView();
			} else {
System.out.println("controller 회원 가입 성공");
				Separator.command.setPage("login");
				Separator.command.setView();
			}
			DispatcherServlet.send(request, response, Separator.command);
			break;
		case"detail":
			
			System.out.println(member);
			/*Separator.command.setPage("find_by_id");
			Separator.command.setView();*/
			// request.setAttribute("member", member);
			DispatcherServlet.send(request, response, Separator.command);
			break;
		case"update":
			member=(MemberBean) session.getAttribute("user");
			member.setEmail(request.getParameter("email"));
			member.setPw(request.getParameter("pw"));
			System.out.println(member);
			service.update(member);
			
			
			
		
			/*String pw = request.getParameter("pw");
			String email = request.getParameter("email");
			
			request.setAttribute("member", member);*/
			// response.sendRedirect(null);
		
			DispatcherServlet.send(request, response, Separator.command);
			break;
		case"delete":
			member=(MemberBean) session.getAttribute("user");
			
			session.invalidate();
			service.delete(member);
			Separator.command.setDirectory("home");
			Separator.command.setPage("main");
			Separator.command.setView();
			DispatcherServlet.send(request, response, Separator.command);
			break;
		case"logout":
			session.invalidate();
			Separator.command.setDirectory("home");
			Separator.command.setPage("main");
			Separator.command.setView();
			DispatcherServlet.send(request, response, Separator.command);
			break;
		case"list":
			request.setAttribute("list", service.list());
			DispatcherServlet.send(request, response, Separator.command);
			break;
		case"find_by_id":
			
			
			request.setAttribute("member",service.findBy(request.getParameter("keyword")));
			DispatcherServlet.send(request, response, Separator.command);
			
			break;
		case"find_by_name":
			request.setAttribute("list",service.findBy(request.getParameter("keyword")));
			DispatcherServlet.send(request, response, Separator.command);
			
			break;
		case"count":
			request.setAttribute("count", service.count());
			Separator.command.setPage("count");
			Separator.command.setView();
			String result1 = Integer.toString(service.count());
			request.setAttribute("result1", result1);
			DispatcherServlet.send(request, response, Separator.command);
			break;
		
		default:
			return;
		}

		//  DispatcherServlet.send(request, response, Separator.command);
	}

	

}