import java.util.Arrays;

public class 피보나치 {

	public static void main(String[] args) {
		int n = 3;
		System.out.print(solution(n));

	}

	public static int solution(int n) {

		int[] memo = new int[n + 1];

		return fibo(n, memo);

	}

	private static int fibo(int k, int[] memo) {
		if (k == 0) {
			return 0;
		} else if (k == 1) {
			return 1;
		}
		
		if(memo[k] == 0) {
			memo[k] = fibo(k - 1, memo) + fibo(k - 2, memo);
		}
		return memo[k] % 1234567;

	}

}
