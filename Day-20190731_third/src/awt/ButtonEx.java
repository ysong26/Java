package awt;

import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;

public class ButtonEx extends Panel{ //패널에서 상속을 받아야됨

	Label label1;
	Button btn1;
	Button btn2;
	
	public ButtonEx( ) {
	label1=new Label("버튼 라벨");
	btn1=new Button("확인");
	btn2=new Button("취소");
	add(label1);
	add(btn1);
	add(btn2);
}
}