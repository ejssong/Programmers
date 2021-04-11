
public class Q12_ø‰¿œ {

	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		System.out.println(solution(a, b));
	}

	public static String solution(int a, int b) {
		String answer = "";
		String[] day = { "THU","FRI","SAT","SUN","MON","TUE","WEB"};
		int numOfDays = 0;
		int totalDay = 0;

		for (int i = 0; i < a; i++) {
			if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12) {
				numOfDays = 31;
			} else if (a == 2) {
				numOfDays = 29;
			} else {
				numOfDays = 30;
			}
			totalDay += numOfDays;

		}
		totalDay += b;
		
		answer = day[totalDay %7 +1];
		return answer;
	}
}
