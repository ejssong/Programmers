
public class Q11_���� {

	public static void main(String[] args) {
		int n = 1;
		System.out.println(solution(n));
	}

	public static String solution(int n) {
		String answer = "";
		String answer1 = "";
		String str = "����";
		String[] b = str.split("");
		String c = "";
		// n�� ¦���� ��

		for (int j = 1; j <= n/2; j++) {
			for (int i = 0; i < b.length; i++) {
				c = b[i];
				answer += c;
				if (n % 2 != 0) {
					answer1 = answer + b[0];
				}
			}

		}

		if (n % 2 == 0) {
			return answer;
		}else if (n == 1) {
			return b[0];
		}else {
			return answer1;
		}

	}

}
