import java.util.Arrays;

public class n개의최소공배수 {

	public static void main(String[] args) {
		int[] arr = { 2, 6, 8, 14 };
		System.out.print(solution(arr));
	}

	public static int solution(int[] arr) {
		int answer = arr[0];
		Arrays.toString(arr);
		for (int i = 0; i < arr.length; i++) {
			answer = lcm(answer, arr[i]);
		}
		return answer;
	}

	// 최소공배수
	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

	// 최대공약수
	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}

