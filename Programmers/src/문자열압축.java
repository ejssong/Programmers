import java.util.ArrayList;

public class 문자열압축 {

	public static void main(String[] args) {
		String s = "aabbaccc";
		System.out.println(solution(s));
	}
	public static int solution(String s) {
        int answer = 0;
        
        for(int i = 0; i < s.length() - 1 ; i-- ) {
        	 ArrayList<String> array = new ArrayList<>();
        	 String a = s.substring(i, i + 1);
        	 array.add(a);
        
        	 System.out.println(array);
        }
        return answer;
    }

}
