package bank;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import global.DispatcherServlet;
import global.Separator;
import member.MemberService;
import member.MemberServiceImpl;

/**
 * Servlet implementation class BankController
 */
@WebServlet("/bank.do")
public class BankController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("bank 컨트롤러 진입 접근함");
		System.out.println("커맨드 방식----" + request.getParameter("cmd"));
		Separator.init(request, response);

		AccountService service = AccountServiceImpl.getInstence();
		switch (Separator.command.getAction()) {

		case "regist":

			System.out.println("view : " + Separator.command.getDirectory() + "/" + Separator.command.getAction());
			break;
		case "deposit":	break;
		case "withdraw":break;
		case "update":	break;
		case "delete":	break;
		case "list":	break;
		case "search":	break;
		case "count":	break;
		default:
			return;
		}
		DispatcherServlet.send(request, response, Separator.command);
	}

}