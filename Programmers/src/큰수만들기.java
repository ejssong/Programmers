import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 큰수만들기 {

	public static void main(String[] args) {
		String number = "1924";
		int k = 2;
		System.out.println(solution(number, k));
	}

	public static String solution(String number, int k) {
		String answer = "";
		String[] num = number.split("");
		String[] result = number.split("");
		// String[] result1 = new String[result.length - k];
		ArrayList<String> result1 = new ArrayList<>();
		Arrays.sort(result, Collections.reverseOrder());

		for (int i = 0; i < result.length - k; i++) {
			// result1[i] = result[i];
			result1.add(result[i]);
		}
		System.out.println(Arrays.toString(result));
		System.out.println(result1);

		for (int i = 0; i < num.length; i++) {

			if (result1.contains(num[i])) {
				System.out.println(num[i]);
				answer += num[i];
			}

		}

		return answer;
	}

}
