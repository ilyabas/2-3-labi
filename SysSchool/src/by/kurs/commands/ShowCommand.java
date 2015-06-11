package by.kurs.commands;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import by.kurs.Puples;
import by.kurs.database.ClientDAO;
import by.kurs.database.JDBCUtils;

public class ShowCommand implements ActionCommand {
	
	JDBCUtils jdbc = new JDBCUtils();
	
	ClientDAO baza = new ClientDAO();
	
	@Override
	public String execute(HttpServletRequest request) {
		jdbc.init();
		ArrayList<Puples> bazaTest =  new ArrayList<Puples> ();
		bazaTest = baza.showQuery(request.getParameter("sort"));
		request.setAttribute("lst", bazaTest);
		
		return "/result.jsp";
	}
	
}
