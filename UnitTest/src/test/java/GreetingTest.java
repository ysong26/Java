import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class GreetingTest {
	private Greeting target = new Greeting();
	
	@Test
	public void getMessage_아침인사() {
		String message=this.target.getMessage(5);
		assertThat(message, is("좋은 아침입니다"));
	}

	@Test
	public void getMessag_점심인사() {
		String message=this.target.getMessage(12);
		assertThat(message, is("안녕하세요"));
	}
	
	@Test
	public void getMessage_저녁인사() {
		String message=this.target.getMessage(17);
		assertThat(message, is("수고가 많습니다"));
	}
	
}
