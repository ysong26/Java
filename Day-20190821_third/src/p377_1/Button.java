package p377_1;

public class Button {
	private Command command;
	
	public Button(Command NewCommand) {
		this.command=NewCommand;
	}

	public void pressed() {
		command.execute();
	}

	public void setCommand(Command NewCommand) {
		this.command=NewCommand;
	}
	
}
