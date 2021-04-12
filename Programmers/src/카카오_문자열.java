import java.util.ArrayList;

public class 카카오_문자열 {

	public static void main(String[] args) {
		String s = "xababcdcdababcdcd";
		System.out.print(solution(s));

	}

	private static char[] solution(String s) {
		int answer = 0; 
		for(int i = 0; i < s.length(); i++) {
			String[] list = compress(s);
		}
		
		return null;
	}

	private static String[] compress(String s) {
		ArrayList<String> result = new ArrayList<>();
		
		String[] a = s.split("", 2);
		System.out.print(a.toString());
		
		
		return null;
	}


}
