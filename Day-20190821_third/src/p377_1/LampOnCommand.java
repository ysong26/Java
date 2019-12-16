package p377_1;

public class LampOnCommand implements Command {

	private Lamp lamp;

	public LampOnCommand(Lamp lamp) {
		this.lamp=lamp;
	}

	@Override
	public void execute() {
		lamp.turnOn();

	}

}
