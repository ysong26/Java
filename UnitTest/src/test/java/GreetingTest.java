import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class GreetingTest {
	private Greeting target = new Greeting();
	
	@Test
	public void getMessage_��ħ�λ�() {
		String message=this.target.getMessage(5);
		assertThat(message, is("���� ��ħ�Դϴ�"));
	}

	@Test
	public void getMessag_�����λ�() {
		String message=this.target.getMessage(12);
		assertThat(message, is("�ȳ��ϼ���"));
	}
	
	@Test
	public void getMessage_�����λ�() {
		String message=this.target.getMessage(17);
		assertThat(message, is("���� �����ϴ�"));
	}
	
}
