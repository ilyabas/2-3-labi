package by.kurs.commands;

import javax.servlet.http.HttpServletRequest;


public class EmptyCommand implements ActionCommand {
@Override
	public String execute(HttpServletRequest request) {
		String page = "/main.jsp";
		return page;
	}
}