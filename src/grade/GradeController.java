package grade;

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
 * Servlet implementation class GradeController
 */
@WebServlet("/grade.do")
public class GradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("grade 컨트롤러 진입 접근함");
		System.out.println("커맨드 방식----" + request.getParameter("cmd"));
		Separator.init(request, response);

		GradeService service = GradeServiceImpl.getGradeImpl();
		switch (Separator.command.getAction()) {

		case "move":

			System.out.println("view : " + Separator.command.getDirectory() + "/" + Separator.command.getAction());
			break;
		case "login":
			break;
		default:
			return;
		}
		DispatcherServlet.send(request, response, Separator.command);
	}

	public void dispatch(HttpServletRequest request, HttpServletResponse response, String page) throws Exception {
		RequestDispatcher dis = request.getRequestDispatcher("/WEB-INF/member" + page + ".jsp");
		dis.forward(request, response);
	}

}