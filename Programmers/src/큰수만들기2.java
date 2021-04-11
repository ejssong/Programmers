import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 큰수만들기2 {

	public static void main(String[] args) {
		String number = "4177252841";
		int k = 4;
		System.out.println(solution(number, k));
	}

	public static String solution(String number, int k) {
		//k -> 제거할 수 
		//number.length - k = 뽑아야 할 수 
		//k 가 4라면 맨 뒤 4자리를 제외한 문자열 부분에서 가장 큰 수를 찾기 
		StringBuilder answer = new StringBuilder();
		String[] num = number.split("");
		ArrayList<String> array = new ArrayList<String>();
		char max;
		int start = 0;
		int comp = 0;
		for(int i = 0; i < number.length()- k ; i++) {
			comp = 0;
			for(int j = start; j < i+k; j++ ) {
				if(comp < number.charAt(j) - '0'){
                    comp = number.charAt(j) - '0';
                    start = j+1;
                    array.add(i, String.valueOf(number.charAt(i)));
                    //result[i] = num[j];
                }
			}
			answer.append(comp);
		}
		
		System.out.println(array);
		return answer.toString();
	}

}
