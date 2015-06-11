package by.kurs.commands;

import javax.servlet.http.HttpServletRequest;

public class HomeCommand implements ActionCommand {

	@Override
	public String execute(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return "/main.jsp";
	}

}

