package global;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberService;
import member.MemberServiceImpl;


@WebServlet("/global.do")
public class GlobalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("global 컨트롤러 진입 접근함");
    	Separator.init(request, response);

		MemberService service = MemberServiceImpl.getInstanceImpl();
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

	

}