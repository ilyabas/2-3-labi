package by.kurs.commands;


public enum CommandEnum {
	SHOW {
		{
			this.command = new ShowCommand ();
		}
	},
	ADD {
		{
			this.command =  new AddCommand ();
		}
	},
	UPDATE {
		{
			this.command = new UpdateCommand ();
		}
	},
	DELETE {
		{
			this.command = new DeleteCommand ();
		}
	},
	HOME {
		{
			this.command = new HomeCommand ();
		}
	},
	GOINSERT {
		{
			this.command = new GoInsertCommand ();
		}
	},
	GOUPDATE {
		{
			this.command = new GoUpdateCommand ();
		}
	}
	
	;
	
	
	ActionCommand command;
	
	public ActionCommand getCurrentComand (){
		return command;
	}
}
