package awt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest {

	public static void main(String[] args) {
		ButtonEx ex=new ButtonEx();
		
		Frame f=new Frame("버튼 테스트"); //윈도우에서 실행되면 윈도우창열리는데 창열렸을때
										//이화면을 마이크로소프트에서는 윈폼이라부름 여기에 버튼이나 이것저것 갖다박음
										//자바에서는 윈폼을 Frame이라함
		f.add(ex);
		
		f.pack();
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent w) {
				System.exit(0);
			}
		});
	}

}
