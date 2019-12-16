import java.time.LocalDateTime;
import java.time.Month;

public class p28_1 {

	public static void main(String[] args) {
		Month month=LocalDateTime.now().getMonth();
		
		switch(month) {
		case MARCH:
		case APRIL:
		case MAY:
			System.out.println(month + "는 봄이다.");
			break;
		case JUNE:
			System.out.println(month + "는 여름이다.");
		case JULY:
			System.out.println(month + "는 여름이다.");
			break;
		default:
			System.out.println(month + "여름.");
				break;
		}
	}
}
