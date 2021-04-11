
public class p와y의개수 {

	public static void main(String[] args) {
		String s = "Pyy";
		System.out.println(solution(s));
	}

	public static boolean solution(String s) {
		boolean answer = false;
		String array = s.toLowerCase();
		String[] array1 = array.split("");

		int cnt = 0;
		int cnt1 = 0;
		for (int i = 0; i < array.length(); i++) {
			if (array1[i].equals("p")) {
				cnt += 1;
			}
			if (array1[i].equals("y")) {
				cnt1 += 1;
			}

			if (cnt == cnt1) {
				answer = true;
			} else {
				answer = false;
			}
		}
		System.out.println(cnt);
		System.out.println(cnt1);
		return answer;
	}

}
