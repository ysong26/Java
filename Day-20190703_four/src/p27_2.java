import java.time.LocalDateTime;

public class p27_2 {

	public static void main(String[] args) {
		int month = LocalDateTime.now().getMonthValue();// ��=����ð�.�ް���������

		if (3 <= month && month <= 5) {
			System.out.println(month + "���� ���Դϴ�.");
		} else if (6 <= month && month <= 8) {
			System.out.println(month + "���� �����Դϴ�.");
		} else if (9 <= month && month <= 11) {
			System.out.println(month + "���� �����Դϴ�.");
		} else {
			System.out.println(month + "���� �ܿ��Դϴ�.");
		}

	}

}
