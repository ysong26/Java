package awt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest {

	public static void main(String[] args) {
		ButtonEx ex=new ButtonEx();
		
		Frame f=new Frame("��ư �׽�Ʈ"); //�����쿡�� ����Ǹ� ������â�����µ� â��������
										//��ȭ���� ����ũ�μ���Ʈ������ �����̶�θ� ���⿡ ��ư�̳� �̰����� ���ٹ���
										//�ڹٿ����� ������ Frame�̶���
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
