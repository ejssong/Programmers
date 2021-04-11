import java.util.Arrays;

public class Q15_x¸¸Å­n°³ {

	public static void main(String[] args) {
		int x = 2;
		int n = 5;

		System.out.println(Arrays.toString(solution(x, n)));
	}

	public static long[] solution(int x, int n) {
		long[] answer = new long[n];

		for (int i = 0; i < answer.length; i++) {
			if (i == 0) {
				answer[i] = x;
			} else {
				answer[i] = answer[i - 1] + x;
			}
		}

		return answer;
	}

}
