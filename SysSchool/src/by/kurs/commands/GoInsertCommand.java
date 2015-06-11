package by.kurs.commands;

import javax.servlet.http.HttpServletRequest;

public class GoInsertCommand implements ActionCommand {

	@Override
	public String execute(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return "/insert.jsp";
	}

}
