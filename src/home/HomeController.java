package home;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import global.Command;
import global.DispatcherServlet;
import global.Separator;

@WebServlet("/home.do")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("++++++++++ ");
		Command c = Separator.init(request, response);
		DispatcherServlet.send(request, response, c);
	/* request.getRequestDispatcher("/WEB-INF/global/"+request.getParameter("page")+".jsp").forward(request, response);
		System.out.println(request.getParameter("page"));
		*/
	}

}
