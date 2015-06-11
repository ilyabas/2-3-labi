package by.kurs;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.kurs.commands.ActionCommand;
import by.kurs.commands.ActionFactory;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
			
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			response.setContentType ("text/html; charset=UTF-8");
			
			String page = null;

			ActionFactory client = new ActionFactory();
			ActionCommand command = client.defineCommand(request);

			page = command.execute(request);

			if (page != null) {
				RequestDispatcher dispatcher =
				getServletContext().getRequestDispatcher(page);

				dispatcher.forward(request, response);
			} else {
			}

	}
}
