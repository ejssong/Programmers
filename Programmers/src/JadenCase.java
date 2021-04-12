
public class JadenCase {

	public static void main(String[] args) {
		String s = "3people unFollowed me";
		System.out.println(solution(s));
		String s1 = "for the last week";
		System.out.println(solution(s1));
	}

	public static String solution(String s) {
	
		StringBuilder sb = new StringBuilder();
		// 전부 다 소문자 처리
		String[] a = s.toLowerCase().split(" ");
		if(s.substring(s.length()-1, s.length()).equals(" ")) {
			a[a.length-1] += " ";
		}
		for (int i = 0; i < a.length; i++) {
			// 첫번째 글자 대문자 처리
			if (a[i].length() >= 1) {
			
				char b = Character.toUpperCase(a[i].charAt(0));
				String c = a[i].substring(1);

				sb.append(b);
		
				sb.append(c);
			}

		}
		String result = a[0];
		

		return sb.toString();
	}

}
