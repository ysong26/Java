import java.time.LocalDateTime;

public class p27_1 {

	public static void main(String[] args) {
		int second = LocalDateTime.now().getSecond();// ���̺귯��
														// LocalDateTime.now() = ����ð����� ��
														// getSecond() = �� ��������°�
		if (second % 2 == 0) {
			System.out.println(second + "�� ¦���Դϴ�.");
		} else {
			System.out.println(second + "�� Ȧ���Դϴ�.");
		}
	}
}
