
public class 다음큰숫자 {

	public static void main(String[] args) {
		int n = 78;
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		int answer = 0;
		String str = Integer.toBinaryString(n);

		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				num++;
			}
		}
		for (int j = n + 1; j < 1000000; j++) {
			int num1 = 0;
			String str1 = Integer.toBinaryString(j);
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) == '1') {
					num1++;
				}
			}
			if (num1 == num) {
				answer = j;
				break;
			}
		}
		return answer;
	}

}
