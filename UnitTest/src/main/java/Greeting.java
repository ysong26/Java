
public class Greeting {
	public String getMessage(int hour) {
		String message;
		if (hour >= 5 && hour<11) {
			message = "���� ��ħ�Դϴ�";
		} else if (hour > 11 && hour <17) {
			message = "�ȳ��ϼ���";
		} else {
			message = "���� �����ϴ�";
		}
		return message;
	}
}
