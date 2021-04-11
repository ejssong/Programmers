import java.util.Arrays;

public class 숫자뒤집기 {

	public static void main(String[] args) {
		long n = 12345;
		System.out.println(Arrays.toString(solution(n)));
	}

	public static int[] solution(long n) {

		String[] array = (Long.toString(n).split(""));
		int[] answer = new int[array.length];
		int num = 0;
		
		
		for (int i = 0; i < array.length; i++) {
			num = answer.length;
			answer[i] = Integer.parseInt(array[num-i-1]);

		}
		return answer;
	}
}
