import java.util.Arrays;

public class 문자열다루기 {

	public static void main(String[] args) {
		String s = "1234";
		System.out.println(solution(s));
	}
	public static boolean solution(String s) {
        boolean answer = true;
        char[] array = new char[s.length()];
        int[] array1 = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
        	array[i] = s.charAt(i);
        	array1[i] = (int) array[i];
       
        	if (array1[i] >= 48 && array1[i] <= 57) {
        		answer = true;
        	}else {
        		answer = false;
        		break;
        	}
        	
        }
       
        return answer;
        
    }

}
