package by.kurs.commands;

import javax.servlet.http.HttpServletRequest;

import by.kurs.database.ClientDAO;

public class DeleteCommand implements ActionCommand {

	ClientDAO baza = new ClientDAO();
	
	@Override
	public String execute(HttpServletRequest request) {
		baza.deleteFromKok(Integer.parseInt( request.getParameter("idDel")));
		ShowCommand cmnd = new ShowCommand();
		return cmnd.execute(request);
	}

}
