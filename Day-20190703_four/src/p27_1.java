import java.time.LocalDateTime;

public class p27_1 {

	public static void main(String[] args) {
		int second = LocalDateTime.now().getSecond();// 라이브러리
														// LocalDateTime.now() = 현재시각에서 초
														// getSecond() = 값 가지고오는거
		if (second % 2 == 0) {
			System.out.println(second + "는 짝수입니다.");
		} else {
			System.out.println(second + "는 홀수입니다.");
		}
	}
}
