package awt;

import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;

public class ButtonEx extends Panel{ //�гο��� ����� �޾ƾߵ�

	Label label1;
	Button btn1;
	Button btn2;
	
	public ButtonEx( ) {
	label1=new Label("��ư ��");
	btn1=new Button("Ȯ��");
	btn2=new Button("���");
	add(label1);
	add(btn1);
	add(btn2);
}
}