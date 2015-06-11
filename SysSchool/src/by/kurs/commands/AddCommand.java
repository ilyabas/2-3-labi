package by.kurs.commands;

import javax.servlet.http.HttpServletRequest;

import by.kurs.database.ClientDAO;
import by.kurs.database.JDBCUtils;

public class AddCommand implements ActionCommand {

	JDBCUtils jdbc = new JDBCUtils();
	ShowCommand cmnd = new ShowCommand();
	ClientDAO baza = new ClientDAO();
	
	@Override
	public String execute(HttpServletRequest request) {
		
				
		baza.insertIntoPuples(
				Integer.parseInt(request.getParameter("id")),
				request.getParameter("name"),
				request.getParameter("surname"),
				Integer.parseInt(request.getParameter("clas")),
				Integer.parseInt(request.getParameter("math")),
				Integer.parseInt(request.getParameter("rus")),
				Integer.parseInt(request.getParameter("english")),
				Integer.parseInt(request.getParameter("id_classhead"))
				);
		
		return cmnd.execute(request);
	}

}
