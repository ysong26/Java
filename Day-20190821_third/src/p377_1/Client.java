package p377_1;

public class Client {

	public static void main(String[] args) {
		Lamp lamp=new Lamp();
		//�¸�ɾ�
		Command lampOnCommand=new LampOnCommand(lamp);
		//������ɾ�
		Command lampOffCommand=new LampOffCommand(lamp);
		//�¸�ɾ� ��ü����
		Button lampButton=new Button(lampOnCommand);
		lampButton.pressed();
		//������ɾ� ��ü����
		lampButton.setCommand(lampOffCommand);
		lampButton.pressed();
		
	}

}
