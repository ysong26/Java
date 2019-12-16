package p377_1;

public class Client {

	public static void main(String[] args) {
		Lamp lamp=new Lamp();
		//온명령어
		Command lampOnCommand=new LampOnCommand(lamp);
		//오프명령어
		Command lampOffCommand=new LampOffCommand(lamp);
		//온명령어 객체생성
		Button lampButton=new Button(lampOnCommand);
		lampButton.pressed();
		//오프명령어 객체생성
		lampButton.setCommand(lampOffCommand);
		lampButton.pressed();
		
	}

}
